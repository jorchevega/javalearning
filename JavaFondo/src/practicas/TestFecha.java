package practicas;
/**
 * Practica 27 - La clase TestFecha sirve para probar todos los métodos de la 
 * clase Fecha. 
 * @author escribe tu nombre aqui
 */
public class TestFecha {
        public static void main(String[] args) {
        // Instanciamos un objeto de la clase Fecha y asignamos valores a 
        // sus atributos
        Fecha f = new Fecha();
        f.setDia(14);
        f.setMes(10);
        f.setAño(2015);
        
        // Al imprimir el objeto f se llama automáticamente el método toString
        System.out.println(f);
        
        // Instanciamos un segundo objeto de la clase fecha
        Fecha f2 = new Fecha();
        f2.setDia(14);
        f2.setMes(10);
        f2.setAño(2015);
        
        // Imprimimos los valores del objeto f2 utilizando los getters
        System.out.println(f2.getDia() + "/" + f2.getMes() + "/" + f2.getAño());
        
        // Comparamos una fecha
        System.out.println(f2.equals(f));
        
        
        
        // Some modifications
    }
}




