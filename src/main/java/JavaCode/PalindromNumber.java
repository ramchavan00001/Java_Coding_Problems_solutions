package JavaCode;

import java.util.*;

public class PalindromNumber {
	
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
	    int num=sc.nextInt();
	    int rem;
	    int d=num;
	    int revnum=0;
	    while(num>0)
	    {
	    	rem=num%10;
	    	revnum=revnum*10+rem;
	    	num/=10;
	    }
	    
	    if(revnum==d)
	    {
	    	System.out.println("The provided number is palidrom");
	    }
	    else
	    {
	    	System.out.println("The provided number is not palidrom");
	    }
	    
	}

}
