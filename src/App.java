package src;

//import src.model.characters.Trainer;
//import src.model.pokemons.*;
//import java.util.ArrayList;
import src.controller.Controller;
import src.model.characters.Trainer;
import src.view.Gui.Gui;
import src.view.Terminal.Terminal;

import javax.naming.ldap.Control;

public class App {
    public static void main(String[] args) {
        Trainer trainerBlue = new Trainer("");
        Trainer trainerRed = new Trainer("");

        //Uso con terminal como primera vista
        Controller controller = new Controller(new Terminal(), trainerBlue, trainerRed, false);
        controller.start();

        //Uso con GUI como primera vista descomentar para probar
        Controller con = new Controller(new Gui(), trainerBlue, trainerRed, true);
        con.start();
    }
}


