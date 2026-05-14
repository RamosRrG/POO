package telefone;

import telefone.produtos.Dimencao;
import telefone.produtos.Telefone;
import telefone.produtos.TelefoneSemFIo;

public class Main {


    public static void main(String[] args){

        Telefone iphone = new Telefone(15, "AWSQW1212", "iphone",100.00, new Dimencao(12,12,12) );
        TelefoneSemFIo android = new TelefoneSemFIo(15, "AWSQW1212", "android",100.00, new Dimencao(12,12,12), 2,2,2 );


        System.out.println(iphone.toString() + "/n");
        System.out.println(android.toString());



    }
}
