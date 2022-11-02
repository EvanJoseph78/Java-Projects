public class Fogo extends Pokemon {
    public void poder(){
        System.out.println("Lança chamas");
    } 

    @Override
    public void mov1() {
        System.out.println("Torre de chamas");
    }

    @Override
    public void mov2() {
        System.out.println("Brilho de sol");
    }
}
