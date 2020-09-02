package compsci;
import java.util.Scanner;
public class rounding 
{
	public static void main (String []args)
	{
		//program to round the value to 3 decimal places
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter the number you want to round");
		double num = sc.nextDouble();
		System.out.println("Please enter the number of decimal places you want to round to");
		double place = sc.nextDouble();
		
		double power = Math.pow(10,place );
		
		num *= power; 
		
		if (num < 0)
			num -= 0.5;
		else
			num +=0.5;
		num = (int)num/ power; 
		System.out.println("The Number rounded to " + (int)place + " places is " + num );
		
		
		
	}
}
