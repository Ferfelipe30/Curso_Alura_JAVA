package paquete.CursoDeJava.Alura;

/**
 * @author Juan Felipe Fernandez
 */

public class ejercicioMatriz {
    public static void main(String[] args) {
        for(int fila = 0; fila <= 10; fila++){
            for(int columna = 0; columna < fila; columna++){
                if (columna > fila) {
                    break;
                }
                System.out.print("⁕");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
