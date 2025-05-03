package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel3 extends JPanel implements ActionListener {
    private JLabel blueTrainerLabel, bluePokemonLabel, redTrainerLabel, redPokemonLabel;
    private JButton attack1Blue, attack2Blue, attack3Blue, attack1Red, attack2Red, attack3Red;
    private Gui gui;
    private byte indexPokemonBlue;
    private byte indexPokemonRed;
    private boolean isBlueTurn;
    private JLabel redPokemonHpLabel, bluePokemonHpLabel, bluePokemonImage, redPokemonImage;

    public Panel3(Container container, CardLayout cardLayout, Gui gui) {
        this.gui = gui;

        isBlueTurn = gui.getTrainerBlue().getSelectedPokemon(indexPokemonBlue).getSpeed()
                > gui.getTrainerRed().getSelectedPokemon(indexPokemonRed).getSpeed();

        setLayout(new BorderLayout());
        setBackground(new Color(0x8FB5DE));

        JPanel centerPanel = new JPanel(new GridLayout(1, 2, 20, 0));

        // Panel izquierdo (Entrenador azul)
        JPanel leftPanel = new JPanel(new BorderLayout());
        JPanel leftLabelsPanel = new JPanel(new GridLayout(2, 1));
        blueTrainerLabel = new JLabel("", SwingConstants.CENTER);
        blueTrainerLabel.setFont(new Font("Arial", Font.BOLD, 16));
        bluePokemonLabel = new JLabel("", SwingConstants.CENTER);
        bluePokemonLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        leftLabelsPanel.add(blueTrainerLabel);
        leftLabelsPanel.add(bluePokemonLabel);

        // Panel para la imagen y el HP
        JPanel blueImageAndHpPanel = new JPanel(new BorderLayout());


        bluePokemonImage = new JLabel(new ImageIcon(new ImageIcon(gui.getTrainerBlue().getSelectedPokemon(indexPokemonBlue).getPath())
                .getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
        bluePokemonImage.setHorizontalAlignment(SwingConstants.CENTER);

        bluePokemonHpLabel = new JLabel("HP = " + gui.getTrainerBlue().getSelectedPokemon(indexPokemonBlue).getHp(), SwingConstants.CENTER);
        bluePokemonHpLabel.setFont(new Font("Arial", Font.PLAIN, 14));

        blueImageAndHpPanel.add(bluePokemonImage, BorderLayout.CENTER);
        blueImageAndHpPanel.add(bluePokemonHpLabel, BorderLayout.SOUTH);

        JPanel blueButtonsPanel = new JPanel(new GridLayout(3, 1, 10, 10));
        attack1Blue = new JButton(gui.getTrainerBlue().getSelectedPokemon(indexPokemonBlue).getAttacksInstance().get(0).toString());
        attack2Blue = new JButton(gui.getTrainerBlue().getSelectedPokemon(indexPokemonBlue).getAttacksInstance().get(1).toString());
        attack3Blue = new JButton(gui.getTrainerBlue().getSelectedPokemon(indexPokemonBlue).getAttacksInstance().get(2).toString());
        blueButtonsPanel.add(attack1Blue);
        blueButtonsPanel.add(attack2Blue);
        blueButtonsPanel.add(attack3Blue);

        leftPanel.add(leftLabelsPanel, BorderLayout.NORTH);
        leftPanel.add(blueImageAndHpPanel, BorderLayout.CENTER);
        leftPanel.add(blueButtonsPanel, BorderLayout.SOUTH);

        // Panel derecho (Entrenador rojo)
        JPanel rightPanel = new JPanel(new BorderLayout());
        JPanel rightLabelsPanel = new JPanel(new GridLayout(2, 1));
        redTrainerLabel = new JLabel("", SwingConstants.CENTER);
        redTrainerLabel.setFont(new Font("Arial", Font.BOLD, 16));
        redPokemonLabel = new JLabel("", SwingConstants.CENTER);
        redPokemonLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        rightLabelsPanel.add(redTrainerLabel);
        rightLabelsPanel.add(redPokemonLabel);

        // Panel para la imagen y el HP
        JPanel redImageAndHpPanel = new JPanel(new BorderLayout());

        redPokemonImage = new JLabel(new ImageIcon(new ImageIcon(gui.getTrainerRed().getSelectedPokemon(indexPokemonRed).getPath())
                .getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
        redPokemonImage.setHorizontalAlignment(SwingConstants.CENTER);

        redPokemonHpLabel = new JLabel("HP = " + gui.getTrainerRed().getSelectedPokemon(indexPokemonRed).getHp(), SwingConstants.CENTER);
        redPokemonHpLabel.setFont(new Font("Arial", Font.PLAIN, 14));

        redImageAndHpPanel.add(redPokemonImage, BorderLayout.CENTER);
        redImageAndHpPanel.add(redPokemonHpLabel, BorderLayout.SOUTH);

        JPanel redButtonsPanel = new JPanel(new GridLayout(3, 1, 10, 10));
        attack1Red = new JButton(gui.getTrainerRed().getSelectedPokemon(indexPokemonRed).getAttacksInstance().get(0).toString());
        attack2Red = new JButton(gui.getTrainerRed().getSelectedPokemon(indexPokemonRed).getAttacksInstance().get(1).toString());
        attack3Red = new JButton(gui.getTrainerRed().getSelectedPokemon(indexPokemonRed).getAttacksInstance().get(2).toString());
        redButtonsPanel.add(attack1Red);
        redButtonsPanel.add(attack2Red);
        redButtonsPanel.add(attack3Red);

        rightPanel.add(rightLabelsPanel, BorderLayout.NORTH);
        rightPanel.add(redImageAndHpPanel, BorderLayout.CENTER);
        rightPanel.add(redButtonsPanel, BorderLayout.SOUTH);

        centerPanel.add(leftPanel);
        centerPanel.add(rightPanel);

        add(centerPanel, BorderLayout.CENTER);

        updateButtonStates();

        attack1Blue.addActionListener(this);
        attack2Blue.addActionListener(this);
        attack3Blue.addActionListener(this);
        attack1Red.addActionListener(this);
        attack2Red.addActionListener(this);
        attack3Red.addActionListener(this);
    }

    private void updateButtonStates() {

        attack1Blue.setEnabled(isBlueTurn);
        attack2Blue.setEnabled(isBlueTurn);
        attack3Blue.setEnabled(isBlueTurn);

        attack1Red.setEnabled(!isBlueTurn);
        attack2Red.setEnabled(!isBlueTurn);
        attack3Red.setEnabled(!isBlueTurn);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (isBlueTurn) {
            if (e.getSource().equals(attack1Blue)) {
                gui.getTrainerBlue().getSelectedPokemon(indexPokemonBlue).doAttack(gui.getTrainerRed().getSelectedPokemon(indexPokemonRed), (byte) 0);
            } else if (e.getSource().equals(attack2Blue)) {
                gui.getTrainerBlue().getSelectedPokemon(indexPokemonBlue).doAttack(gui.getTrainerRed().getSelectedPokemon(indexPokemonRed), (byte) 1);
            } else if (e.getSource().equals(attack3Blue)) {
                gui.getTrainerBlue().getSelectedPokemon(indexPokemonBlue).doAttack(gui.getTrainerRed().getSelectedPokemon(indexPokemonRed), (byte) 2);
            }
            JOptionPane.showMessageDialog(this, gui.getTrainerRed().getSelectedPokemon(indexPokemonRed).getName()
                    + " recibio " + gui.getTrainerBlue().getSelectedPokemon(indexPokemonBlue).getDamageMadeIt() + " puntos de daño", "Daño recibido", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (e.getSource().equals(attack1Red)) {
                gui.getTrainerRed().getSelectedPokemon(indexPokemonRed).doAttack(gui.getTrainerBlue().getSelectedPokemon(indexPokemonBlue), (byte) 0);
            } else if (e.getSource().equals(attack2Red)) {
                gui.getTrainerRed().getSelectedPokemon(indexPokemonRed).doAttack(gui.getTrainerBlue().getSelectedPokemon(indexPokemonBlue), (byte) 1);
            } else if (e.getSource().equals(attack3Red)) {
                gui.getTrainerRed().getSelectedPokemon(indexPokemonRed).doAttack(gui.getTrainerBlue().getSelectedPokemon(indexPokemonBlue), (byte) 2);
            }
            JOptionPane.showMessageDialog(this, gui.getTrainerBlue().getSelectedPokemon(indexPokemonBlue).getName()
                    + " recibio " + gui.getTrainerRed().getSelectedPokemon(indexPokemonRed).getDamageMadeIt() + " puntos de daño", "Daño recibido", JOptionPane.INFORMATION_MESSAGE);
        }

        updateHpLabels();

        if (!gui.getTrainerBlue().getSelectedPokemon(indexPokemonBlue).isAlive() ||
                !gui.getTrainerRed().getSelectedPokemon(indexPokemonRed).isAlive()) {
            String deadPokemon = gui.getTrainerBlue().getSelectedPokemon(indexPokemonBlue).isAlive()
                    ? gui.getTrainerRed().getSelectedPokemon(indexPokemonRed).getName()
                    : gui.getTrainerBlue().getSelectedPokemon(indexPokemonBlue).getName();
            JOptionPane.showMessageDialog(this, deadPokemon + " ya no puede continuar...\nAcepta para volver al menú.");
            gui.showPanel2();
            return;
        }

        isBlueTurn = !isBlueTurn;
        updateButtonStates();
    }

    public void updateHpLabels(){
        redPokemonHpLabel.setText("HP = " + gui.getTrainerRed().getSelectedPokemon(indexPokemonRed).getHp());
        bluePokemonHpLabel.setText("HP = " + gui.getTrainerBlue().getSelectedPokemon(indexPokemonBlue).getHp());
    }

    public void setBluePokemonImage(ImageIcon bluePokemonImage) {
        this.bluePokemonImage.setIcon(bluePokemonImage);
    }

    public void setRedPokemonImage(ImageIcon redPokemonImage) {
        this.redPokemonImage.setIcon(redPokemonImage);
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

    public void setIndexPokemonBlue(byte indexPokemonBlue) {
        this.indexPokemonBlue = indexPokemonBlue;
    }

    public void setIndexPokemonRed(byte indexPokemonRed) {
        this.indexPokemonRed = indexPokemonRed;
    }
}