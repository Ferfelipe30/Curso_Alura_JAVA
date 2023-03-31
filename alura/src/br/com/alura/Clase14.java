package br.com.alura;

import br.com.alura.model.Alumno;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;

/*
 * @author Felipe Fernandez
 */

public class Clase14 {
    public static void main(String[] args) {
        Alumno Alumno1 = new Alumno("Luis Miguel", "001");
        Alumno Alumno2 = new Alumno("Pepito los palotes", "002");
        Alumno Alumno3 = new Alumno("Juan Carlos", "003");
        Alumno Alumno4 = new Alumno("Pedro Pedrito", "004");
        Alumno Alumno5 = new Alumno("Gustavo Sanchez", "005");
        Alumno Alumno6 = new Alumno("Marcia Maria", "006");
        Alumno Alumno7 = new Alumno("Claudia Padricia", "007");
        
        
        Collection<Alumno> listaAlumno = new HashSet<>();
        
        listaAlumno.add(Alumno1);
        listaAlumno.add(Alumno2);
        listaAlumno.add(Alumno3);
        listaAlumno.add(Alumno4);
        listaAlumno.add(Alumno5);
        listaAlumno.add(Alumno6);
        listaAlumno.add(Alumno7);
        
        Alumno AlumnoNuevo = new Alumno("Luis Miguel", "001");
        
        System.out.println(Alumno1.equals(AlumnoNuevo));
        System.out.println(listaAlumno.contains(AlumnoNuevo));
    }
}
