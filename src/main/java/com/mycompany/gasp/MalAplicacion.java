
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


public class Main {
    public static void main(String[] args) {
        Toyota miToyota = new Toyota();
        Honda miHonda = new Honda();
        miToyota.mostrarMarca();
        miHonda.mostrarMarca();
    }
}
