// Lisr
//
// Code -7
// Collection
// 

import java.util.*;
class CollectionMethods {

	public static void main(String[] args) {
	
		Collection<String> obj1 = new ArrayList<String>();
		
		obj1.add("Shiva");
                obj1.add("Ram");
                
		Collection<String> obj2 = new ArrayList<String>();
                obj2.add("Shiv");
                obj2.add("Rahul");

                // void clear()
                obj2.clear();
                System.out.println("After clear(): " + obj2);

                // boolean contains(Object o)
                 System.out.println("Contains Ram: " + obj1.contains("Ram"));

               // boolean containsAll
                System.out.println("Contains all: " +obj1.containsAll(obj2));

                // boolean isEmpty()
                 System.out.println("Is obj2 empty: " +obj2.isEmpty());

                // int size()
                System.out.println("Size of obj1: " + obj1.size());

                // Object[] toArray()
                Object arr[] = obj1.toArray();

                for (Object data : arr) {
                            System.out.println(data);
                }

                  System.out.println("obj1: " + obj1);
                  System.out.println("obj2: " + obj2);

                  // boolean addAll
                  obj1.addAll(obj2);
                  System.out.println("After addAll(): " + obj1);

                 // boolean remove(Object o)
                   obj1.remove("Ram");
                   System.out.println("After remove(): " + obj1);

                 // boolean removeAll
                  obj1.removeAll(obj2);
                  System.out.println("After removeAll(): " + obj1);

                 obj1.add("Ram");
                 obj2.add("Shiva");

                 System.out.println("Before retainAll():");
                 System.out.println("obj1: " + obj1);
                 System.out.println("obj2: " + obj2);

                // boolean retainAll
                  obj1.retainAll(obj2);
                  System.out.println("After retainAll(): " + obj1);

                // boolean add(E e)
                obj1.add("Rahul");
                System.out.println("After add(): " + obj1);

        
		// Condition
                obj1.removeIf(s -> s.startsWith("R"));
                 System.out.println("After removeIf(): " + obj1);
	}
}

