/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gasp;

/**
 *
 * @author juand
 */
class Moto extends Vehiculo{
    private String tipoMotor;
    private int velocidadActual = 0;

    public Moto(String marca, String modelo, int velocidadMaxima, String tipoMotor) {
        super(marca, modelo, velocidadMaxima);
        this.tipoMotor = tipoMotor;
    }

    @Override
    public String acelerar(int incrementoVelocidad) {
        velocidadActual = Math.min(velocidadActual + incrementoVelocidad, velocidadMaxima);
        return "La moto " + marca + " " + modelo + " acelero a " + velocidadActual + " km/h";
    }

    @Override
    public String frenar(int decrementoVelocidad) {
        velocidadActual = Math.max(velocidadActual - decrementoVelocidad, 0);
        return "La moto " + marca + " " + modelo + " freno a " + velocidadActual + " km/h";
    }

    @Override
    public String toString() {
        return "Moto " + super.toString() + ", Motor: " + tipoMotor;
    }
}

