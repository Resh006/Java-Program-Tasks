package Tasks;

public class exec {
	int dept;
	static int bal;
	int i;
	static int b;
	exec(int d,int b){
		dept=d;
		bal=b;
	}
	static {
		b=100;
	}
	{
		i=100;
	}
	void dis() {
		System.out.println(dept +" "+ bal);
		System.out.println(i);
	}


	public static void main(String[] args) {
		System.out.println(b);
		exec e=new exec(600,200);
		e.dis();
	}
	static {
		b=500;       //static var
	}
	{
		i=300;       //non-static  var( nd we shouldn't make this as static)
	}
	{
		i=400;
	}

}
