package week2.day1Assignments;

import java.util.Arrays;
import java.util.Iterator;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int[] nums = {3,2,11,4,6,7};
		
		for (int i = 0; i <nums.length; i++) {
			Arrays.sort(nums);
		}
		System.out.println(nums[nums.length-2]);



	}

}
