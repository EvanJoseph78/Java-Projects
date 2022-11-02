public class Candidato implements Comparable <Candidato>{
    private int nota, idade;
    private boolean deficiente;
    
    public Candidato(int nota, int idade, boolean deficiente) {
        this.nota = nota;
        this.idade = idade;
        this.deficiente = deficiente;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isDeficiente() {
        return deficiente;
    }

    public void setDeficiente(boolean deficiente) {
        this.deficiente = deficiente;
    }

    @Override
    public int compareTo(Candidato o) {
        if (this.nota == o.getNota()) {
            if (this.deficiente == o.isDeficiente()) {
                return this.idade - o.getIdade();
            } else {
                if (this.deficiente) {
                    return 1;
                } else {
                    return -1;
                }

            }
        } else {
            return nota - o.getNota();
        }
    }

    @Override
    public String toString() {
        return "Candidato [nota=" + nota + ", idade=" + idade + ", deficiente=" + deficiente + "]";
    }
    
    
}
