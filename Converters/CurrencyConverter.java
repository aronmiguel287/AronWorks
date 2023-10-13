package InProgress;

import java.util.Scanner;

public class Project1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("WELCOME TO ARON'S CURRENCY CONVERTER");
        System.out.println("CURRENCY SUPPORTED");
        System.out.println("- PESOS TO DOLLARS");
        System.out.println("- PESOS TO EURO");
      
        System.out.print("Pesos to : ");
        String ops = scan.nextLine();

        System.out.print("Value 1  : ");
        int val1 = scan.nextInt();

        // DOLLARS
        
        if(ops.equalsIgnoreCase("Dollars")){
         System.out.println(val1 + " in dollars is " + "$" + val1*0.018);
         
        } 
       
       //  EURO

       if(ops.equalsIgnoreCase("Euro")){
        System.out.println(val1 + " in Euro is " + "€" + val1*0.017);
       }

    
    }
    
}