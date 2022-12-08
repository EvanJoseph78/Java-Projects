abstract class Animal implements SerVivo {
    private Boolean vivo;
    private int massa;
    private int x;
    private int y;
    private int vel;
    private int forca;


    public Animal(int vel, int massa, int forca){
        this.vivo = true;
        this.massa = massa;
        this.x = 0;
        this.y = 0;
        this.forca = forca;
        this.vel = vel;
    }

    public void setVivo(Boolean vivo) {
        this.vivo = vivo;
    }

    public Boolean getVivo() {
        return vivo;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getForca() {
        return forca;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public int getMassa() {
        return massa;
    }

    public void atacar(Animal a){
        if(this.vivo){
            if(this.forca > a.forca){
                this.forca += a.getMassa();
            }else{
                this.vivo = false;
            }
        }else{
            System.out.println("========================");
            System.out.println(this.getClass().toGenericString() + " está morto e não pode atacar");
            System.out.println("========================");
        }
    }

    public void mover(){
        if(this.vivo){
            this.x+=this.vel;
            this.y+=this.vel;
        }else{
            System.out.println("========================");
            System.out.println(this.getClass().toGenericString() + " está morto e não pode se mover");
            System.out.println("========================");
    
        }
    }
    public void comer(){
        if(this.vivo){
            this.forca += massa;
        }else{
            System.out.println("========================");
            System.out.println(this.getClass().toGenericString() + " está morto e não pode comer");
            System.out.println("========================");
        }       
    }
    public void info(){
        System.out.printf("Tipo.: %s%n", getClass().toGenericString());
        System.out.printf("Vivo.: %s%n", this.getVivo() ? "Sim" : "Não");
        System.out.printf("Massa.: %d%n", this.massa);
        System.out.printf("Vell...: %d%n", this.vel);
        System.out.printf("Força.: %d%n", this.vel);
        System.out.println("========================");
    }
    
}
