/*
Evandro Mariano
202118640004
Tarefa 06 - SIGAA
Questão 02
*/

package com.mycompany.tarefa06questao02;

public class Tarefa06Questao02 {
    public static void main (String args[]) {
        int[] listaCpf = {2211212,291921,391291,39939339, 873737273, 4444444, 77777777};
        String[] listaNome = {"Krikor", "Evandro", "Rafael", "Magnus", "Kasparov","Judite", "Karpov"};
        
        Pessoa[] listaPessoa = setCpfPessoa(listaCpf, listaNome);
        mostraVetor(listaPessoa);
    }
    
    public static void mostraVetor(Pessoa[] vetor) {
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]); 
        }
        
    }
    
    public static Pessoa[] setCpfPessoa(int[] listaCpf, String[] listaNome) {
        Pessoa[] listaPessoa = new Pessoa[listaCpf.length];
        
        for (int i = 0; i < listaCpf.length; i++) {
            listaPessoa[i] = new Pessoa(listaNome[i], listaCpf[i]);
        }
        return listaPessoa;
    }
    
    
}


