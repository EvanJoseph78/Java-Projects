package Q03;

public class MaquinaA extends Maquina {
    private double custo1Prod2, custo2Prod2, tempoProd2;

    public double getCusto1Prod2() {
        return custo1Prod2;
    }

    public void setCusto1Prod2(double custo1Prod2) {
        this.custo1Prod2 = custo1Prod2;
    }

    public double getCusto2Prod2() {
        return custo2Prod2;
    }

    public void setCusto2Prod2(double custo2Prod2) {
        this.custo2Prod2 = custo2Prod2;
    }

    public double getTempoProd2() {
        return tempoProd2;
    }

    public void setTempoProd2(double tempoProd2) {
        this.tempoProd2 = tempoProd2;
    }

    @Override
    public void produzirP1(int p1) {
        // TODO Auto-generated method stub
        super.produzirP1(p1);
    }
    
    
    public void produzirP2(int p2){
        double custo = (double) custo1Prod2 + custo2Prod2 * p2;
        double tempoProducao = (double) tempoProd2 * p2;
        System.out.println("Custo P2: " + custo);
        System.out.println("Tempo de produção P2: " + tempoProducao + " min");
    }
    
    
    public void produzirT(int p1, int p2){
        produzirP1(p1);
        produzirP2(p2);
    }



}
