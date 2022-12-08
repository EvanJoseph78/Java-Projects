package Q04;

public class Fatura {
    private int numItem, qntItem;
    private String desItem;
    private float precoItem;
    

    public Fatura (String desItem, int qntItem, int numItem, float precoItem) {
        this.numItem = numItem;
        this.desItem = desItem;
        if (qntItem < 0) {
            this.qntItem = 0;
        }else {
            this.qntItem = qntItem;
        }

        if (precoItem < 0) {
            this.precoItem = 0.0f;
        }else {
            this.precoItem = precoItem;
        }
    }


    public int getNumItem() {
        return numItem;
    }


    public void setNumItem(int numItem) {
        this.numItem = numItem;
    }


    public int getQntItem() {
        return qntItem;
    }


    public void setQntItem(int qntItem) {
        if (qntItem < 0) {
            this.qntItem = 0;
        }else {
            this.qntItem = qntItem;
        }
    }


    public String getDesItem() {
        return desItem;
    }


    public void setDesItem(String desItem) {
        this.desItem = desItem;
    }


    public float getPrecoItem() {
        return precoItem;
    }


    public void setPrecoItem(float precoItem) {
        if (precoItem < 0) {
            this.precoItem = 0.0f;
        }else {
            this.precoItem = precoItem;
        }
    } 

    public void calcularValorFatura() {
        System.out.print("O valor da fatura é: ");
        System.out.println(getQntItem() * getPrecoItem());
    }


    public static void main(String[] args) {
        Fatura f1 = new Fatura("Barbeador", 2, 9, 55.90f);
        f1.calcularValorFatura();
    }

    
}
