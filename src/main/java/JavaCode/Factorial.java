package JavaCode;

public class Factorial {

	public static void main(String[] args) {

		//factorial of a number is the multiplication from 1 to that number-- 6 factorial --> 6*5*4*3*2*1
		int num=6;
		int fact=findFactorial(6);
		System.out.println("Factorial of "+num+ " is "+fact);
		
		//using recursive funtion
		
		System.out.println("factrorial of "+num+ " Using recursive function is: "+facto(num));
	}
	
	public static int findFactorial(int number)
	{
		int fact=1;
		for(int i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		
		return fact;
	}
	
	public static int facto(int num)
	{
		if(num==1)
			return 1;
		return num*facto(num-1);
	}

}
