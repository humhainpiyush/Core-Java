import java.util.ArrayDeque; //Deque -> Double Ended Queue
//Inside a queue we can add or remove an element only from one side
//Since it is a Deque we can add/remove from the either end that is front end or rear end
public class ArrDeq {
    public static void main(String[] args) {
        ArrayDeque adq1 = new ArrayDeque();

        adq1.add(100);
        adq1.add(200);
        adq1.add(200);//duplicates allowed
        adq1.add("P@");//heterogeneous data insertion allowed
        System.out.println(adq1);

        adq1.addFirst(99);//add element from the front end
        adq1.addLast(201);//add element from the rear end
        System.out.println(adq1);

        adq1.offer(10);//similar to add but chances are there that sometimes the elements may not be added
        adq1.offerFirst(14);
        adq1.offerLast(45);
        System.out.println(adq1);

        //since it is a Doubly ended queue we can access it from front or rear
        System.out.println(adq1.getFirst());
        System.out.println(adq1.getLast());
        //no access in between
    }
}
