public class MutableString {
    public static void main(String[] args) {
        // StringBuffer sb1 = new StringBuffer();
        // sb1.append("Piyush");
        // StringBuffer sb2 = new StringBuffer(" Ranjan");
        // sb1.append(sb2);
        // System.out.println(sb1);
        
        // final StringBuffer sb = new StringBuffer("Virat");// final does not affects the object being referred. Rather it says that now new value cannot be assigned to it.
        // sb.append(" Kohli");
        // System.out.println(sb);
        // // sb = new StringBuffer("Sachin");
        // // System.out.println(sb);

        // StringBuffer sb = new StringBuffer();
        // // System.out.println(sb.capacity());
        // sb.append("abcdefghijklmnop");
        // // sb.append("q");
        // // sb.append("r");
        // System.out.println(sb.capacity());
        // // System.out.println(sb.length());

        // StringBuilder sbl = new StringBuilder(150);
        // System.out.println(sbl.capacity());
        // sbl.append("piyush");
        // sbl.trimToSize();
        // System.out.println(sbl.capacity());

        // StringBuilder sb = new StringBuilder("Malayalam");
        // System.out.println(sb.reverse());

        // StringBuffer sb = new StringBuffer("Sachinopi");
        // System.out.println(sb.capacity());

        // StringBuilder sbr = new StringBuilder("sachin");
        // System.out.println(sbr);
        // sbr.replace(0,6,"piyush");
        // System.out.println(sbr);

        StringBuffer sb = new StringBuffer();
        sb.append("sachin").insert(6, "tendulkar").reverse().append("IND");
        System.out.println(sb);
        sb.delete(0, 4).reverse();
        System.out.println(sb);
    }
}