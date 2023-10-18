public class Main {
    public static void main(String[] args) {
        Usuario renata = new Usuario("Renata");
        Usuario junior = new Usuario("Junior");
        Usuario carol = new Usuario("Carol");

        renata.seguir(junior);
        renata.seguir(carol);

        junior.criarPost("Olá, FiBook!");
        carol.criarPost("Oi, pessoal!");


        carol.criarPost("Adeus, FiBook!");
    }
}