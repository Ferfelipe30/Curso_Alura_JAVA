package br.com.alura;

import br.com.alura.model.Alumno;
import br.com.alura.model.Curso;
import java.util.Optional;

/**
 * @author Felipe Fernandez
 */

public class Clase19 {
    public static void main(String[] args) {
        Curso Curso1 = new Curso("Historia", 30);
        
        Alumno Alumno1 = new Alumno("Luis Miguel", "001");
        Alumno Alumno2 = new Alumno("Pepito los palotes", "002");
        Alumno Alumno3 = new Alumno("Juan Carlos", "003");
        Alumno Alumno4 = new Alumno("Pedro Pedrito", "004");
        Alumno Alumno5 = new Alumno("Gustavo Sanchez", "005");
        Alumno Alumno6 = new Alumno("Marcia Maria", "006");
        Alumno Alumno7 = new Alumno("Claudia Padricia", "007");
        
        Curso1.addAlumno(Alumno1);
        Curso1.addAlumno(Alumno2);
        Curso1.addAlumno(Alumno3);
        Curso1.addAlumno(Alumno4);
        Curso1.addAlumno(Alumno5);
        Curso1.addAlumno(Alumno6);
        Curso1.addAlumno(Alumno7);
        
        //Curso1.getAlumnos().forEach(Alumno -> System.out.println(Alumno));
        
        Alumno alumnoMap = Curso1.getAlumnoMap().get("003");
        
        Curso1.getAlumnoMap().forEach((codigo, alumno)-> {
            System.out.println(alumno);
        });
        //System.out.println(alumnoMap);
    }
}
