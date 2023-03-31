package br.com.alura;

import br.com.alura.model.Curso;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Felipe Fernandez
 */

public class Clase10 {
    
    public static final List<List<Integer>> listas = new ArrayList<List<Integer>>(){
        {
            add(new LinkedList<>());
            add(new ArrayList<>());
        }  
    };
    
    public static void main(String[] args) {
        Curso Curso1 = new Curso("Historia", 30);
        Curso Curso2 = new Curso("Algebra", 10);
        Curso Curso3 = new Curso("Aritmetica", 20);
        Curso Curso4 = new Curso("Geometria", 50);
        Curso Curso5 = new Curso("Fisica", 60);
        Curso Curso6 = new Curso("Quimica", 80);
        Curso Curso7 = new Curso("Quimica", 70);
        Curso Curso8 = new Curso("Fisica", 30);
        
        ArrayList<Curso> Cursos = new ArrayList<>();
        Cursos.add(Curso1);
        Cursos.add(Curso2);
        Cursos.add(Curso3);
        Cursos.add(Curso4);
        Cursos.add(Curso5);
        Cursos.add(Curso6);
        Cursos.add(Curso7);
        Cursos.add(Curso8);
        
        List<Curso> CursoList = Cursos.stream().filter(Curso -> !Curso.getNombre().equalsIgnoreCase("Ruby")).sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());
        
        System.out.println(Cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Historia")).mapToInt(Curso::getTiempo).sum());
        System.out.println(Cursos.stream().mapToInt(Curso::getTiempo).average().getAsDouble());
        System.out.println(Cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt());
        System.out.println(Cursos.stream().mapToInt(Curso::getTiempo).min().getAsInt());
        
        Map<String, List<Curso>> groupCurso = Cursos.stream().collect(Collectors.groupingBy(Curso::getNombre));
        groupCurso.forEach((key, value) -> System.out.println(key + " - "+ value.size()));
        
        System.out.println(Cursos.parallelStream().mapToInt(Curso::getTiempo).sum());
    }
}
