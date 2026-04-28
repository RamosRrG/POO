package lista;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.HashMap;



public class ColecaoTelefone {
    private HashMap<String, String> dados = new HashMap<>();

    public boolean adicionarNumero(String rotulo, String numero) {
        String eR = "^[0-9]{13}$";
        boolean c = false;
        if (numero.matches(eR)) {
            if (!dados.containsKey(rotulo)) {
                dados.put(rotulo, numero);
                c=  true;
            }
        }
        return c;
    }

    public boolean removerNumero(String rotulo){
        if(dados.containsKey(rotulo)){
            dados.remove(rotulo);
            return true;
        }else{
            return false;
        }
    }

    public boolean updateNumero(String rotulo, String numero){
        if(dados.containsKey(rotulo)){
            dados.put(rotulo,numero);
            return true;
        }else{
            return false;
        }
    }

    public String formata(String mascara, String valor){
        MaskFormatter mask = null;
        String resultado = "";
        try {
            mask = new MaskFormatter(mascara);
            mask.setValueContainsLiteralCharacters(false);
            mask.setPlaceholderCharacter('_');
            resultado = mask.valueToString(valor);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return resultado;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        this.dados.forEach((c,v)->sb.append(c).append(": ").append(formata("+## (##) #####-####",v)).append("\n"));
        return sb.toString();
    }

}
