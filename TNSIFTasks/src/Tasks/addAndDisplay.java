package Tasks;
import java.util.Scanner;

public class addAndDisplay {
	
	    public static void main(String[] args) {
	    	Scanner s=new Scanner(System.in);
	    	System.out.println("Enter n");
	    	int n=s.nextInt();
	    	System.out.println("Enter m");
	    	int m=s.nextInt();
	    	System.out.println("Enter k");
	    	int k=s.nextInt();
	        for (int i = n; i <= m; i++) {
	            int sum = get(i);
	            if (sum == k) {
	                System.out.println(i);
	            }
	        }
	    }

	    // Function to calculate the sum of digits in a number
	    public static int get(int num) {
	        int sum=0;
	        while (num!=0) {
	            sum +=num%10;
	            num/=10;
	        }
	        return sum;
	    }
	}