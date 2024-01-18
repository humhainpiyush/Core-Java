class New{
    int x;
    New(){

        x = 5;
    }
    
}
public class Test {
    public static void main(String[] args) {
        New n = new New();
        System.out.println(n.x);
    }
}
