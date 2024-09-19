/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gasp;

/**
 *
 * @author juand
 */
public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int velocidadMaxima;

    public Vehiculo(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public abstract String acelerar(int incrementoVelocidad);
    public abstract String frenar(int decrementoVelocidad);

    @Override
    public String toString() {
        return marca + " " + modelo + " (Vel. maxima: " + velocidadMaxima + " km/h)";
    }
}
