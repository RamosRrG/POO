package ex1;

public class ex1{

    public static void main(String[] args){
        IO.println("Entre com o dia do mes: ");
        int dia = Integer.parseInt(IO.readln());
        IO.println("Entre com o mes: ");
        String mes = IO.readln();
        int dia_acumulado = dia;



        switch(mes){
            case "janeiro":
                dia_acumulado += 31;
                break;
            case "fevereiro":
                dia_acumulado +=59;
                break;
            case "março":
                dia_acumulado += 90;
                break;
            case "abril":
                dia_acumulado +=120;
                break;
            case "maio":
                dia_acumulado += 151;
                break;
            case "junho":
                dia_acumulado +=181;
                break;
            case "julho":
                dia_acumulado += 211;
                break;
            case "agosto":
                dia_acumulado +=242;
                break;
            case "setembto":
                dia_acumulado +=272;
            case "outubro":
                dia_acumulado += 303;
                break;
            case "novembro":
                dia_acumulado +=333;
                break;
            case "desembro":
                dia_acumulado += 364;
                break;
        }
        if(true ){}


    }
}