package com.paquete.AluraJava;

/**
 * @author Juan Felipe Fernandez
 */

public class TestReferencia {
    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta(1);
        Cuenta segundaCuenta = primeraCuenta;
        
        primeraCuenta.depositar(200);
        segundaCuenta.depositar(100);
        
        System.out.println("Saldo primera Cuenta: "+ primeraCuenta.getSaldo());
        System.out.println("Saldo segunda Cuenta: "+ segundaCuenta.getSaldo());
        
        segundaCuenta.depositar(400);
        System.out.println("Saldo primera Cuenta: "+ primeraCuenta.getSaldo());
        
        System.out.println(primeraCuenta);
        System.out.println(segundaCuenta);
    }
}
