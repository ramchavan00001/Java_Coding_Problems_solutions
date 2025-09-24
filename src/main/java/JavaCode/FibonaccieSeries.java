package JavaCode;

import java.util.ArrayList;
import java.util.Scanner;

public class FibonaccieSeries {

	public static void main(String[] args) {
		
		//WAP to find the fibonaccie series upto given number
		//fobonacci series is like next number is the sum of its previous two number --> 0,1,1,2,3,5,8,13,21,34,.....
		System.out.println("Enter a number upto you want me to provide fibonacii series: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int sum;
		ArrayList<Integer> fiboSeries=new ArrayList<>();
		fiboSeries.add(a);
		fiboSeries.add(b);
		for(int i=1;i<=n;i++)
		{
			sum=a+b;
			fiboSeries.add(sum);
			a=b;
			b=sum;
			
			if (sum > n) {
                break; // Stop the loop as the next number exceeds the limit 'n'
            }
		}
		
		for(Integer num:fiboSeries)
		{
			System.out.print(" "+num);
		}
		
		
		fiboBestApproach(n);
		
	}
	
	public static void fiboBestApproach(int num)
	{
		//this approach clearly handles the base case conditions 
		
		int first=0;
		int second=1;
		int next;
		ArrayList<Integer> updatedFibo=new ArrayList<>();
		if(num>=0)
		{
			updatedFibo.add(first);
		}
		if(num>=1)
		{
			updatedFibo.add(second);
		}
		
		while(true)
		{
			next=first+second;
			updatedFibo.add(next);
			
			if(next>num)
			{
				break;
			}
			
			first=second;
			second=next;
		}
		
		System.out.println("\nNew fibo series with updated fibo list");
		
		for(Integer fibo:updatedFibo)
		{
			System.out.print(fibo+" , ");
		}
		
	}

}
