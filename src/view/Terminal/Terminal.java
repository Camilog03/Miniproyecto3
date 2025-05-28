package src.view.Terminal;

import java.util.Queue;
import java.util.Scanner;

import src.controller.Controller;
import src.model.characters.Trainer;
import src.view.View;

public class Terminal implements View {

    @Override
    public void showPanel1() {
        Scanner scanner = new Scanner(System.in);

        //Intro
        System.out.println("¡Bienvenido al mundo Pokémon, entrenador!");
        System.out.println("¡Prepárate para una aventura llena de batallas épicas! \nPor favor, ingresa los nombres de los entrenadores que se enfrentarán.");

        //Creating trainers
        System.out.print("Nombre del Entrenador 1: ");
        Trainer trainer1 = new Trainer(scanner.nextLine());
        System.out.print("Nombre del Entrenador 2: ");
        Trainer trainer2 = new Trainer(scanner.nextLine());

        System.out.println("\n\n¡Es hora de que el Entrenador 1 forme su equipo Pokémon!\n\n");

        //menuTrainerDecisions(trainer1, scanner);

        System.out.println("\n\n¡Ahora es el turno del Entrenador 2 para formar su equipo Pokémon!\n\n");

        //menuTrainerDecisions(trainer2, scanner);
    }

    @Override
    public void showPanel2(String blueTrainerName, String redTrainerName, Queue<String> namesBlue,
            Queue<String> namesRed, Queue<Boolean> aliveBlue, Queue<Boolean> aliveRed) {

        byte indexBlue, indexRed;

        while (true) {

        System.out.println("\n\n------ ¡Es momento de elegir a tus Pokémon para la batalla! ------");

            System.out.println("------ Pokemones Entrenador Azul " + blueTrainerName + "-------");
            byte counterBlue = 1,  counterRed = 1;
            while(namesBlue.isEmpty()){
                System.out.println(counterRed + namesBlue.poll());
                counterBlue++;
            }

            System.out.println("Ingrese su pokemon");

            System.out.println("------ Pokemones Entrenador Rojo " + redTrainerName + "-------");
            while(namesBlue.isEmpty()){
                System.out.println(counterRed + namesBlue.poll());
                counterRed++;
            }


    }}

    @Override
    public void showPanel3(String menssageStart, String blueTrainerName, String redTrainerName, String bluePokemonName, String redPokemonName, String bluePath, String redPath, Queue<String> blueAttacks, Queue<String> redAttacks) {

    }

    @Override
    public void updateHP(short hpBlue, short hpRed) {

    }

    @Override
    public void updatePanel2AlivePokemons(Queue<Boolean> aliveBlue, Queue<Boolean> aliveRed) {
        
    }

    @Override
    public void showPanel3() {
        byte round = 1;

        System.out.println("\n\n------ ¡Comienza la Batalla de la Ronda #" + round + "! ------");

        Pokemon attacker = po1;
        Pokemon defender = po2;

        if (po1.getHp() > po2.getHp()) {
            attacker = po2;
            defender = po1;
        }
        while (po1.isAlive() && po2.isAlive()) {

            System.out.println(attacker.getName() + " lanza un ataque feroz contra " + defender.getName() + "!");
            attacker.doAttack(defender, scanner);

            scanner.nextLine();

            System.out.println("\n\n¡" + defender.getName() + " tiene " + defender.getHp() + " puntos de vida restantes!");

            if (!defender.isAlive()) {
                System.out.println("¡" + defender.getName() + " ha caído en combate!");
                System.out.println("¡" + attacker.getName() + " es el vencedor de esta batalla!");
                break;
            }
            System.out.println("\n\n¡Es el turno de " + defender.getName() + " para contraatacar!");

            //Change the attacker and defender
            Pokemon temp = attacker;
            attacker = defender;
            defender = temp;
        }
        if (round == 3) {
            break;
        } else {
            round++;
        }
    }

    @Override
    public void showMessage(String msg) {
        
    }

    @Override
    public void setController(Controller controller) {
    }
}