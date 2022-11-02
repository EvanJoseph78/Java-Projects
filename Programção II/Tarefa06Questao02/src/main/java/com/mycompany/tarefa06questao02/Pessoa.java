/*
Evandro Mariano
202118640004
Tarefa 06 - SIGAA
Questão 02
*/
package com.mycompany.tarefa06questao02;


public class Pessoa {
    private String nome;
    private int cpf;

    Pessoa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNome() {
        return nome;
    }

    public Pessoa(int cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return nome + " cpf: " + cpf;
    }

    public Pessoa(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
}
