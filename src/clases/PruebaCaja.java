package clases;

public class PruebaCaja {

    public static void main(String[] args) {
        Caja Caja1 = new Caja(3, 2, 6);
        int resultado = Caja1.calcularVolumen();
        System.out.println("Resultado = " + resultado);
    }

}
