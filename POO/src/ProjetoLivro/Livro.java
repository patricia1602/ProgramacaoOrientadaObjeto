package projetoLivro;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String detahes() {
        return "Livro [titulo=" + titulo + "\n, autor="
                + autor + "\n, totalPaginas=" + totalPaginas
                + ", paginaAtual=" + paginaAtual + ", aberto="
                + aberto + "\n, leitor=" + leitor.getNome() +
                ",idade=" + leitor.getIdade() +
                ",sexo=" + leitor.getSexo() + "]";
    }

    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.aberto = false;
        this.paginaAtual = 0;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;

    }

    @Override
    public void folhear(int p) {
        if (p > this.totalPaginas) {
            this.paginaAtual = 0;
        } else {
            this.paginaAtual = p;

        }

    }

    @Override
    public void avancarPagina() {
        this.paginaAtual++;
    }

    @Override
    public void voltaPagina() {
        this.paginaAtual--;
    }

}
