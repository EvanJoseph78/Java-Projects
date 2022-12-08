import java.util.Random;

public class Poderes {
    private int dano;
    private String tipo, name;

    public int mov001(){
        this.name = "Ataque bolha";
        Random random = new Random();
        this.tipo = "agua";
        int critico = random.nextInt(4);
        if(critico == 1){
            this.dano = 25;
        }else{
            this.dano = 15;
        }

        return dano;
    }

    public int mov002(){
        this.name = "Lança chamas";
        this.tipo = "fogo";
        Random random = new Random();
        int critico = random.nextInt(1);
        if(critico == 1){
            this.dano = 28;
        }else{
            this.dano = 16;
        }

        return dano;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
