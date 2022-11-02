package TerceiraQuestao;

public class Jogador{
    private int id, numero, qualidade, cartoes;
    private String nome, apelido, dataNascimento, posicao;
    private Boolean supenso;

    //construtor

    public Jogador(){
    
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setQualidade(int qualidade) {
        this.qualidade = qualidade;
    }
    public void setCartoes(int cartoes) {
        this.cartoes = cartoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void setSupenso(Boolean supenso) {
        this.supenso = supenso;
    }

    //getters
    public String getApelido() {
        return apelido;
    }
    public int getCartoes() {
        return cartoes;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public int getNumero() {
        return numero;
    }
    public String getPosicao() {
        return posicao;
    }
    public int getQualidade() {
        return qualidade;
    }
    public Boolean getSupenso() {
        return supenso;
    }

    public void fichaTecnica () {
        System.out.println("Jogador: " + this.nome + "\nCamisa: " + this.numero + "\nID: " + this.id + " \nApelido: " + this.apelido + "\nData de Nascimento: " + this.dataNascimento + "\nPosição: " + this.posicao + "\nNúmero de cartões: " +this.cartoes + "\nQualidade: " + this.qualidade);

        if (this.supenso == true) {
            System.out.println("Expulso: sim");
        }else{
            System.out.println("Expulso: não");
        }
    }

}
