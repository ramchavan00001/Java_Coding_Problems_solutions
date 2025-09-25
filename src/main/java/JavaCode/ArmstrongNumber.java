package JavaCode;
import java.util.*;
public class ArmstrongNumber {

	public static void main(String [] args)
	{
		//armstrong number is the number whose sum of digit cubes is equal to number itself
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		System.out.println("Entered number: "+num);
		int d=num;
		int arm=0;
		int rem;

		while(num>0)
		{
			rem=num%10;
			arm=arm+rem*rem*rem;
			num/=10;
		}
		
		System.out.println("sum of cubes of digit "+arm);
		if(arm==d)
		{
			System.out.println("The given number is armstrong number ");
		}
		else
		{
			System.out.println("The given number is not armstrong number ");
		}
			
		
		
	}
	
}
