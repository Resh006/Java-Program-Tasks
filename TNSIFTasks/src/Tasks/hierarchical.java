package Tasks;


class Animal{	
	void eat() {
		System.out.println("eating");
		}
	}
class dog extends Animal{
	void bark() {
		System.out.println("Barking");
		}
	}
class cat extends Animal{
	void meow(){
		System.out.println("Meowww");
		}
	}
public class hierarchical {

	public static void main(String[] args) {
		dog d=new dog();
		d.eat();
		d.bark();
		cat c=new cat();
		c.eat();

	}

}
