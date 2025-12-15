/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.cuentabancaria.modelo.interfaces;

/**
 *
 * @author PERSONAL
 */
public interface ICuentaAhorros {
        // metodos
    public boolean consignar(float cantidad);
    public boolean retirar(float cantidad);
    public void extractoMensual(); 
    public void imprimirAtributos();
}
