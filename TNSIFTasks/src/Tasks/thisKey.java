package Tasks;


class sis{
	void display() {
		System.out.println("Brooooo");
		
	}
}

public class thisKey {
	void show() {
		System.out.println("Heyyy");
		this.display();         // it calls this class diplay method not frm other class
	}
	void display() {
		System.out.println("Broo");
		
	}
	public static void main(String[] args) {
		thisKey t=new thisKey();
		t.show();
	 
	}

}
