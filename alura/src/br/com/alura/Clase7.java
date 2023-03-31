package br.com.alura;

import br.com.alura.model.Aula;
import br.com.alura.model.Curso;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Felipe Fernandez
 */

public class Clase7 {
    public static void main(String[] args) {
        Curso Curso1 = new Curso("Java", 30);
        Curso1.addAula(new Aula("ArrayList"));
        Curso1.addAula(new Aula("List"));
        Curso1.addAula(new Aula("LinkedList"));
        Curso1.addAula(new Aula("Inmutable"));
        
        List<Aula> aulaList = Curso1.getAulaList();
        
        ArrayList<Curso> Cursos = new ArrayList<>();
        Cursos.add(Curso1);
        
        System.out.println(aulaList);
    }

    
}
