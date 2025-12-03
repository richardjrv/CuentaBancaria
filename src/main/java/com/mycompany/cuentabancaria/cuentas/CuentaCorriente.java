
package com.mycompany.cuentabancaria.cuentas;


public class CuentaCorriente extends Cuenta{
    // atributos
    protected float sobregiro =0;
    
    //constructor

    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
    }
    // metoodos
    //override significa sobreescribir para diferenciar es el mismo nombre pero diferente comportamiento
    @Override
    public boolean consignar(float cantidad){
    return true;
}
    @Override
    public boolean retirar(float cantidad){
    return true;
}
    @Override
    public void extractoMensual(){
        
    }
    
    @Override
    public void imprimirAtributos(){
        
    }
    //

    @Override
    public String toString() {// to string para ver el estado del objeto
        return "CuentaCorriente{"+ super.toString() + "sobregiro=" + sobregiro + '}';
    }
    
}
