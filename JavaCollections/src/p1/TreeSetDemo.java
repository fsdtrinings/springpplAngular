package p1;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<Number> ts1 = new TreeSet<>();
		ts1.add(15);
		ts1.add(75);
		ts1.add(5);
		ts1.add(175);
		
		System.out.println(ts1);
		
		TreeSet<String> ts2 = new TreeSet<>();
		ts2.add("tts");
		ts2.add("atts");
		ts2.add("aabtts");
		ts2.add("abtts");
		ts2.add("abactts");
		System.out.println(ts2);
		
	}
}
