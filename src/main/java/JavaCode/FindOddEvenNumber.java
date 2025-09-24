package JavaCode;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class FindOddEvenNumber {

	@Test
	public void findOddEven()
	{
		 // input number anything user provides input, i am taking some random input here from 1 to 99
		int min = 1;
		int max = 100;
		int n = (int) (Math.random() * (max - min + 1)) + min;
		System.out.println("Number is: "+n);
		if(n%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
		

		//Interviewer can give u an array of integer and ask to find the even and odd numbers --> just loop through the array and use same logic as above
		// you can also use HashMap(Integer, String) --> Where integer is the element from array and String is the odd or even wrt to array
		
		int [] arr= {2,3,4,5,6,14,18,19,20};
		HashMap<Integer, String> hm=new HashMap<>();
		
		for(int i:arr)
		{
			if(i%2==0)
			{
				hm.put(i, "Even");
			}
			else
			{
				hm.put(i, "odd");
			}
		}
		
		for(Map.Entry<Integer,String> entries:hm.entrySet())
		{
			System.out.println("Key: "+entries.getKey()+" & "+entries.getValue());
		}
		
	}
	
	
	
	
}
