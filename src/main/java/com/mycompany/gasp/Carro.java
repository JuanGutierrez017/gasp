/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gasp;

/**
 *
 * @author juand
 */
class Carro extends Vehiculo {
    private int puertas;
    private int velocidadActual = 0;

    public Carro(String marca, String modelo, int velocidadMaxima, int puertas) {
        super(marca, modelo, velocidadMaxima);
        this.puertas = puertas;
    }

    @Override
    public String acelerar(int incrementoVelocidad) {
        velocidadActual = Math.min(velocidadActual + incrementoVelocidad, velocidadMaxima);
        return "El carro " + marca + " " + modelo + " acelero a " + velocidadActual + " km/h";
    }

    @Override
    public String frenar(int decrementoVelocidad) {
        velocidadActual = Math.max(velocidadActual - decrementoVelocidad, 0);
        return "El carro " + marca + " " + modelo + " freno a " + velocidadActual + " km/h";
    }

    @Override
    public String toString() {
        return "Carro " + super.toString() + ", " + puertas + " puertas";
    }
}
