public class Vegetal {
    private Boolean vivo;
    private int massa;
    
    public Vegetal(int massa){
        this.massa = massa;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public void setVivo(Boolean vivo) {
        this.vivo = vivo;
    }

    public Boolean getVivo() {
        return vivo;
    }

    public void info(){
        System.out.printf("Tipo.: %s%n", getClass().toGenericString());
        System.out.printf("Vivo.: %s%n", this.getVivo() ? "Sim" : "Não");
        System.out.printf("Massa.: %d%n", this.massa);
        System.out.println("========================");
    }
}