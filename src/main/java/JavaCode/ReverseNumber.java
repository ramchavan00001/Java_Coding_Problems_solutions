package JavaCode;

import java.util.Scanner;
import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter the number to reverse it");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();

		int revNum=reverseNumber(num);
		System.out.println(" The original number: "+num+ "\n The reversed number : "+revNum);
		
	}
	
	public static int reverseNumber(int num)
	{
		int rev=0;
		int rem;
		while(num>=1)
		{
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		
		return rev;
	}

}
