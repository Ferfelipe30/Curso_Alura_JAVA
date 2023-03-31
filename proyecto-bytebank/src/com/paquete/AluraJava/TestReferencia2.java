package com.paquete.AluraJava;

/**
 * @author Juan Felipe Fernandez
 */

public class TestReferencia2 {
    public static void main(String[] args) {
        cliente diego = new cliente();
        diego.setNombre("Diego");
        diego.setDocumento("99937652");
        diego.setTelefono("3138710902");
        
        Cuenta cuentaDeDiego = new Cuenta(1);
        cuentaDeDiego.setTitular(diego);
        
        System.out.println(cuentaDeDiego.getTitular().getDocumento());
        System.out.println(cuentaDeDiego.getTitular());
        System.out.println(diego);
    }
}
