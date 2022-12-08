public class Frigobar {
    
    private float bebida, doces, petiscos, biscoitos;
    private float precoBebida = 4.00f , precoDoces = 2.00f, precoPetiscos = 5f, precoBiscoito = 4.50f;


    public Frigobar(float bebida, float doces, float petiscos, float biscoitos) {
        this.bebida = bebida;
        this.doces = doces;
        this.petiscos = petiscos;
        this.biscoitos = biscoitos;
    }

    public float valorDaConta () {
        return bebida * precoBebida + doces * precoDoces + petiscos * precoPetiscos + biscoitos * precoBiscoito ; 
    }

    

    





}
