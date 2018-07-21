import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class Main {
    public static void main(String[] args){
        Logic action = new Logic();

        int hit = action.rollHit();
        int damage;

        int antD4 = 1;
        int antD6 = 2;
        int antD8 = 1;
        int antD10 = 1;
        int antD12 = 1;


        if(hit != 20){

            System.out.println(hit);

            damage = action.rollAttack(0,antD6,0,0,0);

            System.out.println(damage);

        } else {
            System.out.println("Crit!");

            damage = action.critHit(0,antD6,0,0,0);

            System.out.println(damage);

        }
    }
}
