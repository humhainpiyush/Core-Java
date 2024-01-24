import java.util.*;

public class LaunchTS {

    //uses Binary Search Tree algorithm
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();

        ts.add(45);
        ts.add(455);
        ts.add(90);
        ts.add(15);
        ts.add(81);
        ts.add(28);
        ts.add(1);
        ts.add(77);
        System.out.println(ts);

        ts.add(77);//duplicates are not allowed
        System.out.println(ts);

        System.out.println(ts.higher(77));
        System.out.println(ts.lower(46));

        //if not present then ceiling will print higher value and floor the nearest lower value
        System.out.println(ts.ceiling(80));
        System.out.println(ts.floor(80));
        
        //if the value is present in the set then it print the same
        System.out.println(ts.ceiling(81));
        System.out.println(ts.floor(81));

        ts.add("Piyush");
        System.out.println(ts);//homogeneous only


    }
}
