import java.util.*;

public class LaunchHS {
    public static void main(String[] args) {
    //uses hashing algorithm and stores tha data using hash table
        HashSet hs = new HashSet();

        hs.add(100);
        hs.add(26);
        hs.add(41);
        hs.add(35);
        hs.add(84);

        System.out.println(hs);//order of insertion not preserved

        
    //uses linked list as well as hashing algorithm.
    //child class of HashSet
        LinkedHashSet lhs = new LinkedHashSet();

        lhs.add(4);
        lhs.add(7);
        lhs.add(2);
        lhs.add(3);

        System.out.println(lhs);//order of insertion is preserved
    }
}
