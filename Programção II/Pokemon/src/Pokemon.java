public class Pokemon {
    private String nome;

    //polimorfismo de sobrecarga
    public Pokemon() {

    }

    public Pokemon(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    } 

    public void poder() {
        System.out.println();
    }

    public void mov1() {
        System.out.println();
    }

    public void mov2() {
        System.out.println();
    }

    public void mov3() {
        System.out.println();
    }

    public void mov4() {
        System.out.println();
    }

}
