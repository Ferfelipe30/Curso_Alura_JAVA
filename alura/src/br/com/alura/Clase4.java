package br.com.alura;

import br.com.alura.model.Curso;
import java.util.ArrayList;

/**
 * @author Felipe Fernandez
 */

public class Clase4 {
    public static void main(String[] args) {
        Curso Curso1 = new Curso("Geometria", 30);
        Curso Curso2 = new Curso("Fisica", 10);
        Curso Curso3 = new Curso("Quimica", 20);
        Curso Curso4 = new Curso("Historia", 50);
        
        ArrayList<Curso> Cursos = new ArrayList<>();
        Cursos.add(Curso1);
        Cursos.add(Curso2);
        Cursos.add(Curso3);
        Cursos.add(Curso4);
        
        System.out.println(Cursos);
    }
}
