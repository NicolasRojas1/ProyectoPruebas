import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        do {
            //--------------- Inicio de Programa -------------------
            String valor = JOptionPane.showInputDialog(null, "Ingresa un numero:");
            int resultado = sumaDigitos(valor);
            JOptionPane.showMessageDialog(null,"La suma de los digitos de " + valor + " es de " + resultado);

            //------------- Metodo para seguir -------------------
            continuarPrograma();
        } while (CONTINUAR);
    }

    // ------------------ Variable global ---------------------
    public static boolean CONTINUAR = true;
//---------------- Metodo para sumar digitos ----------------
    public static int sumaDigitos(String numero){
        char[] numeros = numero.toCharArray();
        int i = 0;
        int suma = 0;

        while (i < numeros.length) {
            System.out.println(numeros[i]);
            suma += Integer.parseInt(String.valueOf(numeros[i]));
            i++;
        }
        return suma;
    }

    //--------- Metodo para seguir ejecutando el programa -----------
    public static void continuarPrograma(){
        boolean continuar = true;
        int opcion = JOptionPane.showOptionDialog(null, "¿Deseas intentarlo de nuevo?", "Opciones", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Si", "No"}, "Si");

        if (opcion == JOptionPane.NO_OPTION || opcion == JOptionPane.CLOSED_OPTION || opcion == -1){
            CONTINUAR = false;
        }
    }
}