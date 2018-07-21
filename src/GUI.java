import javax.swing.*;
import java.awt.*;

public class GUI {

    public GUI(){}

    JFrame frame = new JFrame("DND Calc");
    Dice dice = new Dice();
    Logic action = new Logic();

    public void mainPage(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Button statButton = new Button("new stats");

        JLabel label = new JLabel();
        label.setOpaque(true);
        label.setBackground(new Color(50, 50, 50));

        frame.getContentPane().add(label, BorderLayout.CENTER);

        frame.pack();
    }

    public void newstatUI(){
        int[] stats;
        int[] diceRolls = new int[4];
        JLabel label = new JLabel();
        label.setBackground(new Color(50, 50, 50));
        System.out.println("Kaster terninger");
        int[] nyChar = action.rollCharStats();

        for(int i = 0; i < nyChar.length; i++){
            System.out.println(nyChar[i]);
        }


        frame.getContentPane().add(label, BorderLayout.CENTER);
    }
}
