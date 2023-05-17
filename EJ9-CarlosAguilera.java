package EJERCICIOS;

import java.awt.GridBagLayout;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class EJ9 extends JFrame {

    private JButton boton1, boton2, boton3;
    private JLabel texto;
    private JTextField area1, area2;

    public EJ9() {
        JPanel panel = new JPanel();
        area1 = new JTextField(8);
        area2 = new JTextField(8);
        boton1 = new JButton("Euros a pesetas");
        boton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String textoMoneda = boton1.getText();
                if (textoMoneda.equals("Euros a pesetas")) {
                    boton1.setText("Pesetas a euros");
                } else if (textoMoneda.equals("Pesetas a euros")) {
                    boton1.setText("Euros a pesetas");
                }
            }
        });

        boton2 = new JButton("Cambiar");
        boton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int cantidad = Integer.parseInt(area1.getText());
                    String textoMoneda = boton1.getText();
                    if (textoMoneda.equals("Euros a pesetas")) {
                        double resultado = cantidad * 166.386;
                        area2.setText(String.valueOf(resultado));
                    } else if (textoMoneda.equals("Pesetas a euros")) {
                        double resultado = cantidad / 166.386;
                        area2.setText(String.valueOf(resultado));
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese un valor numérico válido", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        boton3 = new JButton("Borrar");
        boton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area1.setText("");
                area2.setText("");
            }
        });

        texto = new JLabel("Cantidad a convertir");

        panel.add(boton1);
        panel.add(texto);
        panel.add(area1);
        panel.add(boton2);
        panel.add(area2);
        panel.add(boton3);
        add(panel);
        setVisible(true);
        setLocationRelativeTo(null);
        pack();
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EJ9 cambiomoneda = new EJ9();
    }

}
//archivo modificado por carlos aguilera
