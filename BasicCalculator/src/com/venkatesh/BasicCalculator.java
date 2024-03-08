package com.venkatesh;

import java.util.Scanner;

public class BasicCalculator {
	
	
	public static Double calopration(Double[] d,char ch ) {
		if(d.length<2) {
			System.out.println("insufficient numbers ");
			
			return null;
		}
		
		Double result=d[0];
		for(int i=1;i<d.length;i++) {
		
		switch(ch) {
		
		case '+':result=result+d[i];
		          break;
		case '-':result=result-d[i];
                  break;
		case '*':result=result*d[i];
                    break;
		case '/':if(d[i]!=0) {
			      result=result/d[i];
                   
		          }else {
		        	 System.out.println("can not divide with zero"); 
		          }
		          break;
		          
      default:System.out.println("please choose any operation  like *,/,+,-");       
	}        
			
	}	
		return result;
	}	
	

	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many numbers for you want:");
		int number=sc.nextInt();
		
		Double d[]=new Double[number];
		
		for(int i=0;i<number;i++) {
			System.out.println("enter a values:");
			d[i]=sc.nextDouble();
			
		}
		
		System.out.println("enter your operation */+-");
	   char ch=sc.next().charAt(0);
		Double result=BasicCalculator.calopration(d, ch);
        System.out.println(result);		

	}

}
