/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.estrudados220929;

/**
 *
 * @author evan
 */
public class EstruDados220929 {

    public static void main(String[] args) {
        Lista L = new Lista();
        L.N = 5;
        L.Elem[0] = 43;
        L.Elem[1] = 52;
        L.Elem[2] = 21;
        L.Elem[3] = 15;
        L.Elem[4] = 9;
        
        System.out.println(Acesso(L, 5));
        insereElemento(L, 2, 777);
        
        System.out.println(L.Elem[1]);
    }
    
    public static int Acesso(Lista L, int k) {
        //índice inválido
        
        if ((k < 0) || (k > (L.N - 1))){
            //código de erro
            return -3333;
        }else {
            return L.Elem[k];
        }
    }
    
    public static void insereElemento(Lista L, int k, int Val) {
        int i;
        if(L.N == L.Elem.length){
            System.out.println("Espaço esgotado!");
        }else if (k == L.N){
            L.Elem[k] = Val;
            L.N++;
        }else if ((k < 0) || (k > L.N - 1)) {
            System.out.println("Indice inválido!");
        }else {
            for (i = L.N - 1; i >= k; i--) {
                L.Elem[i + 1] = L.Elem[i];
                L.Elem[i + 1] = L.Elem[i];
            }
        }
    }
}
