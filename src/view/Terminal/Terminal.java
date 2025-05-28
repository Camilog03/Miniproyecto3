package src.view.Terminal;

import java.util.Queue;
import java.util.Scanner;

import src.controller.Controller;
import src.model.characters.Trainer;
import src.model.pokemons.Pokemon;
import src.view.View;

public class Terminal implements View {
    private Scanner scanner = new Scanner(System.in);
    private Controller controller;
    private short hpBlue, hpRed;

    @Override
    public void showPanel1() {
        String trainerBlue, trainerRed;
        //Intro
        System.out.println("¡Bienvenido al mundo Pokémon, entrenador!");
        System.out.println("¡Prepárate para una aventura llena de batallas épicas! \nPor favor, ingresa los nombres de los entrenadores que se enfrentarán.");

        //Creating trainers
        System.out.print("Nombre del Entrenador 1: ");
        trainerBlue = scanner.nextLine();
        System.out.print("Nombre del Entrenador 2: ");
        trainerRed = scanner.nextLine();
        controller.setTrainersNames(trainerBlue, trainerRed);
        controller.goToPanel2();
    }

    @Override
    public void showPanel2(String blueTrainerName, String redTrainerName, Queue<String> namesBlue,
            Queue<String> namesRed, Queue<Boolean> aliveBlue, Queue<Boolean> aliveRed) {

        byte indexBlue, indexRed;

        System.out.println("\n\n------ ¡Es momento de elegir a tus Pokémon para la batalla! ------");

        System.out.println("------ Pokemones Entrenador Azul " + blueTrainerName + "-------");
        byte counterBlue = 1,  counterRed = 1;
        while(!namesBlue.isEmpty()){
            System.out.println(counterBlue + ". "+ namesBlue.poll() + " - "+ (aliveBlue.poll() ? "Vivo":"Derrotado"));
            counterBlue++;
        }

        System.out.print("Ingrese su pokemon:");
        indexBlue = scanner.nextByte();

        System.out.println("------ Pokemones Entrenador Rojo " + redTrainerName + "-------");
        while(!namesRed.isEmpty()){
            System.out.println(counterRed + ". " + namesRed.poll() + " - "+ (aliveRed.poll() ? "Vivo":"Derrotado"));
            counterRed++;
        }
        System.out.print("Ingrese su pokemon:");
        indexRed = scanner.nextByte();
        controller.goToPanel3(indexBlue, indexRed);

    }

    @Override
    public void showPanel3(String menssageStart, String blueTrainerName, String redTrainerName, String bluePokemonName, String redPokemonName, String bluePath, String redPath, Queue<String> blueAttacks, Queue<String> redAttacks, boolean turn) {
        
        showMessage(menssageStart);

        System.out.println("\n\n------ ¡Comienza la Batalla! ------");
        while (hpBlue > 0 && hpRed > 0) {
            byte indexAttack = -1;

            String attacker = (turn ? bluePokemonName:redPokemonName);
            String defender = (!turn ? bluePokemonName:redPokemonName);

            System.out.println(attacker + " lanza un ataque feroz contra " + defender + "!");
            System.out.println("------ Ataques ------");
            byte counter = 0;
            if (turn) {
                while (!blueAttacks.isEmpty()) {
                    System.out.println(counter + ". " + blueAttacks.poll());
                }
            }else{
                while (!redAttacks.isEmpty()) {
                    System.out.println(counter + ". " + redAttacks.poll());
                }
            }
            System.out.print("Selecciona tu ataque: ");
            indexAttack = scanner.nextByte() ;
            indexAttack--;

            if (turn) {
                controller.blueMakeDamage(indexAttack);
            }else{
                controller.redMakeDamage(indexAttack);
            }
            System.out.println("Vida actual de " + defender + (turn ? hpBlue:hpRed));
            //Change the attacker and defender
            turn = !turn;
           
        }
        controller.checkAlivePokemon();
    }

    @Override
    public void updateHP(short hpBlue, short hpRed) {
        this.hpBlue = hpBlue;
        this.hpRed = hpRed;
    }

    @Override
    public void showMessage(String msg) {
        System.out.println(msg);
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }
}