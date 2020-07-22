package secondPackage;

public class Test {

	public int i;
	public static int j=10;


	public static void main(String[] args) {
		
		Test o = new Test();
		o.i=20;
		int value = o.sub(o.i);
		System.out.println(value);
		System.out.println(Test.j);
		Test.sub1();
		
		int i = 10;
	}

	public char sub(int i) {
		int c = i;
		char d = 't';
		System.out.println(j);
		return d;
	}

	public static void sub1() {

	}

}
