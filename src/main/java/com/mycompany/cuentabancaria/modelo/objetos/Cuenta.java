package com.mycompany.cuentabancaria.modelo.objetos;
public class Cuenta {
        // atributos
    private float saldo;
    private int consignaciones=0;
    private int retiros=0;
    private float tasaAnual;
    private float comisionMensual=0;
    //constructor 
    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }
    // metodos sett and gett
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getConsignaciones() {
        return consignaciones;
    }

    public void setConsignaciones(int consignaciones) {
        this.consignaciones = consignaciones;
    }

    public int getRetiros() {
        return retiros;
    }

    public void setRetiros(int retiros) {
        this.retiros = retiros;
    }

    public float getTasaAnual() {
        return tasaAnual;
    }

    public void setTasaAnual(float tasaAnual) {
        this.tasaAnual = tasaAnual;
    }

    public float getComisionMensual() {
        return comisionMensual;
    }

    public void setComisionMensual(float comisionMensual) {
        this.comisionMensual = comisionMensual;
    }
    // metodo para ver el estado actual

    @Override
    public String toString() {
        return " Cuenta {" + "saldo =" + saldo + ", consignaciones=" + consignaciones + ", retiros=" + retiros + ", tasaAnual=" + tasaAnual + ", comisionMensual=" + comisionMensual + '}';
    }
    
  
}
