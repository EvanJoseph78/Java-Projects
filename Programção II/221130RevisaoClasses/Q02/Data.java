package Q02;

public class Data {

    private int dia = 1, mes = 1, ano = 1;
    private int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private String[] meses = {"Janeiro", "Feveiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
    

    public Data() {}

    public Data(int dia, int mes, int ano) {
        if (ano % 4 == 0) {
            this.diasMes[1] = 29;
        }

        if (mes > 0 && mes <= 12 && ano >= 0) {
            this.mes = mes;
            this.ano = ano;
            if (dia <= diasMes[mes - 1]) {
                this.dia = dia;
            }else {
                this.dia = 1;
                this.mes = 1;
                this.ano = 1;
            }

        }else {
                this.dia = 1;
                this.mes = 1;
                this.ano = 1;           
        }
    }

    public void clone(Data d) {
        this.dia = d.dia;
        this.mes = d.mes;
        this.ano = d.ano;
    }

    public Data clonar() {
        return new Data(getDia(), getMes(), getAno());
    }

    public int comparar(Data d2) {
        if (getAno() > d2.ano) {
            return 1;
        }else if(getAno() < d2.ano) {
            return -1;
        }else {
            if (getMes() > d2.mes) {
                return 1;
            } else if (getMes()< d2.mes) {
                return -1;
            }else {
                if (getDia() > d2.dia) {
                    return 1;
                }else if (getDia() < d2.dia) {
                    return -1;
                }else {
                    return 0;
                }
            }
        }
    }

    public void getMesExtenso() {
        System.out.println(meses[getMes() - 1]);
    }

    public void isBissexto() {
        if(getAno() % 4 == 0) {
            System.out.println("O ano é bissexto");
        }else {
            System.out.println("O ano não é bissexto");
        }
    }


    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int[] getDiasMes() {
        return diasMes;
    }

    public void setDiasMes(int[] diasMes) {
        this.diasMes = diasMes;
    }


    public static void main(String[] args) {
        Data d1 = new Data(29,12,2016);
        // Data d2 = new Data();
        Data d3 = d1.clonar();
        System.out.println(d3);
        // d2.clone(d1);
        // d2.getMesExtenso();
        // d2.isBissexto();
        // System.out.println(d2);
        // System.out.println(d1.getDia());
        // System.out.println(d1.comparar(d2));
    }

}
