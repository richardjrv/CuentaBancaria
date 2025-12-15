
package com.mycompany.cuentabancaria.modelo.objetos;

public class CuentaCorriente extends  Cuenta {
            // atributos
    private float sobregiro =0;
     // constructor con argumentos saldo y tasaAnual
    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);    
        
    }
    // constructor
    public CuentaCorriente( float sobregiro, float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        this.sobregiro = sobregiro;
    }
    //metodos sett y gett

    public float getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(float sobregiro) {
        this.sobregiro = sobregiro;
    }

    @Override
    public String toString() {
      return " CuentaCorriente { " + " sobregiro= " + sobregiro + '}';
    }
    
}
