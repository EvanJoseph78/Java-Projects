import java.util.Random;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int[][] matrizA = novaMatriz();
        mostrarMatriz(matrizA);
        int[][] matrizB = novaMatriz();
        mostrarMatriz(matrizB);
        
        
        somaDuasMatrizes(matrizA, matrizB);
        multiplicaDuasMatrizes(matrizA, matrizB);
        subtraiDuasMatrizes(matrizA, matrizB);
        multiplicaMatrizComUmValor(matrizA, matrizB);

    }

    public static int[][] novaMatriz() {
        int numLinhas = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número de linhas da matriz"));
        int numColunas = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número de colunas da matriz"));
        int matrizAleatoria = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 - Gerar matriz aleatória\nDigite 2 - Definir os elementos da matriz"));

        int[][] matriz = new int[numLinhas][numColunas];
        
        if (matrizAleatoria == 1) {
           Random aleatorio = new Random();
           for (int i = 0; i < numLinhas; i++) {
                for (int j = 0; j < numColunas; j++) {
                    matriz [i][j] = aleatorio.nextInt(101); 
                } 
           } 
        }else {
           for (int i = 0; i < numLinhas; i++) {
            for (int j = 0; j < numColunas; j++) {
                matriz [i][j] = Integer.parseInt(JOptionPane.showInputDialog("Entre com o elemento da linha " + i + " coluna 1" + j));
            }
        } 
        }
        

        return matriz;
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println();
            
        }
        System.out.println("==============================");
    }

    public static int[][] retornaSomaDuasMatrizes(int[][] matrizA, int[][] matrizB) {
        if((matrizA.length == matrizB.length) && (matrizA[0].length == matrizB[0].length)) {
            int[][] somaDasMatrizes = new int [matrizA.length][matrizA[0].length];
            for (int i = 0; i < matrizB.length; i++) {
                for (int j = 0; j < matrizB[0].length; j++) {
                   somaDasMatrizes[i][j] = matrizA[i][j] + matrizB[i][j];
                }
                
            }
            return somaDasMatrizes;
        }else {
            int[][] somaDasMatrizes = new int [matrizA.length][matrizA[0].length];
            for (int i = 0; i < matrizB.length; i++) {
                for (int j = 0; j < matrizB[0].length; j++) {
                   somaDasMatrizes[i][j] = 0;
                }
                
            }
            return somaDasMatrizes;
        }
    }


    public static void somaDuasMatrizes(int[][] matrizA, int[][] matrizB) {
        if((matrizA.length == matrizB.length) && (matrizA[0].length == matrizB[0].length)) {
            int[][] somaDasMatrizes = new int [matrizA.length][matrizA[0].length];
            for (int i = 0; i < matrizB.length; i++) {
                for (int j = 0; j < matrizB[0].length; j++) {
                   somaDasMatrizes[i][j] = matrizA[i][j] + matrizB[i][j];
                }
                
            }
            System.out.println("A soma das matrizes é: ");
            mostrarMatriz(somaDasMatrizes);
                
        }else {
            System.out.println("Não é possivel somar matrizes de tamanhos diferentes");
        }
    }

    public static void subtraiDuasMatrizes(int[][] matrizA, int[][] matrizB) {
        if((matrizA.length == matrizB.length) && (matrizA[0].length == matrizB[0].length)) {
            int[][] subtracaoDasMatrizes = new int [matrizA.length][matrizA[0].length];
            for (int i = 0; i < matrizB.length; i++) {
                for (int j = 0; j < matrizB[0].length; j++) {
                   subtracaoDasMatrizes[i][j] = matrizA[i][j] - matrizB[i][j];
                }
                
            }
            System.out.println("A subtração das matrizes é: ");
            mostrarMatriz(subtracaoDasMatrizes);
                
        }else {
            System.out.println("Não é possivel subtrair matrizes de tamanhos diferentes");
        }
    }

    public static void multiplicaDuasMatrizes(int[][] matrizA, int[][] matrizB) {
        if((matrizA.length == matrizB.length) && (matrizA[0].length == matrizB[0].length)) {
            int[][] multiplicacaoDasMatrizes = new int [matrizA.length][matrizA[0].length];
            for (int i = 0; i < matrizB.length; i++) {
                for (int j = 0; j < matrizB[0].length; j++) {
                   multiplicacaoDasMatrizes[i][j] = matrizA[i][j] * matrizB[i][j];
                }
                
            }
            System.out.println("A multiplicação das matrizes é: ");
            mostrarMatriz(multiplicacaoDasMatrizes);
                
        }else {
            System.out.println("Não é possivel multiplicar matrizes de tamanhos diferentes");
        }
    }

    public static void multiplicaMatrizComUmValor(int[][] matrizA, int[][] matrizB) {
        int[][] matrizMultiplicada = new int [matrizA.length][matrizA[0].length];
        int multiplicador = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número pra multiplicar a matriz"));
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                matrizMultiplicada[i][j] = matrizA[i][j] * multiplicador;
            }
            
        }
        System.out.println("A multiplicação da matriz com o número escolhido é: ");
        mostrarMatriz(matrizMultiplicada);
                
    }
}
