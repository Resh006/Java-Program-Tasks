package Tasks;
import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		String s="This ,is/from/GRT";
		Scanner scan=new Scanner(s);
		System.out.println(scan.hasNextBoolean());
		scan.useDelimiter("/");
		while(scan.hasNext()) {
			System.out.println(scan.next());
		}
		System.out.println(scan.delimiter());
	}
}
