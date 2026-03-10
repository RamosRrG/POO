public class aula {
    public static void main(String[] args){

     Caneta pencil = new Caneta("Azul",100,true);
     Caneta consul = new Caneta();

     consul.setCor("Vermelha");
     consul.setNivelTinta(75);
     boolean aberta_ou_nao = consul.getAberta_Fechada();
     System.out.println(pencil.getAberta_Fechada());
     System.out.println(pencil.getNivelTinta());
     System.out.println(pencil.desenhar(3,5,7,2));
     System.out.println(pencil.getNivelTinta());


    }
}