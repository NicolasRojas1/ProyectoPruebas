package domain;

import javax.swing.*;

public class Cuadrado extends FiguraGeometrica{

    @Override
    public void calcularArea() {
        String lado = JOptionPane.showInputDialog("Ingrese el valor del lado:");
        double valorLado = Double.parseDouble(lado);
        double area = valorLado * valorLado;
        JOptionPane.showMessageDialog(null, "El area del cuadrado es de: " + area);
    }
}
