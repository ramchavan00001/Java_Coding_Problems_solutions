package BestInterviewExamaples;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElementFromSortedArray {

	// Problem: You have to remove the duplicate element from sorted array and
	// return the count of unique element
	// Make sure time complexity: 0(n) and space should be o(1)
	// i will make use of two pointer approach
	// another simple solution is using set -> java collection framework, Simple
	// will add element into set and will return the size of set
	// but using the set space complexity will increase -- bcz we are creating the
	// set

	// lets see both the solutions

	public static int removeDuplicateElementFromArray(int[] arr) {
		int distinct_count = 0;

		int i = 0, j = 0;

		if (arr == null || arr.length == 0)
			return 0;

		while (j <= arr.length - 1) {

			if (arr[i] == arr[j]) {
				// if same i will increase j++ --> j will traverse whole array
				j++;
			} else if (arr[i] != arr[j]) {
				i++;
				arr[i] = arr[j];
				j++;
			}

		}

		distinct_count = i + 1; // bcz i is initialized to zero, so final count must be i+1

		return distinct_count;

//		
//		int i = 0; // pointer for unique elements
//
//	    // start j from 1 since first element is always unique
//	    for (int j = 1; j < arr.length; j++) {
//	        if (arr[i] != arr[j]) {
//	            i++;              // move i to next position
//	            arr[i] = arr[j];  // place next unique element
//	        }
//	    }
//
//	    return i + 1; // total count of unique elements
	}

	public static int removeDuplicateElementFromSortedArrayUsingSet(int[] arr) {

		Set<Integer> set = new HashSet<>();

		for (int i : arr) {
			set.add(i);
		}

		int distinct_count = set.size();
		return distinct_count;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 3, 3, 4, 5, 5, 7, 8, 9, 9 };

		System.out.println("Distinct_Count using two pointer method: " + removeDuplicateElementFromArray(arr));
		System.out.println("Distinct_Count using Set - collection framework: "
				+ removeDuplicateElementFromSortedArrayUsingSet(arr));

	}

}
