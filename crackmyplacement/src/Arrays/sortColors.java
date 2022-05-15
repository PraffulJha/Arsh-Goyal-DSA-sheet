package Arrays;
import java.util.*;
public class sortColors {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i = 0;i < n;i++) {
			nums[i] = sc.nextInt();
		}
		sortColors(nums);
		for(int i : nums) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
	}
	 public static void sortColors(int[] nums) {
		  // initalize three variable
	        int zeros = 0;
	        int ones = 0;
	        int twos = 0;
	        int k = 0;
	        int n = nums.length;
	        for(int i = 0;i < n;i++){
	        	// track of zeros,ones,twos
	        	
	            if(nums[i] == 0)
	                zeros++;
	            else if(nums[i] == 1){
	                ones++;
	            }
	            else{
	                twos++;
	            }
	        }
	        // places zero, ones, twos accordingly
	        while(zeros !=  0 && k != n ){
	            nums[k++] = 0;
	            zeros--;
	        }
	        while(ones  !=  0 && k != n ){
	            nums[k++] = 1;
	            ones--;
	        }
	        while(twos  !=  0 && k != n ){
	            nums[k++] = 2;
	            twos--;
	        }
	 }

}
