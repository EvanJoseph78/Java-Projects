public class ListaC {
    public static void main(String[] args) {
        Lista l = new Lista(6);
        l.exibir(); 
        l.tamanhoLista();
        l.somaMedia();
        System.out.println("O tamanho da lista, no metódo retorno é: " + l.tamanhoRetorno());
        l.setarElemento(3, 0);
        l.setarElemento(8, 1);
        l.setarElemento(9, 2);
        l.tamanhoDaLista();
        l.somaMedia();
        l.setarElemento(5, 3);
        l.somaMedia();

        l.exibir();
        System.out.println("O tamanho da lista, no metódo retorno é: " + l.tamanhoRetorno());
        System.out.println("Pausa 1");

        l.acessarValor(10);
        l.acessarValor(0);
        l.acessarValor(3);
        l.acessarValor(-4);
        l.exibir();
        System.out.println("Pausa 2");

        l.exibir(); l.alterar(2, 71);
        l.exibir();
        int posi = 2;
        int retorno = l.acesso(posi);

        if (retorno == -9999) {
            System.out.println("Acesso inválido, posição fora da lista!");
        } else {
            System.out.println("O elemento que se encontra na posição " + posi + " é: " + retorno);
        }

        l.alterar(3, 50);
        l.alterar(2, 2);
        l.alterar(-9, 180);
        l.tamanhoLista();
        l.exibir();
        System.out.println("Pausa 3");

        l.somaMedia();
        l.acessarValor(2);
        l.remover(0); l.exibir();
        l.remover(2); l.exibir();
        l.remover(-1); l.alterar(2, 28);
        l.exibir();
        System.out.println("Pausa 4");

        l.acessarValor(2);

        l.inserir(0, 300); l.exibir();
        l.inserir(0, 10); l.inserir(2, 1100);
        l.tamanhoLista();
        l.inserir(0, 22);
        l.exibir(); System.out.println("Pausa 5");
        l.pesquisar(2);
        l.acessarValor(5);
        l.inserir(1, 30); l.exibir();
        System.out.println("O tamanho da lista, no metódo retorno é: " + l.tamanhoRetorno());
        l.inserir(10, 130);
        l.exibir(); System.out.println("Pausa 6");
        l.pesquisar(8);
        l.remover(-5); l.exibir();
        l.inserir(3, 55); l.exibir();
        l.remover(2); l.exibir();
        System.out.println("Imprimindo o elemento da posição tal: " + l.getElementosLista()[3]);
        l.exibir();
        l.acessarValor(0);
        l.tamanhoLista();
        
    }

}
