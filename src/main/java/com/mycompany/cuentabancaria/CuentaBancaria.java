package com.mycompany.cuentabancaria;

import com.mycompany.cuentabancaria.modelo.objetos.Cliente;
import com.mycompany.cuentabancaria.modelo.objetos.CuentaAhorros;
import com.mycompany.cuentabancaria.modelo.objetos.CuentaCorriente;

public class CuentaBancaria {

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("-------------BANCO CENTRAL DEL ECUADOR------------");
        System.out.println(" ");
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------BIENVENIDOS-------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("==================================================");
        //objeto  CUENTAuno
        // objeto CLIENTEuno
        // Objetos para el Paciente Uno
        System.out.println("==================================================");
        System.out.println("                CREACION DE USUARIO            ");
        Cliente cliente = new Cliente (23,"richii","rich07@gmail.com",555 );
        // imprime datos actuales del objeto
        System.out.println(cliente.toString());
        System.out.println("==================================================");
        System.out.println("                CREACION DE CUENTA  AHORROS           ");
        CuentaAhorros cuentaAhorros = new CuentaAhorros (true,1000,10);
        System.out.println(cuentaAhorros.toString());
        System.out.println("==================================================");
        System.out.println("                Finalizado             ");
        System.out.println("Cliente= "+cliente.toString()+
                           "\n Cuenta= "+cuentaAhorros.toString());
        //
        System.out.println("==================================================");
        System.out.println("                CREACION DE CUENTA CORRIENTE             ");
        System.out.println("");
       //objeto CUENTAdos
       CuentaCorriente cuentaCorriente = new CuentaCorriente (2000,25);
        System.out.println(cuentaCorriente.toString());

        System.out.println("==================================================");
        System.out.println("               Aplicacion Finalizada              ");
        System.out.println("==================================================");
        System.out.println("==================================================");
        System.out.println("                GRACIAS POR SI VISITA             ");
        System.out.println("==================================================");
    } 
}    

