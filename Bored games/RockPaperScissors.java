package MyWorks;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter player 1 name : ");
		String name1 = scan.nextLine();
		
		System.out.print("Enter player 2 name : ");
		String name2 = scan.nextLine();
		
		System.out.print(name1 + "'s" + " draw : ");
		String draw1 = scan.nextLine();		
		
		System.out.print(name2 + "'s" + " draw : ");
		String draw2 = scan.nextLine();
		
		if(draw1.equalsIgnoreCase(draw2)) {
			System.out.println("DRAW!");
		} 
		
		
		// PLAYER ONE
		
		if(draw1.equalsIgnoreCase("paper") && draw2.equalsIgnoreCase("rock")) {
			System.out.println(name1 + "'s" + ", WIN!");
		}
		
		if(draw1.equalsIgnoreCase("rock") && draw2.equalsIgnoreCase("Scissors")&& draw2.equalsIgnoreCase("Scissor" )) {
			System.out.println(name1 + "'s" + ", WIN!");
		}
		
		if(draw1.equalsIgnoreCase("Scissors") && draw1.equalsIgnoreCase("Scissors") && draw2.equalsIgnoreCase("Paper")) {
			System.out.println(name1 + "'s" + ", WIN!");
		}
		
		// PLAYER TWO
		
		if(draw2.equalsIgnoreCase("paper") && draw1.equalsIgnoreCase("rock")) {
			System.out.println(name2 + "'s" + ", WIN!");
		}
		
		if(draw2.equalsIgnoreCase("rock") && draw1.equalsIgnoreCase("Scissors") && draw1.equalsIgnoreCase("Scissor")) {
			System.out.println(name2 + "'s" + ", WIN!");
		}
		
		if(draw2.equalsIgnoreCase("Scissors") && draw2.equalsIgnoreCase("Scissor") && draw1.equalsIgnoreCase("Paper")) {
			System.out.println(name2 + "'s" + ", WIN!");
			
		} 
	
		

		
        }
	
     
}

