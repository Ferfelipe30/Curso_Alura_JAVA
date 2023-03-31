package com.paquete.AluraJava;

/**
 * @author Juan Felipe Fernandez
 */

public class PruebaEncapsulamiento {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(2);
        cliente Cliente = new cliente();
        Cliente.setNombre("Diego");
        Cliente.setDocumento("ffed866");
        
        cuenta.setTitular(Cliente);
        
        cliente titular = cuenta.getTitular();
        
        System.out.println(Cliente);
        System.out.println(cuenta.getTitular());
        System.out.println(titular);
        
    }
}
