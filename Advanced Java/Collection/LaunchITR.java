import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class LaunchITR {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        System.out.println(al);


        //for loop:
        // for(int i = 0; i < al.size(); i++){
        //     Object o = al.get(i);
        //     System.out.println(o);

        // }

        //for-each loop:
        // for(Object o : al){
        //     System.out.println(o);
        // }

        // using iterator we can fetch the items of the array list
        // iterator acts as a cursor
        Iterator it = al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //ListIterator is used for fetching the items in an ArrayList
        //It can be used from both of the sides(can iterate from the reverse direction)
        //It is only present in the List based classes
        ListIterator litr = al.listIterator(al.size());
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }
    }
}
