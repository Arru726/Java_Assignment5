import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of tyres: ");
        int n = sc.nextInt();

        Vehicle v;

        switch (n) {
            case 2:
                v = new Bike();
                break;
            case 4:
                v = new Car();
                break;
            default:
                v = new Vehicle();
                break;
        }

        v.display();
        sc.close();
    }
}
