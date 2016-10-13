package practicas;
import java.util.Scanner;
/**
 * Practica 27 - Crear un programa en Java donde se escriba un mensaje y se 
 * muestre la posición de cada carácter de la cadena con el método charAt().
 * @author escribe tu nombre aqui
 */
public class PosCaracteres {
    public static void main(String[] args){
        // Creamos el objeto leer
        Scanner leer = new Scanner(System.in);
        // Mensajes al usuario
        System.out.println("Visualizar las pocisiones de los caracteres");
        System.out.println("-------------------------------------------");
        // Se ingresa el mensaje
        System.out.print("Ingrese el mensaje: ");
        String mensaje = leer.nextLine();
        // Declaración de variables de tipo String para las pocisiones y
        // los caracteres en posMensaje se guardan las pocisiones y en
        // charMensaje se guardan los caracteres
        String posMensaje = "";
        String charMensaje = "";
        String espacio = "";
        // Recorremos los caracteres que forman el mensaje
        for(int i = 0; i < mensaje.length(); i++){
            // Si los caracteres del mensaje son superiores a 9 agregamos un espacio
            if(i > 9){
                espacio = " ";
            }
            // Concatenaos las pociones del mensaje agregando las nuevas pocisiones
            // al valor ya agregado
            posMensaje = posMensaje + " [ " + i + " ] ";
            // Agregamos los caracteres a cada una de las pocisiones mediante
            // la concatenacion de caracteres
            charMensaje = charMensaje + " [ " + espacio + mensaje.charAt(i) + " ] ";
        }
        // Mostramos la pocisión de cada caracter
        System.out.println(posMensaje);
        // Mostramos cada caracter
        System.out.println(charMensaje);
    }
}


