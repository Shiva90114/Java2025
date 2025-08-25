// Hashset LinkedSet
import java.util.*;

class SetDemo{

	public static void main(String[] args){

	LinkedHashSet ls = new LinkedHashSet();

	ls.add(20);
	ls.add(10);
	ls.add(20);
	ls.add(40);
	ls.add(30);

	System.out.println(ls); // {20,10,40,30};

	}
}
