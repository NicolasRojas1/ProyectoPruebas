import javax.swing.*;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        do {
            String valorOpcion = JOptionPane.showInputDialog(null, "Bienvenido al programa de conversiones, por favor seleccione una opción: \n" +
                    "1. Kilometros a Millas\n" +
                    "2. Millas a Kilometros\n" +
                    "3. Libras a Kilogramos\n" +
                    "4. Kilogramos a Libras\n" +
                    "5. Farenheit a Celsius\n" +
                    "6. Celsius a Farenheit\n" +
                    "7. Salir");

            //Pruebo si es posible convertir el caracter a número
            if (esNumero(valorOpcion)){

                //Lo vuelvo un numero para utilizar el switch
                opcion = Integer.parseInt(valorOpcion);

                switch (opcion) {
                    case 1:
                        calcularMillas();
                        break;
                    case 2:
                        calcularKilometros();
                        break;
                    case 3:
                        calcularKilogramos();
                        break;
                    case 4:
                        calcularLibras();
                        break;
                    case 5:
                        calcularCelsius();
                        break;
                    case 6:
                        calcularFarenheit();
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion inválida. Intente nuevamente");
                }
            }
            else {
                //Error si ingresa un caracter distinto a un numero
                JOptionPane.showMessageDialog(null, "Caracter inválido por favor ingresa un número");
            }

        } while (opcion != 7);

    }

    //------- Clase para darle formato a los resultado de tipo Double
    public static DecimalFormat df = new DecimalFormat("###.####");
    //------ Método para calcular de Kilometros a Millas ---------
    private static final double FACTORDECONVERSION = 1.60934;
    public static void calcularMillas() {
        String kilometros = JOptionPane.showInputDialog(null,"Ingrese el valor de kilometros a convertir:");
        double valorKilometros = Double.parseDouble(kilometros);
        double resultado = valorKilometros / FACTORDECONVERSION;
        JOptionPane.showMessageDialog(null, valorKilometros + " kilometros son: " + df.format(resultado) + " millas");
    }

    //------ Método para calcular de Millas a Kilometros ---------
    public static void calcularKilometros() {
        String millas = JOptionPane.showInputDialog(null, "Ingrese el valor de millas a convertir:");
        double valorMillas = Double.parseDouble(millas);
        double resultado = valorMillas * FACTORDECONVERSION;
        JOptionPane.showMessageDialog(null, valorMillas + " millas son: " + df.format(resultado) + " kilometros");
    }

    //----------- Método para calcular libras a Kilogramos -----------
    public static final double FACTORMASA = 0.45359237;
    public static void calcularKilogramos(){
        String libras = JOptionPane.showInputDialog(null, "Ingrese el valor de libras a convertir:");
        double valorLibras = Double.parseDouble(libras);
        double resultado = valorLibras * FACTORMASA;
        JOptionPane.showMessageDialog(null, valorLibras + " libras son: " + df.format(resultado) + " kilogramos");
    }

    public static void calcularLibras(){
        String kilogramos = JOptionPane.showInputDialog(null, "Ingrese el valor de kilogramos a convertir:");
        double valorKilos = Double.parseDouble(kilogramos);
        double resultado = valorKilos / FACTORMASA;
        JOptionPane.showMessageDialog(null, valorKilos + " kilogramos son: " + df.format(resultado) + " libras");
    }

    //----------- Método para calcular farenheit a celsius -----------
    public static void calcularCelsius(){
        String farenheit = JOptionPane.showInputDialog(null, "Ingrese el valor de grados Farenheit a convertir:");
        double valorFarenheit = Double.parseDouble(farenheit);
        double resultado = (5.0/9.0) * (valorFarenheit - 32.0);
        JOptionPane.showMessageDialog(null, valorFarenheit + " grados Farenheit son: " + df.format(resultado) + " grados Celsius");
    }

    //----------- Método para calcular celsius a farenheit-----------
    public static void calcularFarenheit(){
        String celsius = JOptionPane.showInputDialog(null, "Ingrese el valor de grados Celsius a convertir:");
        double valorCelsius = Double.parseDouble(celsius);
        double resultado = 9.0/5.0 * valorCelsius + 32.0;
        JOptionPane.showMessageDialog(null, valorCelsius + " grados Celsius son: " + df.format(resultado) + " grados Farenheit");
    }

    //----------- Metodo para calcular si es numero o no -----------
    public static boolean esNumero(String opcion) {
        try {
            Integer.parseInt(opcion);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}