package pacakge.com;

import java.util.Random;

public class MapDemo {

	public static void main(String[] args) {
		double d = 6.456;
		int x = 5;
		int  y =20;
		
		System.out.println(Math.E);
		System.out.println(Math.PI);
		System.out.println(Math.abs(d));
		System.out.println(Math.addExact(x, y));
		System.out.println(Math.cbrt(d));
		System.out.println(Math.ceil(d));
		System.out.println(Math.decrementExact(x));
		System.out.println(Math.exp(d));
		System.out.println(Math.floor(d));
		System.out.println(Math.floorDiv(x, y));
		System.out.println(Math.floorMod(x, y));
		System.out.println(Math.getExponent(d));
		System.out.println(Math.incrementExact(y));
		System.out.println(Math.max(x, y));
		System.out.println(Math.min(x, y));
		System.out.println(Math.multiplyExact(x, y));
		System.out.println(Math.multiplyFull(x, y));
		System.out.println(Math.negateExact(x));
		System.out.println(Math.nextDown(d));
		System.out.println(Math.random());
		System.out.println(Math.round(d));
		System.out.println(Math.sqrt(d));
		System.out.println(Math.subtractExact(x, y));
		
		Random ran =  new Random();
		System.out.println(String.format("%04d", ran.nextInt(5999)));
		
	}

}
