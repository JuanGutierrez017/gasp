/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gasp;

/**
 *
 * @author juand
 */
class Camion extends Vehiculo {
    private int cargaMaxima;
    private int velocidadActual = 0;

    public Camion(String marca, String modelo, int velocidadMaxima, int cargaMaxima) {
        super(marca, modelo, velocidadMaxima);
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public String acelerar(int incrementoVelocidad) {
        velocidadActual = Math.min(velocidadActual + incrementoVelocidad, velocidadMaxima);
        return "El camion " + marca + " " + modelo + " acelero a " + velocidadActual + " km/h";
    }

    @Override
    public String frenar(int decrementoVelocidad) {
        velocidadActual = Math.max(velocidadActual - decrementoVelocidad, 0);
        return "El camion " + marca + " " + modelo + " freno a " + velocidadActual + " km/h";
    }

    @Override
    public String toString() {
        return "Camion " + super.toString() + ", Carga maxima: " + cargaMaxima + " kg";
    }
}
