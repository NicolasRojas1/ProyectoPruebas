import domain.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int opcion = 0;
        //doy 4 opciones
        while (opcion != 4) {
            String valorOpcion = JOptionPane.showInputDialog(null,
                    "Bienvenido a la calculadora de areas, por favor ingrese una opcion\n" +
                            "1. Círculo\n" +
                            "2. Triángulo\n" +
                            "3. Cuadrado\n" +
                            "4. Salir");

            //valido que la opcion ingresada sea un numero
            while (!esNumero(valorOpcion)){
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
                valorOpcion = JOptionPane.showInputDialog("Bienvenido a la calculadora de areas, por favor ingrese una opcion\n" +
                        "1. Círculo\n" +
                        "2. Triángulo\n" +
                        "3. Cuadrado\n" +
                        "4. Salir");
            }
            //si es un numero entonces lo paso por estas opciones
            opcion = Integer.parseInt(valorOpcion);

            switch (opcion) {
                case 1:
                    new Circulo().calcularArea();
                    break;
                case 2:
                    new Triangulo().calcularArea();
                    break;
                case 3:
                    new Cuadrado().calcularArea();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Intente nuevamente.");
            }
        }
    }
    //Metodo para calcular si es numero o no
    public static boolean esNumero(String opcion) {
        try {
            Integer.parseInt(opcion);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
