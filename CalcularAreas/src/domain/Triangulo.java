package domain;

import javax.swing.*;

public class Triangulo extends FiguraGeometrica{
    @Override
    public void calcularArea() {
        String base = JOptionPane.showInputDialog("Ingrese el valor de la base de la figura:");
        double valorBase = Double.parseDouble(base);
        String altura = JOptionPane.showInputDialog("Ingrese el valor de la altura de la figura:");
        double valorAltura = Double.parseDouble(altura);
        double resultado = (valorBase * valorAltura) / 2;
        JOptionPane.showMessageDialog(null, "El area del triangulo es de: " + resultado);
    }
}
