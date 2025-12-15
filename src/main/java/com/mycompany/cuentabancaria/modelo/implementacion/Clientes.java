package com.mycompany.cuentabancaria.modelo.implementacion;

import com.mycompany.cuentabancaria.modelo.interfaces.ICliente;
import com.mycompany.cuentabancaria.modelo.objetos.Cliente;

public class Clientes implements ICliente {
    // cliente una ficha 
    // archivador
    private Cliente [] clientes; // se guarda tipo cliente
    private int totalClientes; // contador  de cuanto se a guardado actual en el archivador
    
        public Clientes(int dimension) {// se crea el archivador y cuantos espacios tiene
        clientes = new Cliente[dimension];
        totalClientes = 0;// se incia con cero
    }

    @Override
    public boolean agregarCliente(Cliente cliente) { // se agrega ficha
        if (totalClientes == clientes.length) { // se pregunta si esta lleno
            return false;// retorna falso por que si esta lleno
        } else { // pero
            clientes[totalClientes] = cliente; // cliente1 guardado
            totalClientes = totalClientes + 1; // aumenta el contador
            return true; // si se pudede agregar
        }
    }


    @Override
    public void imprimirDatosCliente() {
        for (int i = 0; i < totalClientes; i++) {// recorre el vestor en clientes existentes
            System.out.println("------Cliente------" + "|" + (i + 1) + "|");
            System.out.println("Nombre: " + clientes[i].getNombre());
            System.out.println("Codigo: " + clientes[i].getCodigo());
            System.out.println("Cedula: " + clientes[i].getCedula());
            System.out.println("Correo Personal: " + clientes[i].getCorreo());
            System.out.println(" ");

        }
    }

    @Override
    public Cliente buscarCliente(int codigo) { 
        for (int i = 0; i < totalClientes; i++) { // recorre el vector de clientes 
            if (clientes[i].getCodigo() == codigo) { // por codigo
                return clientes[i];// se lista el cliente encontrado
            }
        }
        return null;// retorna vacio
    }
    @Override
    public boolean eliminarCliente(int codigo) {
        for (int i = 0; i < totalClientes; i++) {
            if (clientes[i].getCodigo() == codigo) {
                for (int j = i; j < totalClientes - 1; j++) {
                    clientes[j] = clientes[j + 1];
                }
                clientes[totalClientes - 1] = null;
                totalClientes--;
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean actualizarCliente(int codigo, Cliente cliente) {
        for (int i = 0; i < totalClientes; i++) {
            if (clientes[i].getCodigo() == codigo) {
                clientes[i] = cliente;
                imprimirDatosCliente();
                return true;
            }
        }
        return false;

    }
}
