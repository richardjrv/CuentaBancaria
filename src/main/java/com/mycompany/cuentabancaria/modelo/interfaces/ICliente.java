package com.mycompany.cuentabancaria.modelo.interfaces;

import com.mycompany.cuentabancaria.modelo.objetos.Cliente;

public interface ICliente {
    // metodos
    public boolean agregarCliente(Cliente cliente);
    public void imprimirDatosCliente ();
    public Cliente buscarCliente (int codigo);
    public boolean eliminarCliente (int codigo);
    public boolean actualizarCliente (int codigo,Cliente cliente);
}
