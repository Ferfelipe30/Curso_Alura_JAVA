package com.paquete.AluraJava;

/**
 * @author Juan Felipe Fernandez
 */

public class TestReferencia3 {
    public static void main(String[] args) {
        Cuenta cuentadeDiego = new Cuenta(1);
        
        System.out.println(cuentadeDiego.getTitular().getNombre());
        
    }
}
