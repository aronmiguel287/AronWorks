package MyWorks;

import java.util.Scanner;

public class ModifiedQuiz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int att = 2;
        int att2 = 2;
        String ques;
        String ques1;
        String ans;
        String ans1;
        String ans2 = null; 

        System.out.print("Enter 1st Question       : ");
        ques = input.nextLine();

        System.out.print("Enter 1st correct answer : ");
        ans = input.nextLine();

        System.out.print("Enter 2nd Question       : ");
        ques1 = input.nextLine();

        System.out.print("Enter 2nd correct answer : ");
        ans1 = input.nextLine();


        while(att >= 0){
            System.out.println(ques);
            System.out.print("Answer : ");
            ans2 = input.nextLine();
            
            if(ans2.equalsIgnoreCase(ans)) break;
            else att--;


        }
           
           if(ans2.equalsIgnoreCase(ans)){
            System.out.println("You WON!");
            
           } else System.out.println("You LOST!!");  

           // -----

           while(att2 >= 0){
            System.out.println(ques1);
            System.out.print("Answer : ");
            ans2 = input.nextLine();
            
            if(ans2.equalsIgnoreCase(ans1)) break;
            else att--;


        }
           
           if(ans2.equalsIgnoreCase(ans1)){
            System.out.println("You WON!");
            
           } else System.out.println("You LOST!!");  

    }

    
    
}
