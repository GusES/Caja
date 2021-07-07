package clases;

public class Caja {

    int ancho;
    int alto;
    int profundo;

    //constructor vacio
    public Caja() {
    }

    //sobrecarga del constructor
    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    public int calcularVolumen() {
        return this.ancho * this.alto * this.profundo;
    }
}
