
package com.mycompany.cuentabancaria.cuentas;

public class CuentaAhorros extends Cuenta{
    // atributos
    protected boolean activa;
    // constructor

    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        this.activa = true;
    }
    // metodos 

    @Override
    public boolean consignar(float cantidad){
        boolean respuesta=false;
        if(activa){
        respuesta = super.consignar(cantidad);
        }
        
    return respuesta;
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
    // to string

    @Override
    public String toString() {
        return "CuentaAhorros{"+super.toString() + "activa=" + activa + '}';
    }
    
    }
