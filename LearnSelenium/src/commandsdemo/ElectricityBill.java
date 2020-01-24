package commandsdemo;

import java.util.Scanner;

public class ElectricityBill {
	private static Scanner sc;

	public static void main(String[] args) 
	{
		int Units;
		double Amount = 0, Total_Amount;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the Units that you Consumed last month  : ");
		Units = sc.nextInt();
		
		System.out.print(" Please Enter the Units that you Consumed  : ");
		Units = sc.nextInt();
  
	  	if (Units < 30)
	  	{
	        Amount = Units * 2.50;	
	  	} 
	  	else if (Units <= 31-70)
	  	{
	  		
	  		Amount = 75 + ((Units - 30 ) * 3.5);
	  	}
	  	else if (Units <= 71)
	  	{
	  		
	  		Amount = 75 + 105 * 4.5;//((Units - 70 ) * 4.5);
	  	}
	  	
		
		Total_Amount = Amount;
		System.out.println("\n Electricity Bill  =  " + Total_Amount);
	}

}
