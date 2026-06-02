package tratamento;
import java.util.InputMismatchException;
import java.util.Scanner;
public class tratamento {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a;
        int b;

        try{
            System.out.print("Entre com o numero");
            a = sc.nextInt();
            System.out.print("Entre com o numero");
            b = sc.nextInt();
            int res = a/b;

            System.out.print(a+"dividido por "+b+"= "+ res);
        }catch(InputMismatchException e ){
            System.err.println("So e permitido numeros inteiros");
            sc.nextLine();
        }
        System.out.print("Fim do programa");









        sc.close();
    }

}
