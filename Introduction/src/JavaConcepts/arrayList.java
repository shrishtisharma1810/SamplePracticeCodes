package JavaConcepts;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("a");
		al.add("b");
		al.add(0,"c");
		System.out.println(al);
		/*
		al.remove(0);
		System.out.println(al);
		al.remove("b");
		System.out.println(al);
		*/
		System.out.println(al.get(2)); // testing 
		System.out.println(al.contains("a")); 
		System.out.println(al.indexOf("a")); 
		System.out.println(al.isEmpty());
		System.out.println(al.size());



	}

}
