import java.util.ArrayList;

class Usuario {
    private String nomeUsuario;
    private ArrayList<Post> posts;
    private ArrayList<Observador> observadores;

    public Usuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.posts = new ArrayList<>();
        this.observadores = new ArrayList<>();
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void criarPost(String conteudo) {
        Post post = new Post(conteudo, this);
        posts.add(post);
        notificarSeguidores(post);
    }

    public void seguir(Usuario usuario) {
        usuario.adicionarObservador(new Observador() {
            @Override
            public void notificar(Post post) {
                if (post.getAutor() == usuario) {
                    System.out.println(nomeUsuario + " recebeu uma notificação de post de " + usuario.getNomeUsuario() + ": " + post.getConteudo());
                }
            }
        });
    }

    public void notificarSeguidores(Post post) {
        for (Observador observador : observadores) {
            observador.notificar(post);
        }
    }

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }
}
