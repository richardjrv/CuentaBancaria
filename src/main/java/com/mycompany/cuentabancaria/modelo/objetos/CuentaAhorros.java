
package com.mycompany.cuentabancaria.modelo.objetos;

public class CuentaAhorros extends Cuenta{
        // Atributos
    private boolean activa;
    // constructtor con dos parametrso
    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
    }
    
    // Constructor
    public CuentaAhorros(boolean activa, float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        this.activa = activa;
    }
    
    // Metodos set and get
    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
    // metodo para ver el estado actual del objeto

    @Override
    public String toString() {
        return " CuentaAhorros { " + " activa= " + activa + '}';
    }

}
