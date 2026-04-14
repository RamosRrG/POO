package ads.capitulo;

public class app {
    static void main(String[] args) {
        Livro livro = new Livro("Como fazer miojo", new Pessoa("Gustavo","saiprala"));

        livro.adicionaCapitulo("Ferva a agua");
        livro.adicionaCapitulo("Coloque no miojo");
        livro.adicionaCapitulo("Aguarde");
    }
}
