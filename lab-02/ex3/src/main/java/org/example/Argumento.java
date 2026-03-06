package org.example;


public class Argumento {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Não forneceu argumentos na linha de comando");

        } else if (args[0].equals("triangulo")) {
            System.out.println("Entrei no teste ");
            int tamanho = Integer.parseInt(args[1]);
            for (int i = 0; i < tamanho; i++) {
                System.out.println();
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");

                }
            }

        } else if (args[0].equals("losangulo")) {
            int tamanho = Integer.parseInt(args[1]);
            int espeaço = tamanho/2;
            for (int i = 0; i < tamanho; i++) {
                System.out.println();
                for (int j = 0; j <= i; j++) {
                    System.out.print(.repe);
                    System.out.print("*");
                }

            }

        } else if (args[0] == "retangulo") {
            int linha = Integer.parseInt(args[1]);
            int coluna = Integer.parseInt(args[1]);


        }

    }
}


