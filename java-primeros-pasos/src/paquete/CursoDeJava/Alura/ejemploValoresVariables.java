package paquete.CursoDeJava.Alura;

/**
 * @author Juan Felipe Fernandez
 */

public class ejemploValoresVariables {
    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 9;
        
        System.out.println(numero2);
        
        numero2 = numero1;
        System.out.println(numero2);
        
        numero1 = 88;
        //numero2 = ???
        System.out.println(numero2);
    }
}
