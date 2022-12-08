package Q03;

public class Maquina {
    private double custo1Prod1, custo2Prod1, tempoProd1;

    public double getCusto1Prod1() {
        return custo1Prod1;
    }

    public void setCusto1Prod1(double custo1Prod1) {
        this.custo1Prod1 = custo1Prod1;
    }

    public double getCusto2Prod1() {
        return custo2Prod1;
    }

    public void setCusto2Prod1(double custo2Prod1) {
        this.custo2Prod1 = custo2Prod1;
    }

    public double getTempoProd1() {
        return tempoProd1;
    }

    public void setTempoProd1(double tempoProd1) {
        this.tempoProd1 = tempoProd1;
    }

    public void produzirP1(int p1){
        double custo = (double) custo1Prod1 + custo2Prod1 * p1;
        double tempoProducao = (double) (tempoProd1 * p1);
        System.out.println("Custo P1: " + custo);
        System.out.println("Tempo de produção P1: " + tempoProducao + " min");
    }


    public static void main(String[] args) {
        MaquinaA m1 = new MaquinaA();
        m1.setCusto1Prod1(100);
        m1.setCusto2Prod1(299);
        m1.setCusto2Prod1(111);
        m1.setCusto2Prod2(88);
        m1.setTempoProd1(3);
        m1.setTempoProd2(4);
        // m1.produzirP1(13);
        m1.produzirT(10,11);
    }

    
}
