package GuessNumber;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random rand = new Random();
        boolean playagain = true;
        int guesses = 9;


        int nums = rand.nextInt(100) +1;

        while(playagain){
            System.out.println("------------------------------------------------");
            System.out.println("Welcome to Aron's Random Number Guesser!");
            System.out.println("I have a number prepared from 1 to 100");
            System.out.println("Make sure you have those guessing instinct ready!");
            System.out.println("Do you want to continue?");
            System.out.println("1. Yes");
            System.out.println("2.  No");
            System.out.print("Choice: ");
            int ready = s.nextInt();

            while(guesses >= 0){
                  if(ready == 1){
                System.out.println("------------------------------------------------");
                System.out.println("I have the number, guess it!");
                System.out.print("Enter guess : ");
                int guessres = s.nextInt();

                if(guessres == nums){
                    System.out.println("Wow! Your number " + guessres + " is indeed correct" ); 
                    break;
                } else if (guessres > nums){
                    System.out.println("Too HIGH! Try again, " + guesses + " attempts left");
                    guesses--;
                } else if (guessres < nums){
                    System.out.println("Too LOW! Try again, " + guesses + " attempts left");
                    guesses--;
                 }
                   
                 
            
             if(guesses <= 0){
                System.out.println("You LOST!, try again!. The number was " + nums);
                break; 
             }  
                
              } else if(ready == 2){
                System.out.println("Exiting prompt, goodbye!");
                break;
              } else System.out.println("Invalid entry, retry prompt");

            }
        }
 
    }
}
    
