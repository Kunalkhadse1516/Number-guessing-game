import java.util.Random;

import javax.swing.*;
 
public class Game1 {
    public static void main(String[] args) {
        Random rand= new Random();
        int a;
        a=rand.nextInt(100);
        int userInput = 0;
        System.out.println("The correct guess would be " + a);
        int g = 1;

        while (userInput != a)
        {
            String response = JOptionPane.showInputDialog(null,"Enter a guess between 1 and 100", "Guessing Game", 3);
            userInput = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, ""+ determineGuess(userInput, a, g));
            g++;
        }  
    }

    public static String determineGuess(int userInput, int a, int g){
        if (userInput <=0 || userInput >100) {
            return "Your guess is invalid";
        }
        else if (userInput == a ){
            return "The number is correct: \nTotal Guesses: " + g;
        }
        else if (userInput > a) {
            return "The number is Greater, Choose the Smaller one\nTry Number: " + g;
        }
        else if (userInput < a) {
            return "The number is Smaller, Choose the Greater one\nTry Number: " + g;
        }
        else {
            return "Your guess is incorrect\nTry Number: " + g;
        }
    }
}

