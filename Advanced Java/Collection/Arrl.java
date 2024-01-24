import java.util.*;
public class Arrl {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();

        al1.add("Piyush");
        al1.add("Ankit");//no specification of size
        al1.add("Saras");//each item is added to the last
        System.out.println(al1);

        al1.add(100);//adding heterogenerous items
        System.out.println(al1);
        al1.add(1,200);//can be added to a specified index
        System.out.println(al1);
        al1.add(100);//duplicates are also allowed in ArrayList
        System.out.println(al1);
        al1.

        ArrayList al2 = new ArrayList();
        al2.add("home");
        al2.addAll(al1);//add collection into a collection
        al2.add(null);//null insertion is also possible
    
        System.out.println(al2);
        System.out.println(al2.get(5));//retrieving the arrayList
    }
}