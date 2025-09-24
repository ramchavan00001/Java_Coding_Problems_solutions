package JavaCode;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:  ");
		int n=sc.nextInt();
		
		//prime number is the number which is only divided by 1 and itself, if other factors is available then it is not a prime number
		
		boolean isPrime=true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				isPrime=false;
				break;
			}
			
		}
		if(isPrime)
		{
			System.out.println("The number "+n+" Is Prime Number");
		}
		else
		{
			System.out.println("The number "+n+" Is Not Prime Number");
		}
		//--------------------------------------------2nd approach------------------------------------------------------------------
		//there is one more logic to solve the above program who has time complexity as o(n/2) means you have to travers half of the list only to check the prime or not
		// loop until Math.srqt(n) only --> if divides by any number then not a prime else it is prime
		boolean isPrimeNumber=true;
		for(int i=2;i<Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				isPrimeNumber=false;
				break;
			}
			
		}
		if(isPrimeNumber)
		{
			System.out.println("The number "+n+" Is Prime Number");
		}
		else
		{
			System.out.println("The number "+n+" Is Not Prime Number");
		}
		
		//--------------------------------------------------3rd approach ----------------------------------------------------------
		//if you have asked to find out the all prime number between 2 to 100 then use following approach
		//u need two for loop whose time complexity will be o(n*n)
		ArrayList<Integer> primeList=new ArrayList<>();
		
		for(int i=2;i<=100;i++)
		{ 
			boolean isprimenum=true;// every number from the array is considered as prime initially
			for(int j=2;j<=Math.sqrt(i);j++)
			{
				if(i%j==0)
				{
					isprimenum=false;
					break;
				}
			}
			
			if(isprimenum)
			{
				primeList.add(i);
			}
			
		}
		
		for(Integer num:primeList)
		{
			System.out.print(" "+num);
		}
	
	}

}
