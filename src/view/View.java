package src.view;

import src.controller.Controller;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Queue;

public interface View {

    void showPanel1();  // Ej: ingresar datos
    void showPanel2(String blueTrainerName, String redTrainerName, Queue<String> namesBlue, Queue<String> namesRed, Queue<Boolean> aliveBlue, Queue<Boolean> aliveRed);  // Ej: mostrar entrenadores
    void updatePanel2AlivePokemons(Queue<Boolean> aliveBlue, Queue<Boolean> aliveRed);
    void showPanel3();  // Ej: resumen u opciones
    void showMessage(String msg);
    void setController(Controller controller);
}
