package com.venkatesh;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessinggame {
	public static void gussing() {
		Scanner sc=new Scanner(System.in);
		Random random=new Random();
		int systeminput;
		int count=1;
		do {
			System.out.println("guessing a number 0 to 100");
		
			int gammerinput=sc.nextInt();
		    systeminput=random.nextInt(100);
			if(gammerinput==systeminput) {
				System.out.println("your gessing  number::"+gammerinput);
				System.out.println("system generated number::"+systeminput);
				System.out.println("you won the match!!!");
				System.exit(gammerinput);
				
			}else if(gammerinput>=systeminput ){
				
				
				System.out.println("your gessing  number::"+gammerinput);
				System.out.println("system generated number::"+systeminput);
				System.out.println("both are not matched");
				System.out.println("hint: please enter a low numbers!!");
				
				
				
			}
           else if(gammerinput<=systeminput ){
				
				
				System.out.println("your gessing  number::"+gammerinput);
				System.out.println("system generated number::"+systeminput);
				System.out.println("both are not matched");
				System.out.println("hint: please enter a high numbers!! ");
				
				
				
			}
			
           
			count++;
			
			if(count==3) {
				System.out.println("This is your last chance !!! ");
			}	
			
		}while(count<=3) ;
		
			System.out.println("System won the game !!!! ");
			
	
		
		
	}
	
	
	
	

	public static void main(String[] args) {
		
		NumberGuessinggame.gussing();

	}

}
