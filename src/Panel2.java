package src;
import src.characters.Trainer;

import java.awt.*;
import javax.swing.*;

public class Panel2 extends JPanel {
    private Gui gui;
    private JLabel trainer1Label;
    private JLabel trainer2Label;
    private JRadioButton radioButton1Left, radioButton2Left, radioButton3Left;
    private JRadioButton radioButton1Right, radioButton2Right, radioButton3Right;

    public Panel2(Container container, CardLayout cardLayout, Gui gui) {
        this.gui = gui;

        setLayout(new BorderLayout());

        // Panel izquierdo
        JPanel leftPanel = new JPanel(new BorderLayout());
        trainer1Label = new JLabel("", SwingConstants.CENTER); // Nombre del entrenador 1
        trainer1Label.setFont(new Font("Arial", Font.BOLD, 16));
        leftPanel.add(trainer1Label, BorderLayout.NORTH);

        ImageIcon blueTrainerImage = new ImageIcon(new ImageIcon("src/images/blueTrainer.png")
                .getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
        JLabel trainer1Image = new JLabel(blueTrainerImage);
        trainer1Image.setHorizontalAlignment(SwingConstants.CENTER);
        leftPanel.add(trainer1Image, BorderLayout.CENTER);

        JPanel leftRadioPanel = new JPanel(new GridLayout(3, 1, 10, 10));
        radioButton1Left = new JRadioButton("Pikachu");
        radioButton2Left = new JRadioButton("Charmander");
        radioButton3Left = new JRadioButton("Squirtle");

        ButtonGroup leftButtonGroup = new ButtonGroup();
        leftButtonGroup.add(radioButton1Left);
        leftButtonGroup.add(radioButton2Left);
        leftButtonGroup.add(radioButton3Left);

        leftRadioPanel.add(radioButton1Left);
        leftRadioPanel.add(radioButton2Left);
        leftRadioPanel.add(radioButton3Left);
        leftPanel.add(leftRadioPanel, BorderLayout.SOUTH);

        // Panel derecho
        JPanel rightPanel = new JPanel(new BorderLayout());
        trainer2Label = new JLabel("", SwingConstants.CENTER); // Nombre del entrenador 2
        trainer2Label.setFont(new Font("Arial", Font.BOLD, 16));
        rightPanel.add(trainer2Label, BorderLayout.NORTH);

        ImageIcon redTrainerImage = new ImageIcon(new ImageIcon("src/images/redTrainer.png")
                .getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
        JLabel trainer2Image = new JLabel(redTrainerImage);
        trainer2Image.setHorizontalAlignment(SwingConstants.CENTER);
        rightPanel.add(trainer2Image, BorderLayout.CENTER);

        JPanel rightRadioPanel = new JPanel(new GridLayout(3, 1, 10, 10));
        radioButton1Right = new JRadioButton("Bulbasaur");
        radioButton2Right = new JRadioButton("Raichu");
        radioButton3Right = new JRadioButton("Mewtwo");

        ButtonGroup rightButtonGroup = new ButtonGroup();
        rightButtonGroup.add(radioButton1Right);
        rightButtonGroup.add(radioButton2Right);
        rightButtonGroup.add(radioButton3Right);

        rightRadioPanel.add(radioButton1Right);
        rightRadioPanel.add(radioButton2Right);
        rightRadioPanel.add(radioButton3Right);
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
            String selectedPokemonLeft = getSelectedPokemonLeft();
            String selectedPokemonRight = getSelectedPokemonRight();

            if (selectedPokemonLeft == null || selectedPokemonRight == null) {
                JOptionPane.showMessageDialog(this, "Debes seleccionar un Pokémon para ambos entrenadores.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                gui.showPanel3(selectedPokemonLeft, selectedPokemonRight);
            }
        });
    }

    // Métodos para configurar los nombres de los entrenadores
    public void setTrainerName1(String name) {
        trainer1Label.setText(name);
    }

    public void setTrainerName2(String name) {
        trainer2Label.setText(name);
    }

    // Métodos para obtener el Pokémon seleccionado
    private String getSelectedPokemonLeft() {
        if (radioButton1Left.isSelected()) return "Pikachu";
        if (radioButton2Left.isSelected()) return "Charmander";
        if (radioButton3Left.isSelected()) return "Squirtle";
        return null;
    }

    private String getSelectedPokemonRight() {
        if (radioButton1Right.isSelected()) return "Bulbasaur";
        if (radioButton2Right.isSelected()) return "Raichu";
        if (radioButton3Right.isSelected()) return "Mewtwo";
        return null;
    }
}
