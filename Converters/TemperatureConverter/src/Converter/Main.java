package Converter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        while(true){
            System.out.println("----------------------------------------------");
            System.out.println("Welcome to Aron's Temperature Converter");
            System.out.println("Temperatures can be converted to:");
            System.out.println("- Celsius to Fahrenheit (vice versa)");

            System.out.println("----------------------------------------------");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Exit");

            System.out.print("Enter Choice : ");
            int choice = s.nextInt();

            if(choice == 1){
                System.out.print("Celsius value : ");
                int c = s.nextInt();
                
                System.out.println("----------------------------------------------");
                System.out.println("Celsius converted to Fahrenheit is : " + (c*9/5+32));

                 
            } else if(choice == 2){
                System.out.print("Fahrenheit value : ");
                int f = s.nextInt();

                System.out.println("----------------------------------------------");
                System.out.println("Fahrenheit converted to Celsius is : " + (f-32*5/9));
            } else if(choice == 3){
                System.out.println("Exiting prompt, Cya!");
                break;
            }
        

        }

    }
    
}
