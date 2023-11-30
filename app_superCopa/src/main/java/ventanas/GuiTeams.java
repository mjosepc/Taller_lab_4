package ventanas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.util.HashMap;
import java.util.Map;

public class GuiTeams extends JFrame implements ActionListener {

    private Map<String, ImageIcon> Bandera;
    public GuiTeams() {

        super("Teams");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        JLabel etiqueta = new JLabel("Equipos", SwingConstants.CENTER);
        JLabel etiqueta2 = new JLabel("Raking FIFA", SwingConstants.CENTER);

        JLabel etiqueta3 = new JLabel("");
        JLabel etiqueta4 = new JLabel("");

        Bandera = new HashMap<>();
        cargarBanderas();

        JComboBox comboBox = new JComboBox();

        comboBox.addItem("Australia");
        comboBox.addItem("Chile");
        comboBox.addItem("Camerun");
        comboBox.addItem("Alemania");

        comboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    String selectedCountry = (String) comboBox.getSelectedItem();
                    ImageIcon selectedFlag = Bandera.get(selectedCountry);
                    etiqueta4.setIcon(selectedFlag);
                }
            }
        });


        JButton boton1 = new JButton("Jugadores");
        JButton boton2 = new JButton("Exit");

        etiqueta.setBounds(10, 40, 100, 50);
        comboBox.setBounds(100, 40, 200, 50);
        etiqueta2.setBounds(10, 100, 100, 50);
        etiqueta3.setBounds(200, 100, 100, 50);
        etiqueta4.setBounds(250,40,100,50);

        boton1.setBounds(100, 200, 150, 40);
        boton2.setBounds(300, 200, 150, 40);

        boton1.addActionListener(this);
        boton2.addActionListener(this);


        panel.add(etiqueta);
        panel.add(etiqueta2);
        panel.add(etiqueta3);
        panel.add(etiqueta4);
        panel.add(comboBox);
        panel.add(boton1);
        panel.add(boton2);

        add(panel);

        setVisible(true);
    }
    private void cargarBanderas() {
        Bandera.put("Australia", new ImageIcon("C:\\Taller_lab_4\\app_superCopa\\src\\main\\java\\Data/aus.png"));
        Bandera.put("Chile", new ImageIcon("C:\\Taller_lab_4\\app_superCopa\\src\\main\\java\\Data/chi.png"));
        Bandera.put("Camerún", new ImageIcon("C:\\Taller_lab_4\\app_superCopa\\src\\main\\java\\Data/cmr.png"));
        Bandera.put("Alemania", new ImageIcon("C:\\Taller_lab_4\\app_superCopa\\src\\main\\java\\Data/ger.png"));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Jugadores")) {
            GuiPlayers guiPlayers = new GuiPlayers();
            guiPlayers.setVisible(true);

        }
    }
}
