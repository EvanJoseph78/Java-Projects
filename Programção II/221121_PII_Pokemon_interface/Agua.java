public class Agua extends Pokemons {
    private String tipo = "Agua";
    private Poderes poderes = new Poderes();
    
    public Agua(String nome, int vida, int atk, int def, int nivel) {
        super(nome, vida, atk, def, nivel);
    }
    
    @Override
    public void info() {
        super.info();
        System.out.println(getNome() + "\nTipo: " + this.tipo + " \nNivel: " + getNivel());
        System.out.println("==============================================================");
        poderes.mov001();
        System.out.println(poderes.getName());
        System.out.println("==============================================================");
    }


}
