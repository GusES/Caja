package caja;

public class Caja {

    //Atributos
    int ancho;
    int alto;
    int profundo;

    //Constructor
    public Caja() {
    }

    //Sobrecarga del Constructor
    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    //Metodos
    public int calcularVolumen() {
        return this.ancho * this.alto * this.profundo;
    }
}
