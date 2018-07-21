import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

//This class covers logical hurdles that should not be done in other classes
public class Logic {

    public Logic(){}

    Dice dice = new Dice();

    public int rollAStat(){
        int stat = 0;
        int rolls[] = new int[4];

        for(int j = 0; j < rolls.length; j++){
            rolls[j] = dice.d6();
        }

        Arrays.sort(rolls);

        for(int i = 1; i < rolls.length; i++){
            stat = stat + rolls[i];
        }

        return stat;
    }

    public int[] rollCharStats(){
        int[] stats = new int[6];

        for(int i = 0; i < stats.length; i++){
            stats [i] = rollAStat();
        }

        return stats;
    }


    //Just roll accuracy
    public int rollHit(){

        int accuracy = dice.d20();

        return accuracy;
    }

    //Roll a full attack spell or weapon
    public int rollAttack(int , int antD4, int antD6, int antD8, int antD10, int antD12){
        int damage = 0;

        for(int i = 0; i <= antD4; i++)
            damage = damage + dice.d4();

        for(int j = 0; j <= antD6; j++)
            damage = damage + dice.d6();

        for(int k = 0; k <= antD8; k++)
            damage = damage + dice.d8();

        for(int l = 0; l <= antD10; l++)
            damage = damage + dice.d10();

        for(int l = 0; l <= antD12; l++)
            damage = damage + dice.d12();

        return damage;
    }
}
