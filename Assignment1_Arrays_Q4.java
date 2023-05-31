
public class Assignment1_Arrays_Q4 {
	
	    public static void main(String[] args) {
	        int[] digits = {1, 2, 3};

	        int[] result = plusOne(digits);

	        System.out.print("Result: ");
	        for (int digit : result) {
	            System.out.print(digit + " ");
	        }
	        System.out.println();
	    }

	    public static int[] plusOne(int[] digits) {
	        int n = digits.length;

	        
	        digits[n - 1] += 1;

	       
	        int carry = digits[n - 1] / 10;
	        digits[n - 1] %= 10;

	      
	        for (int i = n - 2; i >= 0 && carry > 0; i--) {
	            digits[i] += carry;
	            carry = digits[i] / 10;
	            digits[i] %= 10;
	        }

	        
	        if (carry > 0) {
	            int[] newDigits = new int[n + 1];
	            newDigits[0] = carry;
	            for (int i = 0; i < n; i++) {
	                newDigits[i + 1] = digits[i];
	            }
	            return newDigits;
	        }

	        return digits;
	    }
	}
