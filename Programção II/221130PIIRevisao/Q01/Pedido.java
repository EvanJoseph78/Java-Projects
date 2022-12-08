package Q01;

public class Pedido {
    private String produto, opcPagamento;
    private int preco;
    private Pagamento pagamento;


    public Pedido(String produto, String opcPagamento, int preco, String data) {
        this.produto = produto;
        this.opcPagamento = opcPagamento;
        this.preco = preco;

        if (opcPagamento == "Credito") {
            this.pagamento = new Credito(preco);
            pagamento.setDataPagamento(data);
            pagamento.pagar();
        }else if (opcPagamento == "Debito"){
            this.pagamento = new Debito(preco);
            pagamento.setDataPagamento(data);
            pagamento.pagar();
        }

        

    }


   

    @Override
    public String toString() {
        return "Pedido [produto=" + produto + ", opcPagamento=" + opcPagamento + ", preco=" + preco + ", pagamento="
                + pagamento + "]";
    }




    public void info() {
        System.out.println("---------------------------------------------------");
        System.out.println("Produto: " + produto);
        System.out.println("Opção de pagamento: " + opcPagamento);
        System.out.println("Valor a ser pago: " + pagamento.getValorPagamento());
        System.out.println("Data: " + pagamento.getDataPagamento());
    }

    

    
    
}
