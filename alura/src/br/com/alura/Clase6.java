package br.com.alura;

import br.com.alura.model.Aula;
import br.com.alura.model.Curso;
import java.util.ArrayList;

/**
 * @author Felipe Fernandez
 */

public class Clase6 {
    public static void main(String[] args) {
        Curso Curso1 = new Curso("Java", 30);
        Curso1.addAula(new Aula("ArrayList"));
        Curso1.addAula(new Aula("List"));
        Curso1.addAula(new Aula("LinkedList"));
        
        ArrayList<Curso> Cursos = new ArrayList<>();
        Cursos.add(Curso1);
        
        System.out.println(Cursos.get(0).getAulaList());
    }
}
