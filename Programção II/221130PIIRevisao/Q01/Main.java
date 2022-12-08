package Q01;

public class Main {
    public static void main(String[] args) {
        Pedido p1 = new Pedido ("Redmi", "Credito", 1500, "10/11/22");
        Pedido p2 = new Pedido ("Redmi", "Debito", 1500, "10/11/22");
        p1.info();
        p2.info();
    }
    
}
