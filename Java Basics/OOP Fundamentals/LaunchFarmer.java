import java.util.Scanner;;

class Farmer{
    int pa;
    float td;
    float roi;
    float si;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your amount: ");
        pa = sc.nextInt();
        System.out.print("Please enter time duration: ");
        td = sc.nextFloat();

        roi = 4.5f;
    }

    void compute(){
        si = (pa*td*roi)/100f;
    }

    void disp(){
        System.out.println("Simple Interest; "+ si);
    }
}

public class LaunchFarmer {
    public static void main(String[] args) {
        Farmer f = new Farmer();
        f.input();
        f.compute();
        f.disp();
    }
}
