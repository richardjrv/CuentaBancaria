
package com.mycompany.cuentabancaria.cuentas;


public class Cuenta {
    // atributos
    protected float saldo;
    protected int consignaciones=0;
    protected int retiros=0;
    protected float tasaAnual;
    protected float comisionMensual=0;
    
    //constructor

    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }
    // metodos
    public boolean consignar(float cantidad){
        saldo=saldo+cantidad;
    return true;
}
    public boolean retirar(float cantidad){
    return true;
}
    public void calcularInteresMensual(){
        
    }
    public void extractoMensual(){
        
    }
    public void imprimirAtributos(){
        
    }

    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + ", consignaciones=" + consignaciones + ", retiros=" + retiros + ", tasaAnual=" + tasaAnual + ", comisionMensual=" + comisionMensual + '}';
    }
    
}
