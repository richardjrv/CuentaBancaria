
package com.mycompany.cuentabancaria.modelo.objetos;

public class Persona {
    // atributos privados
    private String nombre;
    private String correo;
    private int cedula;
    // constructor
    public Persona(String nombre, String correo, int cedula) {
        this.nombre = nombre;
        this.correo = correo;
        this.cedula = cedula;
    }
    // seter and getter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    // to string
    @Override
    public String toString() {
        return "Persona "+
                "\n Nombre : " + nombre +
                "\n Correo : " + correo +
                "\n Cedula : " + cedula ;
                
    }   
}
