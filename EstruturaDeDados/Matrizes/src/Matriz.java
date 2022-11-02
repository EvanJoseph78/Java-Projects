import java.util.Random;

import javax.swing.JOptionPane;

public class Matriz {
   public static void main(String[] args) {
        int[][] matrizA = matrizAleatoria(3, 3);
        mostrarMatriz(matrizA);
        int[][] matrizB = matrizAleatoria(2, 4);
        mostrarMatriz(matrizB);
        int[][] matrizC = inserirMatriz();
        mostrarMatriz(matrizC);


        
        
   } 
   

   public static int[][] matrizAleatoria(int linhas, int colunas) {
        int[][] matriz = new int[linhas][colunas];
        Random valorAleatorio = new Random();
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] =  valorAleatorio.nextInt(10) + 1;
            }
            
        }
        return matriz;
   } 

   public static int[][] inserirMatriz() {
    int linhas = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de linhas"));
    int colunas = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de colunas"));
    int[][] matriz = new int[linhas][colunas];
       for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Entre com um elemento da matriz")); 
            }
        
       } 
    return matriz;

   }

   public static void mostrarMatriz(int[][] matriz) {
        System.out.println("==============================");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
               System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("==============================");
   }

   
}

