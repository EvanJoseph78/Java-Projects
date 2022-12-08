public class Agua implements Pookemon, Poder {
    private String nome;


    public void status() {
        System.out.println(nome);
    }
    
    @Override
    public String getNome() {
        // TODO Auto-generated method stub

        return null;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void mov001() {
        System.out.println("Choque do trovão");
    }
    
}
