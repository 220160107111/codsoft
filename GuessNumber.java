import java.util.Scanner;
import java.util.Random;

public class GuessNumber{
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    Random random = new Random();
    int numberToGuess=random.nextInt(100) + 1;
    int numberofTries = 0;
    int guess;
    boolean win = false;
    System.out.println("Welcome to the guess the number Game !");
    System.out.println("I have randomly chosen a number between 1 and 100.");
    System.out.println("Try to guess it.");
    while (!win) {
        System.out.println("Enter your guess:");
        guess = sc.nextInt();
        numberofTries++;
        if (guess < 1|| guess > 100){
            System.out.println("Please guess a number between 1 and 100.");

        }else if (guess < numberToGuess){
            System.out.println("Your guess is too low.");

        }else if (guess > numberToGuess){
            System.out.println("Your guess is too high.");

        }else {
            win = true;
            System.out.println("Congratulations! You guessed the number "+ numberToGuess + "in"+ numberofTries + "tries.");
        }
 
    }

         sc.close();
}

}