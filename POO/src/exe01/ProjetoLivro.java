package exe01;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] pessoa = new Pessoa[2];
        Livro[] livro = new Livro[3];

        pessoa[0] = new Pessoa("Leonardo", 13, "M");
        pessoa[1] = new Pessoa("Manuela", 10, "F");

        livro[0] = new Livro("Aprendendo Java", "José da Silva", 300, pessoa[0]);
        livro[1] = new Livro("POO para Iniciantes", "Pedro Paulo", 500, pessoa[1]);
        livro[2] = new Livro("Java Avançado", "Maria Candido", 800, pessoa[0]);

        livro[1].abrir();
        livro[1].folhear(100);
        System.out.println(livro[1].detahes());
    }
}
