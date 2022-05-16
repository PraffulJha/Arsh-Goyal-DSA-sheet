package Arrays;
import java.util.*;
public class twosum {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i = 0;i < n;i++) {
			nums[i] = sc.nextInt();
		}
        int k = sc.nextInt();
        int[] ans  = twoSum(nums, k);
        for(int i : ans){
            System.out.print(i + " ");
        }
		System.out.println();
		
		
	}
    public static int[] twoSum(int[] nums, int target) {
        // simpl O(n2) solution
        // int n = nums.length;
        // for(int i  = 0;i < n-1;i++){
        //     for(int j = i+1;j < n;j++){
        //         if(nums[i] + nums[j] == target){
        //             return new int[] {i,j};
        //         }
        //     }
        // }
        // throw  new IllegalArgumentException();
         /***   better O(nlogn) solution */
        //  Arrays.sort(nums); // nlogn sort
        //  int i = 0;
        //  int n = nums.length;
        //  int j = n-1;
        //  while(i != j){
        //      if(nums[i] + nums[j] == target){
        //          return new int[]{i,j};

        //      }
        //      i++;
        //      j--;
        //  }
        //  throw new IllegalArgumentException();

        /** optimized O(n) solution */
        int n = nums.length;
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i = 0;i < n;i++){
            int compliment = target - nums[i];
            if(mp.containsKey(compliment)){
                return new int[] {mp.get(compliment),i};
            }
            mp.put(nums[i], i);
        }
        throw new IllegalArgumentException();

        
    }
	 
}
