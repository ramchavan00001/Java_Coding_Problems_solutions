package BestInterviewExamaples;

import java.util.Arrays;
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
		
        anotherApproachUsingTwoPointer();
        
        int [] array1= {1,2,3,3,2,3,1,6,7,3,7,3,3};
        int count=removeElement(array1,3);
        System.out.println("Counts : "+count);
		
	}
	
	public static void anotherApproachUsingTwoPointer()
	{
		int [] arr= {0,0,1,1,1,2,3,3,5};
		
		int j=1; //this counter is used to return number of unique element
		//as the first element in array is always unique so will start from second element
		
		for(int i=1;i<=arr.length-1;i++)
		{
			if(arr[i]!=arr[i-1])
			{
				arr[j]=arr[i];
				j++;
			}
		}
		System.out.println("Number of unique element is: "+j);
		
		
		System.out.println("Array after removing duplicate element");
		
		Arrays.stream(arr).forEach(System.out::println);
		
	}
	
	public static int removeElement(int[] nums, int val) {

        int j=0;
        
        for(int i=0;i<=nums.length-1;i++)
        {
            if(nums[i]!=val)
            {
                nums[j]=nums[i];
                j++;
            }
        }
        return j;


    }
	
	
}
