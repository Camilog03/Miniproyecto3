package src;

import java.awt.*;
import javax.swing.*;

public class Panel2 extends JPanel {
    private Gui gui;
    private JLabel trainerBlueLabel;
    private JLabel trainerRedLabel;
    private JRadioButton radioButton1Blue, radioButton2Blue, radioButton3Blue;
    private JRadioButton radioButton1Red, radioButton2Red, radioButton3Red;
    private ButtonGroup leftButtonGroup, rightButtonGroup;
    

    public Panel2(Container container, CardLayout cardLayout, Gui gui) {
        this.gui = gui;

        setLayout(new BorderLayout());

        // Panel izquierdo
        JPanel leftPanel = new JPanel(new BorderLayout());
        trainerBlueLabel = new JLabel("", SwingConstants.CENTER); // Nombre del entrenador 1
        trainerBlueLabel.setFont(new Font("Arial", Font.BOLD, 16));
        leftPanel.add(trainerBlueLabel, BorderLayout.NORTH);

        ImageIcon blueTrainerImage = new ImageIcon(new ImageIcon("src/images/blueTrainer.png")
                .getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
        JLabel trainer1Image = new JLabel(blueTrainerImage);
        trainer1Image.setHorizontalAlignment(SwingConstants.CENTER);
        leftPanel.add(trainer1Image, BorderLayout.CENTER);

        JPanel leftRadioPanel = new JPanel(new GridLayout(3, 1, 10, 10));
        radioButton1Blue = new JRadioButton(gui.getTrainerBlue().getSelectedPokemon((byte)0).getName());
        radioButton2Blue = new JRadioButton(gui.getTrainerBlue().getSelectedPokemon((byte)1).getName());
        radioButton3Blue = new JRadioButton(gui.getTrainerBlue().getSelectedPokemon((byte)2).getName());

        radioButton1Blue.setActionCommand("Button1Left");
        radioButton2Blue.setActionCommand("Button2Left");
        radioButton3Blue.setActionCommand("Button3Left");

        leftButtonGroup = new ButtonGroup();
        leftButtonGroup.add(radioButton1Blue);
        leftButtonGroup.add(radioButton2Blue);
        leftButtonGroup.add(radioButton3Blue);

        leftRadioPanel.add(radioButton1Blue);
        leftRadioPanel.add(radioButton2Blue);
        leftRadioPanel.add(radioButton3Blue);
        leftPanel.add(leftRadioPanel, BorderLayout.SOUTH);

        // Panel derecho
        JPanel rightPanel = new JPanel(new BorderLayout());
        trainerRedLabel = new JLabel("", SwingConstants.CENTER); // Nombre del entrenador 2
        trainerRedLabel.setFont(new Font("Arial", Font.BOLD, 16));
        rightPanel.add(trainerRedLabel, BorderLayout.NORTH);

        ImageIcon redTrainerImage = new ImageIcon(new ImageIcon("src/images/redTrainer.png")
                .getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
        JLabel trainer2Image = new JLabel(redTrainerImage);
        trainer2Image.setHorizontalAlignment(SwingConstants.CENTER);
        rightPanel.add(trainer2Image, BorderLayout.CENTER);

        JPanel rightRadioPanel = new JPanel(new GridLayout(3, 1, 10, 10));
        radioButton1Red = new JRadioButton(gui.getTrainerRed().getSelectedPokemon((byte)0).getName());
        radioButton2Red = new JRadioButton(gui.getTrainerRed().getSelectedPokemon((byte)1).getName());
        radioButton3Red = new JRadioButton(gui.getTrainerRed().getSelectedPokemon((byte)2).getName());



        radioButton1Red.setActionCommand("Button1Right");
        radioButton2Red.setActionCommand("Button2Right");
        radioButton3Red.setActionCommand("Button3Right");



        rightButtonGroup = new ButtonGroup();
        rightButtonGroup.add(radioButton1Red);
        rightButtonGroup.add(radioButton2Red);
        rightButtonGroup.add(radioButton3Red);

        rightRadioPanel.add(radioButton1Red);
        rightRadioPanel.add(radioButton2Red);
        rightRadioPanel.add(radioButton3Red);
        rightPanel.add(rightRadioPanel, BorderLayout.SOUTH);

        // Agregar paneles izquierdo y derecho al centro
        JPanel centerPanel = new JPanel(new GridLayout(1, 2, 20, 0));
        centerPanel.add(leftPanel);
        centerPanel.add(rightPanel);
        add(centerPanel, BorderLayout.CENTER);

        // Botón "Empezar Batalla"
        JButton startBattleButton = new JButton("Empezar Batalla");
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(startBattleButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // Acción del botón
        startBattleButton.addActionListener(e -> {
            byte indexPokemonBlue = -1;
            byte indexPokemonRed = -1;

            if (radioButton1Blue.isSelected()) indexPokemonBlue = 0;
            if (radioButton2Blue.isSelected()) indexPokemonBlue = 1;
            if (radioButton3Blue.isSelected()) indexPokemonBlue = 2;

            if (radioButton1Red.isSelected()) indexPokemonRed = 0;
            if (radioButton2Red.isSelected()) indexPokemonRed = 1;
            if (radioButton3Red.isSelected()) indexPokemonRed = 2;

            if (indexPokemonBlue == -1 || indexPokemonRed == -1) {
                JOptionPane.showMessageDialog(this, "Debes seleccionar un Pokémon para ambos entrenadores.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                gui.showPanel3(indexPokemonBlue, indexPokemonRed);
            }
        });

    }

    public void updateAlivePokemons() {
            //limpiar seleccion de los pokemones del entrenador azul
            leftButtonGroup.clearSelection();
            // Desactivar botones del entrenador azul si el Pokémon no está vivo
            radioButton1Blue.setEnabled(gui.getTrainerBlue().getSelectedPokemon((byte) 0).isAlive());
            radioButton2Blue.setEnabled(gui.getTrainerBlue().getSelectedPokemon((byte) 1).isAlive());
            radioButton3Blue.setEnabled(gui.getTrainerBlue().getSelectedPokemon((byte) 2).isAlive());

            //limpiar seleccion de los pokemones del entrenador rojo
            rightButtonGroup.clearSelection();
            // Desactivar botones del entrenador rojo si el Pokémon no está vivo
            radioButton1Red.setEnabled(gui.getTrainerRed().getSelectedPokemon((byte) 0).isAlive());
            radioButton2Red.setEnabled(gui.getTrainerRed().getSelectedPokemon((byte) 1).isAlive());
            radioButton3Red.setEnabled(gui.getTrainerRed().getSelectedPokemon((byte) 2).isAlive());
        }


    // Métodos para configurar los nombres de los entrenadores
    public void setTrainerName1(String name) {
        trainerBlueLabel.setText(name);
    }

    public void setTrainerName2(String name) {
        trainerRedLabel.setText(name);
    }
    
}
