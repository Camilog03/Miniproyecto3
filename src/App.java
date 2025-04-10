package src;

import src.characters.Trainer;
import src.pokemons.*;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        //Intro
        System.out.println("------------BIENVENIDO MAESTRO POKEMÓN------------");
        System.out.println("Para empezar este viaje repleto de batallas... \nIngresa los nombres de tus entrenadores");

        //Creating trainers
        System.out.print("Entrenador 1: ");
        Trainer trainer1 = new Trainer(scanner.nextLine());
        System.out.print("Entrenador 2: ");
        Trainer trainer2 = new Trainer(scanner.nextLine());

        System.out.println("\n\n------------Entrenador 1------------\n\n");

        menuTrainerDecisions(trainer1, scanner);

        System.out.println("\n\n------------Entrenador 2------------\n\n");

        menuTrainerDecisions(trainer2, scanner);

        byte round = 1;

        while(true){

            System.out.println("\n\n------Seleccion de Pokemones------");
            trainer1.showPokemons();
            Pokemon po1 = trainer1.selectPokemon(scanner);
            scanner.nextLine();

            trainer2.showPokemons();
            Pokemon po2 = trainer2.selectPokemon(scanner);
            scanner.nextLine();

            System.out.println("\n\n------ Batalla Ronda #"+ round +" ------");

            Pokemon attacker = po1;
            Pokemon defender = po2;

            if (po1.getHp() > po2.getHp()) {
                attacker = po2;
                defender = po1;
            }
            while (po1.isAlive() && po2.isAlive()) {

                System.out.println( attacker.getName() + " ataca a " + defender.getName());
                attacker.doAttack(defender, scanner);

                scanner.nextLine();

                System.out.println("\n\n" + defender.getName() + " tiene " + defender.getHp() + " HP");

                if(!defender.isAlive()){
                    System.out.println(defender.getName() + " ha sido derrotado");
                    System.out.println(attacker.getName() + " ha ganado la batalla");
                    break;
                }
                System.out.println("\n\nTurno de " + defender.getName() + " para atacar");

                //Change the attacker and defender
                Pokemon temp = attacker;
                attacker = defender;
                defender = temp;
            }
            if(round == 3){
                break;
            }else{
                round++;
            }
        }
        winner(trainer1, trainer2);

    }

    public static void menuTrainerDecisions(Trainer trainer, Scanner scanner) {
        //Pokemon assignation for trainers
        System.out.println("\nEntrenador " + trainer.getTrainerName() + " ¿Que deseas hacer? ");
        System.out.println("1. Crear mi propio equipo \n2. Dame un equipo aleatorio");
        System.out.print("Escribe tu opción: ");
        int option = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        while (option != 1 && option != 2) {
            System.out.println("Digita una opción válida");
            System.out.print("Escribe tu opción: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
        }

        switch (option) {
            case 1:
                trainer.addCreatedPokemon(scanner);
                trainer.showPokemons();
                break;
            case 2:
                trainer.randomPokemon();
                trainer.showPokemons();
                break;
        }
    }

    public static void winner(Trainer trainer1, Trainer trainer2){
        for(int i = 0; i < trainer1.getSelectPokemonslist().size(); i++){
            if(trainer1.getSelectPokemonslist().get(i).isAlive()){
                System.out.println("El ganador es " + trainer1.getTrainerName());
                break;
            }else if(trainer2.getSelectPokemonslist().get(i).isAlive()){
                System.out.println("El ganador es " + trainer2.getTrainerName());
                break;
            }
        }
    }
}


