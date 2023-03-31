package com.paquete.AluraJava;

/**
 * @author Juan Felipe Fernandez
 */

public class Cuenta {
    private double saldo;
    private int agencia;
    private int numero;
    private cliente titular = new cliente();
    
    private static int total = 0;
    
    public Cuenta(int agencia){    
        
        if (agencia <= 0) {
            this.agencia = 1;
        }else{
            this.agencia = agencia;
        }
        total++;
        
        System.out.println("Se van creando: "+total+" cuentas");
    }
    
    public void depositar(double valor){
        this.saldo = saldo + valor;
    }
    
    public boolean retirar(double valor){
        if (this.saldo >= valor) {
            this.saldo = saldo - valor;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean transferir(double valor, Cuenta cuenta){
        if (this.saldo >= valor) {
            this.saldo = saldo - valor;
            cuenta.depositar(valor);
            return true;
        }else{
            return false;
        }
    }
    
    public double getSaldo(){
        return this.saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setTitular(cliente titular) {
        this.titular = titular;
    }

    public cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return total;
    }
    
    
}
