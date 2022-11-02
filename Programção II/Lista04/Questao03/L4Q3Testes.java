package Lista04.Questao03;

public class L4Q3Testes {
    public static void main(String[] args) {
        ContaEspecial cliente = new ContaEspecial("Evandro Mariano", 400, 900);

        System.out.println(cliente);

        ContaCorrente cliente2 = new ContaCorrente("Evandro", 0);
        System.out.println(cliente2);
        cliente2.depositar(200);
        System.out.println(cliente2);
        cliente2.sacar(100);
        System.out.println(cliente2);
        cliente2.sacar(101);


        System.out.println("======");
        ContaEspecial cliente3 = new ContaEspecial("Evandro José", 100, 600);
        cliente3.sacar(500);
        System.out.println(cliente3);
        cliente3.sacar(200);
        System.out.println(cliente3);
        cliente3.sacar(1);
        
        System.out.println("==============");
        ContaCorrente cliente4 = new ContaCorrente("Naruto", 4000);
        System.out.println(cliente4);
        ContaCorrente cliente5 = new ContaCorrente("Gumbal", 200);
        System.out.println(cliente5);
        cliente4.transferir(cliente5, 10000);
        System.out.println(cliente4);
        System.out.println(cliente5);


    

    }
    
}
