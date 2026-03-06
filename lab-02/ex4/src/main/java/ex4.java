import java.util.Random;
public class ex4{
    public static void main(String[] args) {
        Random rand = new Random();
        String[][] matriz = new String[9][9];
        int contador = 9;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = ".";

            }
        }
        for (int i = 0; i < contador; i++) {
            int tamanho = rand.nextInt(matriz.length);
            int tamanho2 = rand.nextInt(matriz.length);

                if (matriz[tamanho][tamanho2].equals("*")) {
                    i--;
                } else {
                    matriz[tamanho][tamanho2] = "*";
                }

            
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.println();
            for (int j = 0; j < matriz.length ; j++) {
                System.out.print(matriz[i][j]);
            }

        }
    }
}