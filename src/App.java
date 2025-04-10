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

        //Pokemon asignation
        System.out.println("\nEntrenador " + trainer1.getTrainerName() + " ¿Que deseas hacer? ");
        System.out.println("1. Crear mi propio equipo \n2. Dame un equipo aleatorio");

        System.out.print("Escribe tu opción: "); option = scanner.nextInt();

        switch (option) {
            case 1:

                trainer1.addCreatedPokemon();

            case 2:

                System.out.println("Dame un equipo aleatorio!");

            default:
                break;
        }



    }
}
