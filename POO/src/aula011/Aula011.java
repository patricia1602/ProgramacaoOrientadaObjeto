package aula011;

public class Aula011 {
    public static void main(String[] args) {
        // Pessoa p1 = new Pessoa();

        /*
         * Visitante v1 = new Visitante();
         * v1.setNome("Leonardo");
         * v1.setIdade(13);
         * v1.setSexo("M");
         * 
         * System.out.println(v1.toString());
         */

        Aluno a1 = new Aluno();
        a1.setNome("Leonardo");
        a1.setMatricula(1234);
        a1.setCurso("informática");
        a1.setIdade(13);
        a1.setSexo("M");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setMatricula(1212);
        b1.setNome("Manuela");
        b1.setBolsa(12.5f);
        b1.setSexo("F");
        b1.pagarMensalidade();
        
        System.out.println(a1.toString());
    
    }
}
