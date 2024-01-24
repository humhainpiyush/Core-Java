import java.util.Hashtable;
import java.util.TreeMap;

public class Map2 {
    public static void main(String[] args) {

        //order of insertion not preserved
        //dynamic size
        //synchronized - means thread safe
        Hashtable ht = new Hashtable();
        ht.put(1, "Dhawan");
        ht.put(7, "Dhoni");//duplicate allowed bu keys should not be duplicate
        ht.put(8, "Dinda");
        // ht.put(null, null);//Null value not allowed here
        System.out.println(ht);

        ht.putIfAbsent(2, "Dinesh");//if this entry is not present then only it will be added
        System.out.println(ht);

        //order of insetion not preserved
        //but the result will be sorted on the value of keys
        TreeMap tm = new TreeMap();
        tm.put(1, "Rahul");
        tm.put(2, "Rahane");
        tm.put(3, "Ravindra");

        //key and value both are stored as an object

        System.out.println(tm);
    }
}
