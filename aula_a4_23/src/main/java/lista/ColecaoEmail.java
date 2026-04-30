package lista;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.HashMap;


public class ColecaoEmail {
    private HashMap<String, String> dados = new HashMap<>();


    public boolean adicionarEmail(String key, String valor){
        String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        boolean c = false;
        if (valor.matches(eR)){
            if(!dados.containsKey(key)){
                dados.put(key,valor);
                c = true;
            }
        }
        return c;
    }

    public boolean removerEmail(String key){
        if(dados.containsKey(key)){
            dados.remove(key);
            return true;
        }else{
            return false;
        }
    }

    public boolean updateEmail(String key, String valor){
        if(dados.containsKey(key)){
            dados.put(key,valor);
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
        this.dados.forEach((String c, String v)-> sb.append(c).append(" : ").append(v).append("/n"));
        return sb.toString();
    }
}
