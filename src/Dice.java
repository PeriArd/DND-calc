import java.util.Random;

public class Dice {

    public Dice(){}

    public int random(int input){
        Random rand = new Random();
        int r = rand.nextInt(input)+1;
        return r;
    }

    public int d100(){
        return random(100);
    }

    public int d20() {
        return random(20);
    }

    public int d12() {
        return random(12);
    }

    public int d10() {
        return random(10);
    }

    public int d8() {
        return random(8);
    }

    public int d6(){
        return random(6);
    }

    public int d4(){
        return random(4);
    }
}
