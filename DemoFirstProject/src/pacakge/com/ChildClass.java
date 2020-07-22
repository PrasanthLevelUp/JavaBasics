package pacakge.com;

public class ChildClass extends ParentClass {

	public static void main(String[] args) {

		/*ParentClass obj1= new ParentClass();
		obj1.show();
*/
		
		ConstructDemo obj3 = new ConstructDemo(5);
		
		
		/*	EncapsulationDemo object1 = new EncapsulationDemo();
		object1.setAge(50);
		object1.setAge(100);
		int ageof = object1.getAge();*/

		//System.out.println(ageof);
/*
		ChildClass obj = new ChildClass();
		obj.show();
		obj.setA(100);
		
		obj.add('r','t',5);

		int value = obj.getA();

		System.out.println(value);*/
	}

	public void show() {

		System.out.println("child");
	}
	public void add() {

		super.show();

	}


	public void add(int a) {


	}

	public void add(int b, int c) {


	}
	public void add(char b, char c, int i) {


	}
}
