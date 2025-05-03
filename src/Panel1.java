package src;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;

public class Panel1 extends JPanel {

    private Gui gui;
    private Container container;
    private CardLayout cardLayout;
    private JLabel trainerLabel1, trainerLabel2, titleLabel;
    private JTextField trainerName1, trainerName2;
    private JButton startButton;
    private ImageIcon blueTrainerImage, redTrainerImage, titleImage;

    public Panel1(Container container, CardLayout cardLayout, Gui gui) {
        this.container = container;
        this.cardLayout = cardLayout;
        this.gui = gui;

        setLayout(new BorderLayout());

        titleImage = new ImageIcon(new ImageIcon("src/images/battleTitle.png")
                .getImage().getScaledInstance(350, 200, Image.SCALE_SMOOTH));
        titleLabel = new JLabel(titleImage);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER); 
        add(titleLabel, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel(new GridLayout(1, 2, 20, 0)); 

        JPanel leftPanel = new JPanel(new BorderLayout());
        blueTrainerImage = new ImageIcon(new ImageIcon("src/images/blueTrainer.png")
                .getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
        JLabel trainer1Image = new JLabel(blueTrainerImage);
        trainer1Image.setHorizontalAlignment(SwingConstants.CENTER);
        trainerLabel1 = new JLabel("Entrenador Rojo:");
        trainerLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        trainerName1 = new JTextField(5);
        leftPanel.add(trainer1Image, BorderLayout.NORTH);
        leftPanel.add(trainerLabel1, BorderLayout.CENTER);
        leftPanel.add(trainerName1, BorderLayout.SOUTH);

        JPanel rightPanel = new JPanel(new BorderLayout());
        redTrainerImage = new ImageIcon(new ImageIcon("src/images/redTrainer.png")
                .getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
        JLabel trainer2Image = new JLabel(redTrainerImage);
        trainer2Image.setHorizontalAlignment(SwingConstants.CENTER);
        trainerLabel2 = new JLabel("Entrenador Azul:");
        trainerLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        trainerName2 = new JTextField(5);
        rightPanel.add(trainer2Image, BorderLayout.NORTH);
        rightPanel.add(trainerLabel2, BorderLayout.CENTER);
        rightPanel.add(trainerName2, BorderLayout.SOUTH);

        centerPanel.add(leftPanel);
        centerPanel.add(rightPanel);
        add(centerPanel, BorderLayout.CENTER);

        startButton = new JButton("Start Game");
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBorder(new EmptyBorder(10, 0, 10, 0));
        buttonPanel.add(startButton);
        add(buttonPanel, BorderLayout.SOUTH);

        startButton.addActionListener(e -> checkTextFields());
    }

    private void checkTextFields() {
        if (trainerName1.getText().isEmpty() || trainerName2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debes llenar ambos campos", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "¡Ambos campos están llenos! Iniciando juego...", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            gui.getTrainerBlue().setTrainerName(trainerName1.getText());
            gui.getTrainerRed().setTrainerName(trainerName2.getText());
            ((Gui) SwingUtilities.getWindowAncestor(this)).showPanel2();
        }

    }
}
