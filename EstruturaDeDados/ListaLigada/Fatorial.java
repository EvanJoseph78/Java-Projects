public class Fatorial {
    public static void main(String[] args) {
        System.out.println(fatorial(13));
    }

    public static int fatorial(int num) {
        int fat;
        if (num == 0) {
            fat = 1;
        } else {
            fat = num * fatorial(num - 1);
        }
        return fat;
    } 
}
