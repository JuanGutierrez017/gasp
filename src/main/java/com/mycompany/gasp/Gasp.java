/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gasp;

/**
 *
 * @author juand
 */
public class Gasp {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = {
            new Carro("Toyota", "Corolla", 180, 4),
            new Moto("Yamaha", "YZF-R3", 220, "500cc"),
            new Camion("Mercedes", "Actros", 130, 18000)
        };

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
            System.out.println(vehiculo.acelerar(50));
            System.out.println(vehiculo.frenar(20));
            System.out.println("-".repeat(20));
        }
    }
}

