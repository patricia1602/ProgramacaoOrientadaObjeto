package exeAula02;

public class Animal {
    String nome;
    int idade;
    String som;
    boolean dormindo;

    void status() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("som: " + this.som);
    }

    void emitirSom() {
        this.dormindo = false;
    }

    void dormir() {
        this.dormindo = true;
    }

    void acordar() {
        if (this.dormindo == true) {
            System.out.println("Estava dormindo e acordou." + this.nome);
        } else {
            System.out.println("Já está acordado." + this.nome);
        }
    }
}
