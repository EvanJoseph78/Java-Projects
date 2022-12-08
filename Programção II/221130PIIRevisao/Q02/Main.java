package Q02;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno("Evandro", 2021004, 1, 0.05f);
        a1.setPercentualCobranca(0.03f);
        a1.mostrarMensalidade();
        a2.mostrarMensalidade();
        a2.info();

        AlunoPos a3 = new AlunoPos("Evandro", 777, 1, 0.1f, "Inteligència Artificial", "Ednaldo Pereira", 300);
        a3.mostrarMensalidade();
        a3.info();
    } 
}
