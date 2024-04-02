package projetoPessoas;

public class ProjetoPessoas {
    public static void main(String[] args) {
        // Programa Principal
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Leonardo");
        p2.setNome("Manuela");
        p3.setNome("Josenildo");
        p4.setNome("Patrícia");

        p1.setIdade(13);
        p2.setIdade(10);
        p3.setIdade(44);
        p4.setIdade(46);

        p1.setSexo("M");
        p2.setSexo("F");
        p3.setSexo("M");
        p4.setSexo("F");

        p2.setCurso("Informática");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");

        //p3.receberAumeto(550.20f);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }
}
