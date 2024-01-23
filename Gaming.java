import java.util.Scanner;
import java.util.Random;

public class Gaming {
    public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    Random rem=new Random();
    String response;
    
    do{
    System.out.println("Welcome to the Guessing game");
    int random=rem.nextInt(100);
    int attempts=0;
    
    boolean guessedcorrectly=false;

    while(guessedcorrectly==false){
        System.out.println("Enter your guess number");
        int guess=scan.nextInt();
        attempts++;

        if(guess==random){
            guessedcorrectly=true;
            System.out.println("Congratulations! You Guessed the correct number");
             
        }
        else if(guess> random){
           System .out.println("Your Guess is too high. Try again.");
        }
        else{
          System .out.println("Your Guess is too low. Try again.");
        }
    }
    System.out.println("It took you " + attempts + " attempts to guess the correct number");
   
    System.out.println("Do you want to play again? (yes/no)");
     response=scan.next();
}
    while(response.equalsIgnoreCase("yes"));

    }
    
}
