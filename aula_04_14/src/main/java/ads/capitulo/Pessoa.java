package ads.capitulo;

public class Pessoa {
    private String name;
    private String email;

    public Pessoa(String nome, String email){
        this.name = nome;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
