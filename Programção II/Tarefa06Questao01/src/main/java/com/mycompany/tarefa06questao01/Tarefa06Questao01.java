/*
Evandro Mariano
202118640004
Tarefa 06 - SIGAA
Questão 01
*/

package com.mycompany.tarefa06questao01;

public class Tarefa06Questao01 {

    public static void main(String[] args) {
        Alunos a1 = new Alunos("Anatoly karpov", "20212834004", 4.9f, 5, 5);
        a1.verificaSePassou();
        Alunos a2 = new Alunos("Ednaldo Pereira", "2021009348", 9, 8, 9.5f);
        a2.verificaSePassou();
    }
}
