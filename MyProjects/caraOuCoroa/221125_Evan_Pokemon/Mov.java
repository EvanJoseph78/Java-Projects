public class Mov {
    private int power, accuracy, pp;
    private String name, type;

    public Mov(String name, int power, int accuracy, int pp, String type) {
        this.power = power;
        this.accuracy = accuracy;
        this.pp = pp;
        this.name = name;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " - Poder: " + power + " - accuracy: " + accuracy + " - pp: " + pp + " - type: " + type;
    }

    

    

}
