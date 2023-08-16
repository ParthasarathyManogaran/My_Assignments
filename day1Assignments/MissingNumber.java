package week2.day1Assignments;

import java.util.Arrays;

public class MissingNumber {
	

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,7,6,8};
		for (int i = 0; i < nums.length; i++) {
			Arrays.sort(nums);
			if (nums[i]!= i+1) {
				System.out.println(i+1);
				break;
			}
			
			
			
		}
	}

}
