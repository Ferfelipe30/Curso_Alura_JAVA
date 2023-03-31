package com.paquete.AluraJava;

/**
 * @author Juan Felipe Fernandez
 */

public class pruebasMetodos {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1);
        cuenta.depositar(300);
        cuenta.depositar(200);
        
        System.out.println(cuenta.getSaldo());
        
        cuenta.retirar(100);
        System.out.println(cuenta.getSaldo());
        
        Cuenta cuentaDeJimena = new Cuenta(2);
        cuentaDeJimena.depositar(1000);
        boolean transferir = cuentaDeJimena.transferir(400, cuenta);
        
        if (transferir) {
            System.out.println("La transferencia fue exitosa");
        }else{
            System.out.println("La transferencia fue erronia");
        }
        
        System.out.println(cuentaDeJimena.getSaldo());
        System.out.println(cuenta.getSaldo());
        
    }
}
