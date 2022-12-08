package Q02;

public class AlunoPos extends Aluno {
    private String linhaDepPesquisa, orientador;
    private double bolsaDeEstudos;

    public AlunoPos(String nome, int nMatricula, int codCurso, double percentualCobranca, String linhaDepPesquisa, String orientador, double bolsaDeEstudos) {
        super(nome, nMatricula, codCurso, percentualCobranca);
        this.linhaDepPesquisa = linhaDepPesquisa;
        this.orientador = orientador;
        this.bolsaDeEstudos = bolsaDeEstudos;
        setMensalidade(getMensalidade() - this.bolsaDeEstudos);
    }

    @Override
    public void info() {
        System.out.println("======================================");
        System.out.println("Aluno: " + getNome() + " - " + getnMatricula());
        System.out.println("Linha de pesquisa: " + getLinhaDepPesquisa());
        System.out.println("Orientador: " + getOrientador());
        System.out.printf("Mensalidade: R$ %.2f\n", getMensalidade());
        System.out.printf("Valor da bolsa: R$ %.2f\n", this.getBolsaDeEstudos());
        System.out.println("======================================");
    }

    public String getLinhaDepPesquisa() {
        return linhaDepPesquisa;
    }
    public void setLinhaDepPesquisa(String linhaDePesquisa) {
        this.linhaDepPesquisa = linhaDePesquisa;
    }
    public String getOrientador() {
        return orientador;
    }
    public void setOrientador(String orientador) {
        this.orientador = orientador;
    }
    public double getBolsaDeEstudos() {
        return bolsaDeEstudos;
    }
    public void setBolsaDeEstudos(double bolsaDeEstudos) {
        this.bolsaDeEstudos = bolsaDeEstudos;
    }

    
}
