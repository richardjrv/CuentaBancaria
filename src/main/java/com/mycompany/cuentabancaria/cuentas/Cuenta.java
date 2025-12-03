
package com.mycompany.cuentabancaria.cuentas;


public class Cuenta {
    // atributos
    protected float saldo;
    protected int numeroConsignaciones=0;
    protected int numeroRetiros=0;
    protected float tasaAnual;
    protected float comisionesMensuales=0;
    
    //constructor

    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }
    // metodos
    public boolean consignar(float cantidadDinero){
        saldo=saldo+cantidadDinero;
    return true;
}
    public boolean retirar(float cantidadDinero){
    return true;
}
    public void calcularInteresMensual(){
        
    }
    public void extractoMensual(){
        
    }
    public void imprimirAtributos(){
        
    }
}
