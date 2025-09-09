import java.util.*;
// WeakHashMap

class Demo{

	public void finalize(){
	
		System.out.println("Object gheun chalalo");
	}
}
class MapDemo{

	public static void main(String[] args){
	HashMap hm = new HashMap();
	//WeakHashMap hm = new WeakHashMap();

	Demo obj1 = new Demo();
	Demo obj2 = new Demo();

	hm.put(obj1,"Xyz");
	hm.put(obj2,"ABC");
	//hm.put(obj2,"Xyz");
//System.out.println(hm);
// obj1=null;
// System.gc();
	System.out.println(hm);
	}
}
