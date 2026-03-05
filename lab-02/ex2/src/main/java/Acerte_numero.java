import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;
import java.util.Random;
public class Acerte_numero{

    public static void main(String[] args){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        IO.println("Vamos comecar o nosso jogo de acertos: ");
        IO.println("Digite sim para comecar: ");
        String jogar = sc.nextLine();
        int tentativas;
        int quantas_tentativas = 0;

        if(jogar.equals("sim")){
            int numero = rand.nextInt(100);
            do {
                System.out.println("Tente adivinhar o numero de 0 a 100");
                int tentativa = sc.nextInt();
                quantas_tentativas ++;
                if(tentativa == numero){
                    System.out.println("Parabens voce acertou");
                }else{

                    System.out.println("Voce errou. ");
                    if (tentativa > numero) {
                        System.out.println("Seu numero e maior");
                    }
                    if (tentativa < numero) {
                        System.out.println("Seu numero e menor");
                    }
                }
                tentativas = tentativa;
            }while(tentativas != numero);
            System.out.println("Voce tentou um total de "+ quantas_tentativas+ " vezes");
            }
        sc.close();
        }
    }


