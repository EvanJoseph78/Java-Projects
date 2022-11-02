import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Vestibular {
    public static void main(String[] args) {
        List<Candidato> listVest = new ArrayList<>();
        listVest.add(new Candidato(100, 30, false));
        listVest.add(new Candidato(100, 40, false));
        listVest.add(new Candidato(100, 50, true));

        Collections.sort(listVest);

        for (Candidato c: listVest) {
            System.out.println(c);
        }
        
    } 
}
