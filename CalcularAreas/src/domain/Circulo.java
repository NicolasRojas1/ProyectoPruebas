package domain;

import javax.swing.*;

public class Circulo extends FiguraGeometrica{
    private double radio;

    @Override
    public void calcularArea() {
        String radio = JOptionPane.showInputDialog("Ingrese el radio:");
        double valorRadio = Double.parseDouble(radio);
        double area = Math.pow(valorRadio,2) * Math.PI;
        JOptionPane.showMessageDialog(null, "El area del circulo es de: " + area);
    }
}
