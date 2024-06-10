package JavaConcepts;

import java.util.HashSet;
import java.util.Iterator;

public class hashsetEx {
	//not ordered
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("UK");
		hs.add("US");
		hs.add("IN");
		hs.add("UK");
		hs.add("USA");
		System.out.println(hs);
		System.out.println(hs.remove("UK"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		Iterator<String> i=hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
