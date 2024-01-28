package Tasks;
import java.util.Scanner;

public class findingVowels {

	public static void main(String[] args) {
		String str;
		int[] count=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		str=s.nextLine();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a' || ch=='A' ) {
				count[0]++;
			}
			if(ch=='e' || ch=='E') {
				count[1]++;
			}
			if(ch=='i' || ch=='I') {
				count[2]++;
			}
			if(ch=='o' || ch=='O') {
	            count[3]++;
			}
			if(ch=='u' || ch=='U') {
				count[4]++;
			}
		}
		System.out.println("a :" +count[0] + "\ne :"+count[1] + "\ni :"+count[2] + "\no :" +count[3] +"\nu :"+count[4]);
	}

}
