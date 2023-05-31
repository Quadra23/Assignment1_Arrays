
public class Assignment1_Arrays_Q7 {
	
	    public static void moveZeros(int[] nums) {
	        int index = 0;

	        
	        for (int num : nums) {
	            if (num != 0) {
	                nums[index] = num; 
	                index++;
	            }
	        }

	        
	        while (index < nums.length) {
	            nums[index] = 0;
	            index++;
	        }
	    }

	    public static void main(String[] args) {
	        int[] nums = {0, 1, 0, 3, 12};
	        moveZeros(nums);

	       
	        for (int num : nums) {
	            System.out.print(num + " ");
	        }
	    }
	}

