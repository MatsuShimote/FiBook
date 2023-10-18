public class Post {
    private String conteudo;
    private Usuario autor;

    public Post(String conteudo, Usuario autor) {
        this.conteudo = conteudo;
        this.autor = autor;
    }

    public String getConteudo() {
        return conteudo;
    }

    public Usuario getAutor() {
        return autor;
    }
}