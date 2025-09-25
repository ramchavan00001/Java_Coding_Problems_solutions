package JavaCode;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		swapTwoNumbers(15,18);
		//using temp variable
		int a=15;
		int b=18;
		System.out.println("Using temp var --> Before swapping: "+a+" "+b);
		int temp=a;
		 a=b;
		 b=temp;
		 System.out.println("Using temp var --> After swapping: "+a+" "+b);
		 

	}
	
	public static void swapTwoNumbers(int a, int b)
	{
		//w/o third variable
		System.out.println("Before swapping: "+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping: "+a+" "+b);
	}

}
