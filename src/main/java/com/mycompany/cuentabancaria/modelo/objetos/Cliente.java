
package com.mycompany.cuentabancaria.modelo.objetos;

public class Cliente extends Persona {
    // atributos
    private int codigo;
    // constructor
    public Cliente(int codigo, String nombre, String correo, int cedula) {
        super(nombre, correo, cedula);
        this.codigo = codigo;
    }
    
    // set and get
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    // to stribg

    @Override
    public String toString() {
        return " Cliente { " + " codigo = " + codigo +super.toString() +'}';
    }
    
}
