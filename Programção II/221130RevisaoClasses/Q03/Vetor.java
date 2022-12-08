package Q03;

public class Vetor {

    private int tamanho, size;
    private String[] v;
    private String[] vAux;

    public Vetor(int tamanho) {
        this.tamanho = tamanho;
        this.v = new String[tamanho];
        this.size = 0;
    }
    
    public void insert(String elemento) {
        if (tamanho == size) {
            this.tamanho++;
            this.vAux = this.v;
            this.v = new String[tamanho];
            vetorAux(vAux, v);
            this.v[tamanho - 1] = elemento;
        }else {
            v[size] = elemento;
        }
        size++;
    }

    public void mostrarVetor() {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + ", ");
        }
        System.out.println();
    }

    public void vetorAux(String[] vAux, String[] v) {
        for (int i = 0; i < vAux.length; i++) {
            v[i] = vAux[i];
        }
    }

    public String getPosicao(int posicao) {
        if (posicao < 0 || posicao > this.tamanho - 1) {
            return null;
        }else if(this.v[posicao] == null) {
            return null;
        }else {
            return this.v[posicao];
        }
    }

    public int size() {
        return v.length;
    }



    public static void main(String[] args) {
       Vetor v = new Vetor(3); 
       v.insert("Evandro");
       v.insert("José");
       v.insert("da");
       v.insert("Silva");
       v.insert("Mariano");
       v.insert("Evan Joseph");
       v.mostrarVetor();
       System.out.println(v.getPosicao(5));
       System.out.println(v.size());
    }
}
