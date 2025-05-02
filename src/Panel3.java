package src;

import javax.swing.*;
import java.awt.*;

public class Panel3 extends JPanel {
    private JLabel blueTrainerLabel;
    private JLabel redTrainerLabel;
    private JLabel bluePokemonLabel;
    private JLabel redPokemonLabel;

    public Panel3(Container container, CardLayout cardLayout) {
        setLayout(new BorderLayout());
        setBackground(new Color(0xA0C8F0));

        JPanel centerPanel = new JPanel(new GridLayout(1, 2, 20, 0));

        // Panel izquierdo (Entrenador azul)
        JPanel leftPanel = new JPanel(new BorderLayout());
        JPanel leftLabelsPanel = new JPanel(new GridLayout(2, 1)); 
        blueTrainerLabel = new JLabel("", SwingConstants.CENTER); 
        blueTrainerLabel.setFont(new Font("Arial", Font.BOLD, 16));
        bluePokemonLabel = new JLabel("Pokemon: Pikachu", SwingConstants.CENTER); 
        bluePokemonLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        leftLabelsPanel.add(blueTrainerLabel);
        leftLabelsPanel.add(bluePokemonLabel);

        ImageIcon bluePokemonImageIcon = new ImageIcon(new ImageIcon("src/images/pokemonsImages/electric/mareep.png")
                .getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
        JLabel bluePokemonImage = new JLabel(bluePokemonImageIcon);
        bluePokemonImage.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel blueButtonsPanel = new JPanel(new GridLayout(3, 1, 10, 10)); // Botones en columna
        JButton attack1Blue = new JButton("Ataque 1");
        JButton attack2Blue = new JButton("Ataque 2");
        JButton attack3Blue = new JButton("Ataque 3");
        blueButtonsPanel.add(attack1Blue);
        blueButtonsPanel.add(attack2Blue);
        blueButtonsPanel.add(attack3Blue);

        leftPanel.add(leftLabelsPanel, BorderLayout.NORTH);
        leftPanel.add(bluePokemonImage, BorderLayout.CENTER);
        leftPanel.add(blueButtonsPanel, BorderLayout.SOUTH);

        // Panel derecho (Entrenador rojo)
        JPanel rightPanel = new JPanel(new BorderLayout());
        JPanel rightLabelsPanel = new JPanel(new GridLayout(2, 1)); 
        redTrainerLabel = new JLabel("", SwingConstants.CENTER); 
        redTrainerLabel.setFont(new Font("Arial", Font.BOLD, 16));
        redPokemonLabel = new JLabel("Pokemon: Charmander", SwingConstants.CENTER); 
        redPokemonLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        rightLabelsPanel.add(redTrainerLabel);
        rightLabelsPanel.add(redPokemonLabel);

        ImageIcon redPokemonImageIcon = new ImageIcon(new ImageIcon("src/images/pokemonsImages/plant/bellsprout.png")
                .getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
        JLabel redPokemonImage = new JLabel(redPokemonImageIcon);
        redPokemonImage.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel redButtonsPanel = new JPanel(new GridLayout(3, 1, 10, 10)); 
        JButton attack1Red = new JButton("Ataque 1");
        JButton attack2Red = new JButton("Ataque 2");
        JButton attack3Red = new JButton("Ataque 3");
        redButtonsPanel.add(attack1Red);
        redButtonsPanel.add(attack2Red);
        redButtonsPanel.add(attack3Red);

        rightPanel.add(rightLabelsPanel, BorderLayout.NORTH);
        rightPanel.add(redPokemonImage, BorderLayout.CENTER);
        rightPanel.add(redButtonsPanel, BorderLayout.SOUTH);

        centerPanel.add(leftPanel);
        centerPanel.add(rightPanel);

        add(centerPanel, BorderLayout.CENTER);
    }

    public void setBlueTrainerName(String name) {
        blueTrainerLabel.setText("Entrenador azul: " + name);
    }

    public void setRedTrainerName(String name) {
        redTrainerLabel.setText("Entrenador rojo: " + name);
    }

    public void setBluePokemonName(String name) {
        bluePokemonLabel.setText("Pokemon: " + name);
    }

    public void setRedPokemonName(String name) {
        redPokemonLabel.setText("Pokemon: " + name);
    }
}
