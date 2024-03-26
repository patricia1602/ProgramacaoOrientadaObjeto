package aula03;

public class Aula03 {

    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        c1.modelo = "BIC Cristal";
        c1.cor = "azul";
        // c1.ponta = 0.5f;
        c1.carga = 80;
        // c1.tampada = false;
        c1.tampar();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo = "Compactor";
        c2.cor = "preta";
        c2.status();

    }

}
