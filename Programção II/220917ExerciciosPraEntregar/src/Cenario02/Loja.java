package Cenario02;

public class Loja {
   public static void main(String[] args) {
        Livros livro = new Livros("Fernando pessoa", "À beira do mar", 17);
        CDs cd = new CDs(8, "Roberto carlos em detalhes", 200);
        DVDs dvd = new DVDs(180, "Harry potter", 21.09f);
        Livros livro1 = new Livros("Machado de assis", "Pai rico pai pobre", 19.9f);
        DVDs dvd1 = new DVDs(80, "Os pinguins de madagascar", 18.4f);

        Produtos[] listaDepProdutos = {livro, cd, dvd, livro1, dvd1};

        System.out.println();
        for (int i = 0; i < listaDepProdutos.length; i++) {
            listaDepProdutos[i].mostraInformacoes();
            System.out.println();
        }
        System.out.println("--------------");
        System.out.println(livro);
        
        System.out.println("--------------");
        System.out.println(dvd1);

        System.out.println("--------------");
        System.out.println(listaDepProdutos[3]);
   } 
}
