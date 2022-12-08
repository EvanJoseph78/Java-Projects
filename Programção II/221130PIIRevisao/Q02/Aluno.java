package Q02;

import java.util.Date;

public class Aluno {
    private int nMatricula, codCurso;
    private String nome;
    private Date dataNascimento;
    private double percentualCobranca;
    private double mensalidade;
    
    public static final byte arquitetura = 1;
    public static final byte cienciaDeComputacao = 2;
    public static final byte engenharia = 3;
    public static final byte biomedicina = 4;

    
    public Aluno () {}

    public Aluno(String nome, int nMatricula, int codCurso, double percentualCobranca) {
        this.nMatricula = nMatricula;
        this.codCurso = codCurso;
        this.nome = nome;
        this.percentualCobranca = percentualCobranca;
        setarMensalidade();
        if (codCurso < 1 || codCurso > 4) {
            System.out.println("Este curso não existe!");
        }else{
            switch (codCurso) {
                case 1:
                    mensalidade = (Double) (450 + 450 * this.percentualCobranca);
                    break;
                case 2:
                    mensalidade = (Double) (650 + 650 * this.percentualCobranca);
                    break;
                case 3:
                    mensalidade = (Double) (850 + 850 * this.percentualCobranca);
                    break;
                case 4:
                    mensalidade = (Double) (750 + 750 * this.percentualCobranca);
                    break;
            }
        }
    }


    public void setarMensalidade() {
        double mensalidade = 0;
        int i = getCodCurso();
        switch (i) {
            case 1:
                mensalidade = (Double) (450 + 450 * this.percentualCobranca);
                break;
            case 2:
                mensalidade = (Double) (650 + 650 * this.percentualCobranca);
                break;
            case 3:
                mensalidade = (Double) (850 + 850 * this.percentualCobranca);
                break;
            case 4:
                mensalidade = (Double) (750 + 750 * this.percentualCobranca);
                break;
        }

        this.mensalidade = mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }
    

    public double getMensalidade() {
        return mensalidade;
    }

   

    public void mostrarMensalidade() {
        System.out.printf("A mensalidade é: R$ %.2f\n", this.mensalidade);
    }

    public void info() {
        System.out.println("======================================");
        System.out.println("Aluno: " + getNome() + " - " + getnMatricula());
        System.out.printf("Mensalidade: R$ %.2f\n", getMensalidade());
        System.out.println("======================================");
    }




    public int getnMatricula() {
        return nMatricula;
    }
    public void setnMatricula(int nMatricula) {
        this.nMatricula = nMatricula;
    }
    public int getCodCurso() {
        return codCurso;
    }
    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public double getPercentualCobranca() {
        return percentualCobranca;
    }
    public void setPercentualCobranca(double percentualCobranca) {
        this.percentualCobranca = percentualCobranca;
    }


    
}
