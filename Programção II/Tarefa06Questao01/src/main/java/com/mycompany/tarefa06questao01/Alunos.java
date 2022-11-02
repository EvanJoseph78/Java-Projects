/*
Evandro Mariano
202118640004
Tarefa 06 - SIGAA
Questão 01
*/

package com.mycompany.tarefa06questao01;

public class Alunos {
    private String nome, matricula;
    private float nota1, nota2, notaTrab;
    private float media;

    public Alunos() {} 

    public Alunos (String nome, String matricula, float nota1, float nota2, float notaTrab) {
            this.nome = nome;
            this.matricula = matricula;
            this.nota1 = nota1;
            this.nota2 = nota2;
            this.notaTrab = notaTrab;
            this.media = media();
    }

    public float media() {
        return (float) ((this.nota1 * 2.5 + this.nota2 * 2.5 + this.notaTrab * 2) / 7);
    }

    public void verificaSePassou() {
        if (this.media < 5) {
            if (this.nota1 < this.nota2) {
                float notaFinal = (float) ((5 * 7 - this.nota2 * 2.5 - notaTrab * 2) / 2.5);
                System.out.println(notaFinal);
                System.out.println("O aluno: " + this.nome + " foi reprovado!" + "\nPrecisa tirar " + notaFinal + " para passar");
            }else {
                float notaFinal = (float) ((5 * 7 - this.nota1 * 2.5 - notaTrab * 2) / 2.5);
                System.out.println("O aluno: " + this.nome + " foi reprovado!" + "\nPrecisa tirar " + notaFinal + " para passar");
            }
        }else if (media < 7) {
            System.out.println(this.nome + " aprovado com com conceito REGULAR!");
        }else if (media < 9) {
            System.out.println(this.nome + " aprovado com conceito BOM!");
        }else {
            System.out.println(this.nome + " aprovado com conceito EXCELENTE!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNotaTrab() {
        return notaTrab;
    }

    public void setNotaTrab(float notaTrab) {
        this.notaTrab = notaTrab;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }
}
