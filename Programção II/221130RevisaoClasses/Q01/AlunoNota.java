public class AlunoNota {
    private long matricula;
    private String nome;
    private float nota1, nota2, notaTrab;

    public AlunoNota() {}

    public AlunoNota(long matricula, String nome, float nota1, float nota2, float notaTrab) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaTrab = notaTrab;
    }

    public void notaFinal(float nota1, float notaTrab) {
        setNota1(nota1);
        setNotaTrab(notaTrab);
        float nota2 = (35 - nota1 * 2.5f - notaTrab * 2) / 2.5f; 
        if (nota2 < 0) {
            System.out.println("A nota necessária para o aluno " + this.nome+ " passar é: 0");
        }else{
            System.out.println("A nota necessária para o aluno " + this.nome+ " passar é: " + nota2);
        }
    }


    public void media() {
        float media = (nota1 * 2.5f + nota2 * 2.5f + notaTrab * 2) / (2.5f + 2.5f + 2f);
        System.out.println(media);
    }


    


    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public static void main(String[] args) {
        AlunoNota a1 = new AlunoNota(888888887, "Ednaldo", 8.7f, 4f, 9f);  
        a1.media();
        AlunoNota a2 = new AlunoNota();
        a2.setNome("Ednaldo Pereira");
        a2.notaFinal(5.5f, 9f);

    }

}