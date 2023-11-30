package ventanas;
import javax.swing.*;

public class GuiPlayers extends JFrame {
    public GuiPlayers() {

        super("Players");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        JLabel etiqueta = new JLabel("Informacion Oficial", SwingConstants.CENTER);

        JButton boton1 = new JButton("Editar");
        JButton boton2 = new JButton("Guardar cambios");
        JButton boton3 = new JButton("Back");


        etiqueta.setBounds(145, 40, 300, 50);

        boton1.setBounds(100, 200, 100, 40);
        boton2.setBounds(210, 200, 150, 40);
        boton3.setBounds(370,200,100,40);

        //  boton1.addActionListener(this);
        // boton2.addActionListener(this);

        panel.add(etiqueta);

        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);


        add(panel);

        setVisible(true);
    }
}
