package org.example;


public class Argumento {
    public static void main(String[] args) {
        if(args.length ==0){
            IO.println("Não forneceu argumentos na linha de comando");

        }else if(args[0] == "triangulo" ){
            int tamanho = Integer.parseInt(args[1]);
            for (int i = 0; i < tamanho; i++) {
                IO.println();
                for (int j = 0; j <=i ; j++) {
                    IO.print("*");

                    }
                }
            }


//        }else if(args[0] == "losangulo" ){
//            int tamanho = Integer.parseInt(args[1]);
//
//        }else if(args[0] == "retangulo"){
//            int linha = Integer.parseInt(args[1]);
//            int coluna = Integer.parseInt(args[1]);
//
//
//
//        }

    }

}

