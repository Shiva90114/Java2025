// Collection Example
import java.util.*;

class CollectionMethod {

    public static void main(String[] args) {

        Collection<String> cobj1 = new ArrayList<>();
        cobj1.add("Shiv");
        cobj1.add("Ram");
        cobj1.add("Ravi");
        cobj1.add("Raju");

        Collection<String> cobj2 = new ArrayList<>();
        cobj2.add("Yash");
        cobj2.add("Suyash");
        cobj2.add("Rahul");
        cobj2.add("Shivam");

        System.out.println(cobj1);
        System.out.println(cobj2);

        // addAll(Collection c)
        cobj1.addAll(cobj2);
        System.out.println(cobj1);

/*      // remove(Object o)
        cobj1.remove("Ravi");
        System.out.println(cobj1);

        // removeAll(Collection c)
        cobj1.removeAll(cobj2);
        System.out.println(cobj1);
*/
        // add again
        cobj1.add("Ravi");
        System.out.println(cobj1);

        // retainAll(Collection c)  (common elements)
        cobj1.retainAll(cobj2);
        System.out.println(cobj1);

        // clear()
        cobj2.clear();
        System.out.println(cobj2);

        // contains(Object o)
        System.out.println(cobj1.contains("Ram"));

        // size()
        System.out.println(cobj1.size());

        // toArray()
        Object arr[] = cobj1.toArray();
        System.out.println("Elements of cobj1 using toArray():");
        for (Object data : arr) {
            System.out.println(data);
        }
    }
}
