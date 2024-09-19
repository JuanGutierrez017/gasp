/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gasp;

/**
 *
 * @author sala7
 */
    
class Carro {
    public void mostrarMarca() {
        System.out.println("Este es un carro genérico");
    }
}


class Toyota extends Carro {
    public void mostrarMarca() {
        System.out.println("Este es un carro Toyota");
    }
}


class Honda extends Carro {
    public void mostrarMarca() {
        System.out.println("Este es un carro Honda");
    }
}


public class MalApliacion {
    public static void main(String[] args) {
        Toyota miToyota = new Toyota();
        Honda miHonda = new Honda();
        miToyota.mostrarMarca();
        miHonda.mostrarMarca();
    }
}


