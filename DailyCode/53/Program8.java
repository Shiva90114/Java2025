// Iterable- Collection - Set - SortedSet-NavigableSet-TreeSet

import java.util.*;
class TreeSetDemo{

	public static void main(String[] args){
	
		TreeSet ts = new TreeSet();

		ts.add(new StringBuffer("Shiva"));
		ts.add(new StringBuffer("Rahul"));
		ts.add(new StringBuffer("Ram"));
		ts.add(new StringBuffer("Rahul"));

		System.out.println(ts);


	}
}
/*
 * ts.add(new StringBuffer("Shiva"));
                ts.add(new StringBuffer("Rahul"));
                ts.add(new StringBuffer("Ram"));
                ts.add(new StringBuffer("Rahul"));
 * error
 *
 * Exception in thread "main" java.lang.ClassCastException: java.lang.StringBuffer cannot be cast to java.lang.Comparable
        at java.util.TreeMap.compare(TreeMap.java:1294)
        at java.util.TreeMap.put(TreeMap.java:538)
        at java.util.TreeSet.add(TreeSet.java:255)
        at TreeSetDemo.main(Program8.java:
	*/
