package JavaCode;

import java.util.Scanner;

public class CountDigitInNumber {
	//static int cnt=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number ");
		int num = sc.nextInt();
		System.out.println("Entered number: " + num);
		int d=num;
		int count=0;
		int rem=0;
		while(num>=1)
		{
			rem=num%10;
			count++;
			num/=10;
		}
		
		System.out.println("There are "+count+ "  digits present in the "+d);
		
		

	}
	
	
	

}
