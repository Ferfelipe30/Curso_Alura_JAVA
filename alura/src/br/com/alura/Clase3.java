package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Felipe Fernandez
 */

public class Clase3 {
    public static void main(String[] args) {
        String Curso1 = "Geometria";
        String Curso2 = "Fisica";
        String Curso3 = "Quimica";
        String Curso4 = "Historia";
        
        ArrayList<String> Cursos = new ArrayList<>();
        Cursos.add(Curso1);
        Cursos.add(Curso2);
        Cursos.add(Curso3);
        Cursos.add(Curso4);
        
        System.out.println(Cursos);
        
        Collections.sort(Cursos);
        System.out.println(Cursos);
        
        Collections.sort(Cursos, Collections.reverseOrder());
        System.out.println(Cursos);
        
        Cursos.sort(Comparator.reverseOrder());
        System.out.println(Cursos);
        
        Cursos.sort(Comparator.naturalOrder());
        System.out.println(Cursos);
        
        List<String> cursosList = Cursos.stream().sorted().collect(Collectors.toList());
        System.out.println(cursosList);
    }
}
