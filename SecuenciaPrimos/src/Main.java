import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        boolean continuar;
        do {
            String valor = JOptionPane.showInputDialog(null, "Ingrese el numero a calcular");
            int intValor = Integer.parseInt(valor);
            listarNumeros(intValor);

            //Pregunto si quisiera intentarlo de nuevo
            //opcion va a guardar la respuesta al si o no
            int opcion = JOptionPane.showOptionDialog(null, "¿Desea realizar otra consulta?","Opciones", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Si", "No"},"Si");
            // Si se selecciona "Si" daria igual a 0 y "No" igual a 1
            //Si 1 == 0 osea Yes, continuar quedaría como "false"
            continuar = (opcion == JOptionPane.YES_OPTION);
        } while(continuar);

    }

    //-------------- Método para calcular numero primo --------------
    public static boolean esPrimo(int numero) {
        // Si el número es menor o igual a 1, no es primo
        if (numero <= 1) {
            return false;
        }
        // Se realiza el ciclo hasta la raiz cuadrada del numero
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            // Si la division modular del numero seleccionado y el numero da 0 indica que no es primo
            if (numero % i == 0) {
                return false;
            }
        }
        // Si no se encontró ningún divisor entre 2 y la raíz cuadrada del número, entonces es primo
        return true;
    }

    //-------------- Metodo para almacenar los numeros primos ---------
    public static void listarNumeros(int numero) {
        List listado = new ArrayList<>();
        for (int i = 2; i <= numero; i++) {
            if (esPrimo(i)) {
                listado.add(i);
            }
        }
        //System.out.println(listado);
        JOptionPane.showMessageDialog(null, "Los numeros primos hasta el numero " + numero + " son: " + listado);
    }
}