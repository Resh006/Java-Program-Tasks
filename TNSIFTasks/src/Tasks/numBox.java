package Tasks;

public class numBox {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=9;j++) {
				if((i==1 && j==1 ) || (i==5 && j==5)) {
					System.out.print("1");
				}
				if((i==2 && j==1) || (i==1 && j==2) || (i==5 && j==4) || (i==4 && j==8)) {
					System.out.print("2");
				}
				if((i==3 && j==1) || (i==1 && j==4) || (i==5 && j==3) || (i==3 && j==8)) {
					System.out.print("3");
				}
				if((i==4 && j==1) || (i==1 && j==3) || (i==5 && j==2) || (i==2 && j==8)) {
					System.out.print("4");
				}
				if((i==5 && j==1) || (i==1 && j==5)) {
					System.out.print("5 ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
