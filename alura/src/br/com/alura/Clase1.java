package br.com.alura;

import java.util.ArrayList;

/**
 * @author Felipe Fernandez
 */

public class Clase1 {
    public static void main(String[] args) {
        String variable1 = "Ejemplo1";
        String variable2 = "Ejemplo2";
        String variable3 = "Ejemplo3";
        String variable4 = "Ejemplo4";
        
        ArrayList<String> lista = new ArrayList<>();
        lista.add(variable1);
        lista.add(variable2);
        lista.add(variable3);
        lista.add(variable4);
        
        System.out.println(lista);
        
        //Remover objeto del arreglo.
        //lista.remove(2);
        
        //Alteramos variable o objeto del arreglo.
        //lista.set(2,"Ejemplo Alterado");
        
        System.out.println(lista.size());
        
    }
}
