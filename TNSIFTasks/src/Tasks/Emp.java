package Tasks;

class Employees {
	
	protected String name;
	protected int  employeeID;
	private double salary;
    
	public Employees(String name,int employeeID,double salary) {
		this.name=name;
		this.employeeID=employeeID;
		this.salary=salary;
	}
	
	public double calculateBonus() {
		return salary*0.10;
	}
}

class Manager extends Employees{
	private int teamSize;
	public Manager(String name,int employeeID,double salary) {
		super(name,employeeID,salary);
		this.teamSize=5;
	}
	@Override
	public double calculateBonus(){
		return super.calculateBonus()+(50*teamSize);
	}
	void reporting() {
		System.out.println("Manager " +name + " is generating reports.....");
    }
}

class Developer extends Employees{
	private String prgmingLang="Java";
	
	public Developer(String name,int employeeID,double salary) {
		super(name,employeeID,salary);
		this.prgmingLang=prgmingLang;
	}
	
	@Override
	public double calculateBonus() {
		return  super.calculateBonus()+200;
	}
    void code() {
		System.out.println("Developer " + name + ", is coding in " + prgmingLang + "." );
	}
}

public class Emp{
	public static void main(String[] args) {
		Manager manager=new Manager("Sham",672,40000);
		Developer developer=new Developer("Resh",111,35000);
		System.out.println("Manager's Bonus : Rs. " + manager.calculateBonus());
		System.out.println("Developer's Bonus : Rs. " + developer.calculateBonus());
		manager.reporting();
		developer.code();
    }
}