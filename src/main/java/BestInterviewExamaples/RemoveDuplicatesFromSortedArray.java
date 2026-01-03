package BestInterviewExamaples;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String [] args)
	{
		
		int [] nums= {0,0,1,1,2,2,2,3,3,4,5,5};
		
		if(nums.length==0)
        {
            System.out.println(nums);
        }

        Set<Integer> sorted=new LinkedHashSet<>();

        for(int n:nums)
        {
            sorted.add(n);
        }
        
        System.out.println("Size: "+sorted.size());
        
        System.out.println("The sorted array"+sorted);
		
		
	}
	
}
