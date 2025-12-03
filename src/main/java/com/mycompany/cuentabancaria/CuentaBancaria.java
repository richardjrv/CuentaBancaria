package com.mycompany.cuentabancaria;

import com.mycompany.cuentabancaria.cuentas.CuentaAhorros;
import com.mycompany.cuentabancaria.cuentas.CuentaCorriente;

public class CuentaBancaria {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //objeto uno
        CuentaAhorros cuentaAhorros = new CuentaAhorros (10, 50);
        System.out.println(cuentaAhorros.toString());
       //objeto dos
       CuentaCorriente cuentaCorriente = new CuentaCorriente (20, 70);
        System.out.println(cuentaCorriente.toString());
    } 
}    

