import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Variable para verificar al finalizar la ejecucion
        boolean continuar = true;
        do {
            String input = JOptionPane.showInputDialog(null, "Ingresa un número entero positivo:");

            //Confirmo si el String puede convertirse a int
            int numero = 0;
            try {
                numero = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingresa un número válido.");
                //Pide otra vez el caracter
                continue;
            }

            //Empleo el metodo
            if (esPrimo(numero)) {
                JOptionPane.showMessageDialog(null, numero + " es un número primo.");
            } else {
                JOptionPane.showMessageDialog(null, numero + " no es un número primo.");
            }

            //Pregunto al usuario si desea intentarlo de nuevo o salir del programa
            int opcion = JOptionPane.showOptionDialog(null, "¿Deseas intentarlo de nuevo?", "Opción", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Sí", "No"}, "Sí");

            //Si la opcion es No cambia la variable "continuar" a falso y cierra el programa
            if (opcion == JOptionPane.NO_OPTION || opcion == JOptionPane.CLOSED_OPTION || opcion == -1) {
                continuar = false;
            }

        } while (continuar); //Seguira ejecutandose mientras sea true
    }
    public static boolean esPrimo(int numero) {
        //Primero verifico de 1 a los negativos
        if (numero <= 1) {
            return false;
        }
        //Verifico si el número es divisible por algún otro número
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            // Si es divisible, no es primo
            if (numero % i == 0) {
                return false;
            }
        }
        //Si no se encontró ningún divisor entre 2 y la raíz cuadrada del número, entonces es primo
        return true;
    }
}