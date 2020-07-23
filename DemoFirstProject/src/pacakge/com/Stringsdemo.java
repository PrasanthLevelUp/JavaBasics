package pacakge.com;

import java.util.HashMap;

public class Stringsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stringsdemo obj = new Stringsdemo();
		
		int n =20;
		String st = Integer.toString(n);
		obj.submehtod(8);

		String str1 = "Niho;In;TVH";

		String str2 = "Niho In TVH";
		String var = new String("Niho In TVH");
		
		  System.out.println(str1.hashCode()); 
		  System.out.println(str2.hashCode());
		  
		  String str3 = new String("Niho In TVH");
		  //System.out.println(str3.hashCode()); //str3.concat("Niho In TVH");
		  System.out.println(str3.hashCode()); //concat String str4 = "";
		 // str4.concat(str3); 
		  String str5= str2.concat(str3);
		  
		  int len = str5.length(); 
		  System.out.println(len);
		 

		
		  char c = str1.charAt(3);
		  System.out.println(c); //substring String sub1 =
		  str1.substring(4);
		  //System.out.println(sub1);
		  
		  String sub2 = str1.substring(4,9); 
		  System.out.println(sub2);
		  
		  char[] ch = str1.toCharArray();
		  
		  System.out.println(ch[5]);
		  
		  //compare to
		  
		  int nn = str1.compareToIgnoreCase(str5);
		  
		  System.out.println(nn);
		  
		  //equa;
		  
		  if(str1.equalsIgnoreCase(str2)) {
		  
		  System.out.println("Pass"); 
		  }else 
		  { System.out.println("Fail"); }
		  
		  
		  //copyValueOf
		  
		  
		  char[] te = {'w','r','d'};
		  
		  String cha = " "; 
		  cha.copyValueOf(te);
		  
		  System.out.println(cha);
		  
		  String[] str7 = str1.split(";");
		  
		  for(String s:str7) {
		  
		  System.out.println(s); }
		  
		  String test = "AA BB CC";
		  
		  String[] str8 = test.split(" ");
		  HashMap<Character, Integer> map = new
		  HashMap<Character, Integer>();
		  
		/*  for(String word:str8) { char[] chs = word.toCharArray(); for(char chara:chs)
		  { if(!map.containsKey(chara)) { map.put(chara, 1); }else { map.put(chara,
		  map.get(chara)+1); } } }
		  
		  for(HashMap<Character, Integer> map1: map.entrySet()) {
		  System.out.println(map1.get(key)); }*/
		  
		  
		  int i =23;
		  
		  String st1 = Integer.toString(i);
		 
		StringBuffer strbuff = new StringBuffer("String Bufeer");
		StringBuffer strbuff1 = new StringBuffer(str1);
		StringBuffer strbuff2 = new StringBuffer(10);
		String str9 = "The India and Niha";

		String[] arr = str2.split(" ");

		int lenght = arr.length;

		String rev = "";

		for (int k = 0; k <lenght; k++) {

			String word = arr[k];

			if (word.equals("India")) {

				String r = "";

				for (int d = word.length() - 1; d >= 0; d--) {

					r += word.charAt(d);
				}
				rev += r+ " ";

			} else {
				rev += word+" ";
			}
		}

		System.out.println(rev.trim());
		strbuff.reverse();
		System.out.println(strbuff);
		String str = "";

		for (int k = strbuff.length() - 1; k >= 0; k--) {

			str += strbuff.charAt(k);
		}

		System.out.println(str);
	}
	
public char submehtod(int k) {
	
	System.out.println("Submehtod");
	int i = 5;
	char j = 'g';
	
	return j;
}

}
