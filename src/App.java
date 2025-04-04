import Pokemons.*;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int option;
        ArrayList<Pokemon> list = new ArrayList<Pokemon>();

        Scanner scanner = new Scanner(System.in);

        //Inicio menú
        System.out.println("-----------¡¡¡BINVENIDO AVENTURERO!!!-----------");
        System.out.println("");
        System.out.println("Para empezar, escribe los nombres de los entrendores: ");
        //Creación entrenadores
        Entrenador entrenador1 = new Entrenador(null, null);
        Entrenador entrenador2 = new Entrenador(null, null);
        //Asignación nombres de entrenadores
        System.out.print("Nombre entrenador 1: ");
        entrenador1.setTrainerName(scanner.nextLine());
        System.out.print("Nombre entrenador 2: ");
        entrenador2.setTrainerName(scanner.nextLine());
        /* 
        System.out.println(entrenador1.getTrainerName());
        System.out.println(entrenador2.getTrainerName());
        */
        Pokemon pikachu = new Pokemon("Picachú");
        Pokemon charizard = new Pokemon("Charizard");
        Pokemon squirtl = new Pokemon("squirtl");

        System.out.println("¡¡Perfecto!! Ahora pasemos a elegir tu equipo poquemón");
        System.out.println("Entrenador " + entrenador1.getTrainerName() + " Deseas crear tu equipo? ");
        System.out.println("1. Crear equipo");
        System.out.println("2. Dame un equipo aleatorio");
        System.out.print("Digita tu opción: ");
        option = scanner.nextInt();

        if(option == 1){
            for(int i=1; i<3; i++){
                System.out.println("Ingresa el nombre del pokemón " + i + ":");
                Pokemon created = new Pokemon(scanner.nextLine());
                list.add(created);

            }
            
        }
        else if (option == 2){
            list.add(pikachu);
            list.add(charizard);
            list.add(squirtl);
            entrenador1.setList(list);

            System.out.println("Tu equipo es: ");
            System.out.println("1. " + pikachu.getPokemonName());
            System.out.println("2. " + charizard.getPokemonName());
            System.out.println("3. " + squirtl.getPokemonName());

            
        }
    }
}
