public class Retangulo{
    private int largura;
    private int altura;
    private String formatacao;

    public Retangulo(int altura, int largura, String formatacao) {
        if(altura == 0){
          this.altura = 4;
        }else{
            this.altura = Math.abs(altura);
        }
        if(largura == 0){
            this.largura = 4;
        }else{
            this.largura = Math.abs(largura);
        }
        if(formatacao.toUpperCase().equals("UTF8") ||formatacao.toUpperCase().equals("ACSII") ){
            this.formatacao = formatacao;

        }else{
            this.formatacao ="ASCII";
        }
    }

    public boolean setLargura(int largura) {
        if(Math.abs(largura)>0){
            this.largura = largura;
            return true;
        }else{
            return false;
        }
    }

    public boolean setAltura(int altura) {
        if(Math.abs(altura)>0){
            this.altura = altura;
            return true;
        }else{
            return false;
        }
    }
    public boolean setFormatacao(String formatacao) {
        if(formatacao.toUpperCase().equals("ACSII") || formatacao.toUpperCase().equals("UTF8")){
            this.formatacao = formatacao;
            return true;
        }else{
            return false;
        }
    }
}
