package SegundaQuestao;

public class Data {
   private int mes, dia, ano;
   
   public void setAno(int ano) {
       this.ano = ano;
   }

   public void setDia(int dia) {
       this.dia = dia;
   }

   public void setMes(int mes) {
       this.mes = mes;
   }

   public int getAno() {
       return ano;
   }

   public int getDia() {
       return dia;
   }

   public int getMes() {
       return mes;
   }

   public void displayData() {
        System.out.format("A data é: %d/%d/%d\n", dia, mes, ano);
   }
}
