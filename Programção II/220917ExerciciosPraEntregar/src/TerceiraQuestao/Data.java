package TerceiraQuestao;

public class Data {
    private int dia, mes, ano;
    public Data () {
        getDia();
        getMes();
        getAno();
    }
    
    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
}
