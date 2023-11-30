package ventanas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiTeams extends JFrame { //implements ActionListener{

        public GuiTeams() {

            super("Teams");
            setSize(600, 400);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            panel.setLayout(null);
            JLabel etiqueta = new JLabel("Información oficial", SwingConstants.CENTER);
            JLabel etiqueta2 = new JLabel("Raking FIFA", SwingConstants.CENTER);

            JLabel etiqueta3 = new JLabel("");

            JList lista = new JList<>();

            JButton boton1 = new JButton("Players");
            JButton boton2 = new JButton("Exit");


            etiqueta.setBounds(10, 40, 100, 50);
            lista.setBounds(200,40,100,50);
            etiqueta2.setBounds(10,100, 100,50);
            etiqueta3.setBounds(200,100,100,50);

            boton1.setBounds(100, 200, 150, 40);
            boton2.setBounds(300, 200, 150, 40);

          //  boton1.addActionListener(this);
           // boton2.addActionListener(this);

            panel.add(etiqueta);
            panel.add(etiqueta2);
            panel.add(boton1);
            panel.add(boton2);


            add(panel);

            setVisible(true);

        }
     //   @Override
      //  public void actionPerformed(ActionEvent e) {
       /*     if (e.getActionCommand().equals("Agregar Nuevos Productos")) {
                ventanaAgregar VentanaAgregar = new ventanaAgregar();
                VentanaAgregar.setVisible(true);
            }else if (e.getActionCommand().equals("Buscar Productos")) {
                Biblioteca biblioteca = new Biblioteca();
                VentanaBuscar ventanaBuscar = new VentanaBuscar(biblioteca);
                ventanaBuscar.setVisible(true);
            } else if (e.getActionCommand().equals("Registrar préstamos y devoluciones")) {
                VentanaRegistrar ventanaRegistrar = new VentanaRegistrar();
                ventanaRegistrar.setVisible(true);
            }*/

    }


