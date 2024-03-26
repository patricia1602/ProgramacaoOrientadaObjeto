package aula05;

public class Aula05 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1234);
        p1.setDono("Manuela");
        p1.abrirConta("CC");
        p1.depositar(100);
        p1.getSaldo();
        p1.sacar(20);

        p1.estadoAtual();

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(4321);
        p2.setDono("Leonardo");
        p2.abrirConta("CP");
        p2.depositar(150);
        p2.getSaldo();
        p2.sacar(30);

        p2.estadoAtual();

    }
}
