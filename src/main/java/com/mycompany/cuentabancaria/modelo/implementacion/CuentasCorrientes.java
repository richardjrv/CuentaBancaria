package com.mycompany.cuentabancaria.modelo.implementacion;

import com.mycompany.cuentabancaria.modelo.interfaces.ICuentaCorriente;

public class CuentasCorrientes implements ICuentaCorriente {
        // metodos 
    @Override
    public boolean consignar(float cantidad){
        boolean respuesta=false;
        return respuesta;
}
    @Override
    public boolean retirar(float cantidad){
        return false;
}

    @Override
    public void extractoMensual(){
  
    }
    @Override
    public void imprimirAtributos(){
        System.out.println("Mostrando Cuenta.");
            System.out.println("Saldo: ");
            System.out.println("Consignaciones: ");
            System.out.println("retiros: ");
            System.out.println("Tasa Anual: ");
            System.out.println("Comision Mensual: ");

        
    }
}
