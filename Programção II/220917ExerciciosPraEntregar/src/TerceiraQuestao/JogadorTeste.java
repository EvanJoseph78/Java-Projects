package TerceiraQuestao;

public class JogadorTeste {
   public static void main(String[] args) {
        Jogador jogador1 = new Jogador();
        jogador1.setNome("Edmundo");
        jogador1.setNumero(10);
        jogador1.setId(2020);
        jogador1.setApelido("Animal");
        jogador1.setDataNascimento("19/09/1991");
        jogador1.setCartoes(1);
        jogador1.setPosicao("Atacante");
        jogador1.setQualidade(8);
        jogador1.setSupenso(false);

        jogador1.fichaTecnica();
   } 
   
}
