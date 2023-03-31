package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Felipe Fernandez
 */

public class Clase12 {
    public static void main(String[] args) {
        String Alumno1 = "Luis Miguel";
        String Alumno2 = "Pepito los palotes";
        String Alumno3 = "Juan Carlos";
        String Alumno4 = "Pedro Pedrito";
        String Alumno5 = "Gustavo Sanchez";
        String Alumno6 = "Marcia Maria";
        String Alumno7 = "Marcia Maria";
        String Alumno8 = "Gustavo Sanchez";
        
        
        Collection<String> listaAlumno = new HashSet<>();
        
        listaAlumno.add(Alumno1);
        listaAlumno.add(Alumno2);
        listaAlumno.add(Alumno3);
        listaAlumno.add(Alumno4);
        listaAlumno.add(Alumno5);
        listaAlumno.add(Alumno6);
        listaAlumno.add(Alumno7);
        listaAlumno.add(Alumno8);
        
        listaAlumno.forEach(Alumno -> {
            System.out.println(Alumno);
        });
    }
}
