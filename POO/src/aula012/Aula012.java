package aula012;

public class Aula012 {
    public static void main(String[] args) {
        // Animal animal = new Animal();
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        /*
         * m.setPeso(35.3f);
         * m.setCorPelo("Marrom");
         * m.alimentar();
         * m.locomover();
         * m.emitirSom();
         */

        Canguru c = new Canguru();
        Cachorro ca = new Cachorro();
        Cobra co = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara ar = new Arara();

        c.locomover();
        c.emitirSom();
        ca.locomover();
        ca.emitirSom();

    }
}
