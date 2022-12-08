package Q03;

public class MaquinaB extends Maquina {
    
    private double custo1Prod3, custo2Prod3, tempoProd3;

    public double getCusto1Prod3() {
        return custo1Prod3;
    }

    public void setCusto1Prod3(double custo1Prod3) {
        this.custo1Prod3 = custo1Prod3;
    }

    public double getCusto2Prod3() {
        return custo2Prod3;
    }

    public void setCusto2Prod3(double custo2Prod3) {
        this.custo2Prod3 = custo2Prod3;
    }

    public double getTempoProd3() {
        return tempoProd3;
    }

    public void setTempoProd3(double tempoProd3) {
        this.tempoProd3 = tempoProd3;
    }

    @Override
    public void produzirP1(int p1) {
        // TODO Auto-generated method stub
        super.produzirP1(p1);
    }
    
    
    public void produzirP3(int p3){
        double custo = (double) custo1Prod3 + custo2Prod3 * p3;
        double tempoProducao = (double) tempoProd3 * p3;
        System.out.println("Custo P3: " + custo);
        System.out.println("Tempo de produção P3: " + tempoProducao + " min");
    }
    
    
    public void produzirT(int p1, int p3){
        produzirP1(p1);
        produzirP3(p3);
    }
}
