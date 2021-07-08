package caja;

public class PruebaCaja {

    public static void main(String[] args) {
        Caja Caja1 = new Caja();
        Caja1.ancho = 2;
        Caja1.alto = 2;
        Caja1.profundo = 2;
        System.out.println("El volumen de la caja1 es: " + Caja1.calcularVolumen());

        Caja Caja2 = new Caja(3, 2, 6);
        System.out.println("El volumen de la caja2 es: " + Caja2.calcularVolumen());
    }
}
