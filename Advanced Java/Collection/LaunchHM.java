import java.util.HashMap;
import java.util.LinkedHashMap;

public class LaunchHM {

    //In HashMap data is stored in (key-value) pair
    //order of insertion is not preserved. Sometimes we may get unusual pattern
    public static void main(String[] args) {
        HashMap hm = new HashMap();

        hm.put(01, "Piyush");//Entry
        hm.put(02, "Sujeet");
        hm.put(03, "Vidhya");

        System.out.println(hm);

        hm.put(null, null);//key and value: null is allowed
        System.out.println(hm);
        hm.put(03, "Radha");//key cannot be duplicate. It replaces the value
        hm.put(04, "Sujeet");//value can be duplicate.
        System.out.println(hm);

        hm.put("Virat", "Kohli");//nt necessary that key is a number. It can be a String.
        System.out.println(hm);

        LinkedHashMap lhm = new LinkedHashMap();

        //order of insetion is preserved
        lhm.put(1, "Ramesh");
        lhm.put(2, "Suresh");
        lhm.put(3, "Mahesh");

        System.out.println(lhm);
    }
}
