import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int numInteiro = Integer.parseInt(JOptionPane.showInputDialog("Entre com o tamanho do vetor"));
        int listaInteiros[] = new int[numInteiro];
        int i = 0;
        int numEntre10e15 = 0; // variável pra guardar os valores entre 10 e 15
        int qPares = 0; // quantidades de números pares
        int menorNum = 100000;
        int posicaoMenorNum = 0;
        int somaDosElementos = 0;
        while (i < numInteiro) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número"));
            listaInteiros[i] = num;
            System.out.print(listaInteiros[i] + " ");
            numEntre10e15 = numEntre10e15 + entre10e15(listaInteiros[i]); // testa se o número guardado no vetor é maior que 10 e menor que 15
            qPares = qPares + verificaPares(listaInteiros[i]); // verifica quantidade de números pares
            menorNum = menorNumero(listaInteiros[i], menorNum); // passa os parâmetros pra função que retorna o menor número
            if (listaInteiros[i] == menorNum) { // verifica a posicao do menor numero
                    posicaoMenorNum = i;
               }
            i = i + 1;
        }
        somaDosElementos = somaOsElementos(listaInteiros);
        
        System.out.println("\nOs números entre 10 e 15 são: " + numEntre10e15);
        System.out.println("A quantidade de números pares é de: " + qPares);
        System.out.println("O menor número é: " + menorNum);
        System.out.println("A posição do menor número é: " + posicaoMenorNum);
        System.out.println("A soma dos elementos do vetor é: " + somaDosElementos);
        ordemInversa(listaInteiros, numInteiro);
    }

    //funcão para verificar os valores ente 10 e 15
    public static int entre10e15(int num) {
        if (num > 10 && num < 15) {
            return 1;
        }else {
            return 0;        
        }
    }

    // funcão para testar se um número é par
    public static int verificaPares(int num) {
        if (num % 2 == 0) {
            return 1;
        }else{
            return 0;
        }
    }

    // verifica o menor número
    public static int menorNumero(int num, int menorNumero) {
        if (num < menorNumero) {
            menorNumero = num;
        }
        return menorNumero;
    }
    // muda a ordem do vetor
    public static void ordemInversa(int list[], int tamanhoDoVetor) {
        System.out.println("teste");
        System.out.println(tamanhoDoVetor);
        System.out.print("O números na ordem inversa são: \n[");
        while(tamanhoDoVetor > 1) {
            tamanhoDoVetor = tamanhoDoVetor - 1;
            System.out.print(list[tamanhoDoVetor] + " ");
        }
        System.out.println(list[0] + "]");

    }
    public static int somaOsElementos(int vetor[]) {
        int somaDosElementos = 0;
        for (int i = 0; i < vetor.length; i++) {
           somaDosElementos = somaDosElementos + vetor[i]; 
        }
        return somaDosElementos;
        
    }

    
}
