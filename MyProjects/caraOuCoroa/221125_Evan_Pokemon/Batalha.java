import java.util.Random;

public class Batalha {
    Pokemon p1, p2;
    Random random = new Random();

    public void iniciarBatalha(Pokemon p1, Pokemon p2) {
        this.p1 = p1;
        this.p2 = p2;
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(p1.getNome() + " -VS- " +p2.getNome());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
       
        if (p1.getSpeed() > p2.getSpeed()) {
            lutar(p1, p2);
        }

        if (p1.getSpeed() < p2.getSpeed()) {
            lutar(p2, p1);
        }

        if (p1.getSpeed() == p2.getSpeed()) {
            
            int sort = random.nextInt(1);
            switch (sort) {
                case 0:
                    lutar(p1, p2);
                    break;
                case 1:
                    lutar(p2, p1);
                    break;
            }
        }
    }

    public void atacar1(Pokemon p1, Pokemon p2) {
        System.out.println(p1.getNome() + " usou o " + p1.getMov001().getName());
        if (chanceErro(p1)) {
            p2.setHp(p2.getHp() + p2.getDefense() - p1.getAtk() - p1.getMov001().getPower());
            System.out.println(p2.getNome() + " perdeu " + (p1.getAtk() - p1.getMov001().getPower()) + " pontos de vida");
            p1.getMov001().setPp(p2.getMov001().getPp() - 1);
        } else {
            System.out.println(p1.getNome() + " errou o ataque");    
        }
    }

    public void atacar2(Pokemon p1, Pokemon p2) {
        System.out.println(p1.getNome() + " usou o " + p1.getMov002().getName());
        if (chanceErro(p1)) {
            p2.setHp(p2.getHp() + p2.getDefense() - p1.getAtk() - p1.getMov002().getPower());
            p1.getMov002().setPp(p2.getMov002().getPp() - 1);
            System.out.println(p2.getNome() + " perdeu " + (p1.getAtk() - p1.getMov002().getPower()) + " pontos de vida");
        } else {
            System.out.println(p1.getNome() + " errou o ataque");
        }
    }

    public void status() {
        System.out.println("-----------------------------------------------------");
        System.out.println(p1.getNome() + " - HP: " + p1.getHp() + "\n" + p1.getMov001().getName() + " - pp: " + p1.getMov001().getPp() + "\n" +p1.getMov002().getName() + " - pp: " + p1.getMov002().getPp());
        System.out.println();


        System.out.println(p2.getNome() + " - HP: " + p2.getHp() + "\n" + p2.getMov001().getName() + " - pp: " + p2.getMov001().getPp() + "\n" + p2.getMov002().getName() + " - pp: " + p2.getMov002().getPp());
        System.out.println("-----------------------------------------------------");
        System.out.println();
    }

    
    public void lutar(Pokemon p1, Pokemon p2) {
        
        while (true) {
            status();
            if(atkRandom()) {
                atacar1(p1, p2);
            } else {
                atacar2(p1, p2);
            }
            if (p2.getHp() <= 0) {
                System.out.println(p2.getNome() + " foi derrotado");
                System.out.println(p1.getNome() + " venceu a batalha");
                break;
            }


            if (atkRandom()) {
                atacar1(p2, p1);
            } else {
                atacar2(p2, p1);
            }
            if (p1.getHp() <= 0) {
                System.out.println(p1.getNome() + " foi derrotado");
                System.out.println(p2.getNome() + " venceu a batalha");
                break;
            }
            status();
            
            
        }
    }

    public Boolean chanceErro(Pokemon p) {
        int sort;
        sort = random.nextInt(101);
        if (sort <= p.getMov001().getAccuracy()) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean atkRandom () {
        int sort;
        sort = random.nextInt(2);
        if (sort == 0) {
            return false;
        } else {
            return true;
        }
    }

   

}