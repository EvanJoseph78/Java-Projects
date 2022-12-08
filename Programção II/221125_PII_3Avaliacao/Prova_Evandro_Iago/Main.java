/*Alunos: Evandro Mariano - Iago Oliveira

 */

public class Main {
    public static void main(String[] args) {

        Quarto q1 = new QuartoSolteiro(100, false, "10-11-22", 9);
        Quarto q2 = new QuartoDuplo(200, true, "11-12-11", 0);
        Cliente c1 = new Cliente(939382 , 10, q2);
    
        q2.valorLocacao();
        System.out.println(q2.valorConta(21, 12, 4, 5));
        q1.pedirConta(10, 2, 9, 2);

         
    }
}
