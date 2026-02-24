package aula_02_24;

public class atividade{

    public static void main(String[] args){
        int n = 1;
        int[][] matriz1 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz1[i][j] = n;
                n = n+1;
                System.out.print(matriz1[i][j]+" "); 
            }
            System.out.println();
        
        }
        System.out.println("---------------------");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                if(i == j){
                    System.out.print(matriz1[i][j]+" ");
                }else{
                    System.out.print(" ");
               }
        }
                    System.out.println();
    }    



//pecorrendo a matriz, cada posição da matriz seria um linha, logo acesso a linha e percorre ela.
    for (int[] is : matriz1) {
        for (int is2 : is) {
            
        }
    }
}
}

