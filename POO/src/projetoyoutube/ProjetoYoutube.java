package projetoyoutube;

public class ProjetoYoutube {
    // Programa principal
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 2 PHP");
        v[2] = new Video("Aula 3 de HTML5");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Leonardo", 13, "M", "juba");
        g[1] = new Gafanhoto("Manuela", 10, "F", "baby");

        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
    }
}
