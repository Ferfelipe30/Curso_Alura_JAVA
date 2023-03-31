package br.com.alura;

import br.com.alura.model.Curso;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Felipe Fernandez
 */

public class Clase9 {
    public static void main(String[] args) {
        Curso Curso1 = new Curso("Historia", 30);
        Curso Curso2 = new Curso("Algebra", 10);
        Curso Curso3 = new Curso("Aritmetica", 20);
        Curso Curso4 = new Curso("Geometria", 50);
        
        ArrayList<Curso> Cursos = new ArrayList<>();
        Cursos.add(Curso1);
        Cursos.add(Curso2);
        Cursos.add(Curso3);
        Cursos.add(Curso4);
        
        //System.out.println(Cursos);
        
        Collections.sort(Cursos, Comparator.comparing(Curso::getNombre).reversed());
        int suma = 0;
        for(Curso curso: Cursos){
            if (!curso.getNombre().equalsIgnoreCase("Historia")) {
                suma += curso.getTiempo();
            }
        }
        System.out.println(suma);
        //System.out.println(Cursos);
        
        List<Curso> CursoList = Cursos.stream().filter(Curso -> !Curso.getNombre().equalsIgnoreCase("Ruby")).sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());
        
        System.out.println(Cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Historia")).sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList()));
    }
 
}
