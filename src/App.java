package src;

import src.characters.Trainer;
import src.pokemons.*;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Variables
        int option;

        Scanner scanner = new Scanner(System.in);

        //Intro
        System.out.println("------------BIENVENIDO MAESTRO POKEMÓN------------");
        System.out.println("Para empezar este viaje repleto de batallas... \nIngresa los nombres de tus entrenadores");

        //Creating trainers
        System.out.print("Entrenador 1: ");
        Trainer trainer1 = new Trainer(scanner.nextLine());
        System.out.print("Entrenador 2: ");
        Trainer trainer2 = new Trainer(scanner.nextLine());

        //Pokemon asignation for trainer 1
        System.out.println("\nEntrenador " + trainer1.getTrainerName() + " ¿Que deseas hacer? ");
        System.out.println("1. Crear mi propio equipo \n2. Dame un equipo aleatorio");

        System.out.print("Escribe tu opción: ");
        option = scanner.nextInt();

        while (option != 1 && option != 2) {
            System.out.println("Digita una opción válida");
            System.out.print("Escribe tu opción: ");
            option = scanner.nextInt();
        }

        switch (option) {
            case 1:
            trainer1.addCreatedPokemon();
            trainer1.showPokemons();
            break;
            case 2:
            trainer1.randomPokemon();
            trainer1.showPokemons();
            break;
        }

        System.out.println("\n\n------------Ahora es el turno del Entrenador 2------------\n\n");

        //Pokemon asignation for trainer 2
        System.out.println("\nEntrenador " + trainer2.getTrainerName() + " ¿Que deseas hacer? ");
        System.out.println("1. Crear mi propio equipo \n2. Dame un equipo aleatorio");

        System.out.print("Escribe tu opción: ");
        option = scanner.nextInt();

        while (option != 1 && option != 2) {
            System.out.println("Digita una opción válida");
            System.out.print("Escribe tu opción: ");
            option = scanner.nextInt();
        }
        switch (option) {
            case 1:
            trainer2.addCreatedPokemon();
            trainer2.showPokemons();
            break;
            case 2:
            trainer2.randomPokemon();
            trainer2.showPokemons();
            break;
        }

        
    }
}
