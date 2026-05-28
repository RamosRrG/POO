package org.example;


public class Main {
    static void main() {


        String sigla = IO.readln("Entre com a sigla: ");
        int dia = Integer.parseInt(IO.readln("Entre com o dia: "));

        DiaDaSemana primeiro = DiaDaSemana.getByCodigo(dia);

        Disciplina poo =
                new Disciplina(sigla, new DiaDaSemana[]{primeiro,DiaDaSemana.QUINTA});
        IO.println(poo);


        }
    }
}
