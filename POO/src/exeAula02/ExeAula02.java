package exeAula02;

public class ExeAula02 {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.nome= "Baby";
        animal1.idade = 5;
        animal1.som = "auau";
        animal1.status();
        animal1.emitirSom();
        animal1.dormir();
        animal1.acordar();
    }
}
