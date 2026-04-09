public class Livro {

    private final String ISBN;
    private String name;
    private String autor;
    private int ano;

    public Livro(String ISBN,String name,String autor,int ano){
        this.ISBN = ISBN;
        this.name = name;
        this.autor = autor;
        this.ano = ano;
    }


    public String getISBN() {
        return ISBN;
    }

    public String getName() {
        return name;
    }

    public String getAutor() {
        return autor;
    }



    public int getAno() {
        return ano;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }



    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "ISBN='" + ISBN + '\'' +
                ", name='" + name + '\'' +
                ", autor='" + autor + '\'' +
                ", ano=" + ano +
                '}';
    }
}
