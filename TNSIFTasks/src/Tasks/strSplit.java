package Tasks;

public class strSplit {

	public static void main(String[] args) {
		String str= "a4b3c2";
		for(int i=0;i<=str.length();i++) {
			if(i%2!=0) {
				int y=Integer.parseInt(str.charAt(i)+"");
				for(int j=1;j<=y;j++) {
					System.out.print(str.charAt(i-1));
				}
			}
		}
	}
}
