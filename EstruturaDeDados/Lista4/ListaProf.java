/* 
public class ListaProf {
    public class manipulacaoLista {

        //1) Inserir elemento na lista
        public void Inserir(lista L, int indice, int valor) {
        int i;
            if (L.N == 10) // espaço esgotado
            {
                System.out.println("Espaço esgotado! Não pode inserir!");
            }else if (indice == L.N) {
                 //apos o ultimo elemento
                L.Elem[indice] = valor;
                L.N++;
            }else if ((indice < 0) || (indice > L.N - 1))
             //índice inválido
            {
            System.out.println("Impossivel inserir em um indice inválido!");
            }else{
                for (i = L.N - 1; i >= indice; i--) //deslocar elementos a direita
            {
                L.Elem[i + 1] = L.Elem[i];
            }
                L.Elem[indice] = valor;
                L.N++; //ajustar tamanho da LISTA
            }
        }
    
        //2) Alterar um elemento inserido na k-esima posição. EX: alterar o valor da posição 3 do vetor
        public void Alterar(lista L, int indice, int valor) {
            if ((indice < 0) || (indice > L.N - 1)) {
                System.out.println("Não se pode alterar um indice invalido!");
            }else{
                L.Elem[indice] = valor;
            }
        }
        
        //3) Remover a k-ésima posição. EX: remover a posição 1 do vetor
        public void Remover(lista L, int indice) {
        int i;
            if (indice < 0 || indice > L.N - 1) // índice inválido
            {
                System.out.println("Impossivel remover um indice inválido!");
            }else{
                for (i = indice; i < L.N - 1; i++) //deslocar elementos a esqu.
            {
                L.Elem[i] = L.Elem[i + 1];
            }
                L.N--; //ajustar o tamanho da LISTA
            }
        }
        
        //4) Exibir a lista. Item por Item.
        public void Exibir(lista L) {
            if (L.N != 0) // Verificar se tem elemento
            {
                System.out.print("Lista: ");
                    for (int i = 0; i < L.N; i++) {
                        System.out.print(L.Elem[i] + " ");
                    }
                System.out.println("");
            }else{
                System.out.println("Lista vazia, sem elementos!");
            }
        }
        //5) Acessar tamanho da lista 
        public void exibirTamanho(lista L){
            System.out.println("A lista contém: " + L.N + " elementos");
        }
    
        //6) Localizar um valor na lista
        public void localizar(lista L, int procurado){
            int i;
            for(i = 0; i < L.N; i++){
                if(L.Elem[i] == procurado){
                    break;
                }
            }
            if(i<L.N){
                System.out.println("Valor " + L.Elem[i] + " encontrado na posição: " + i);
            }else{
                System.out.println("valor não encontrado");
            }
    }
    
        //7) metodo para mostrar o valor da posição
        public void AcessoValor(lista L, int indice) {
            if ((indice < 0) || (indice > L.N - 1)) {
                System.out.println("Acesso inválido. Numero fora da lista!");
            }else{
                System.out.println("O numero da posicao: " + indice + " é " + L.Elem[indice]);
            }
        }
    
        //8) metodo que soma todos os elementos da lista
        public void somaLista(lista L){
            int totalSoma = 0;
            if(L.N>0){
                for(int i=0; i<L.N;i++){
                    totalSoma += L.Elem[i];
                }
            System.out.println("Soma entre os elementos presente na lista é: " + totalSoma);
            }else{
                System.out.println("Lista vazia, não existe soma de elementos");
            }    
        }
    
        //9) metodo que calcula a média entre os elementos da lista
        public void mediaLista(lista L){
            float totalSoma = 0;
            if(L.N > 0){
                for(int i =0; i<L.N; i++){
                    totalSoma += L.Elem[i];
                }
            float media = totalSoma / L.N;
            System.out.format("A média entre os elementos da lista é: %.2f", media);
            }else{
                System.out.println("Lista vazia, não existe média");;
            }
        }
    } 
}
*/