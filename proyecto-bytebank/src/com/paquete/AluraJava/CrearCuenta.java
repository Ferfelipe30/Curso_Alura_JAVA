package com.paquete.AluraJava;

/**
 * @author Juan Felipe Fernandez
 */

public class CrearCuenta {
    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta(33);
        Cuenta segundaCuenta = new Cuenta(3);
        
        primeraCuenta.depositar(400);
        
        segundaCuenta.depositar(400);
                
        System.out.println(primeraCuenta.getSaldo());  
        
        System.out.println(segundaCuenta.getSaldo());
        
        System.out.println(primeraCuenta);
        System.out.println(segundaCuenta);
        
        if(primeraCuenta == segundaCuenta){
            System.out.println("Son el mismo objeto");
        }else{
            System.out.println("Son diferentes");
        }
    }
}
