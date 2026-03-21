import java.util.*;;
public class GreatestThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first num ");
        int a = sc.nextInt();
        System.out.print("Enter second num ");
        int b = sc.nextInt();
        System.out.print("Enter third num ");
        int c = sc.nextInt();
        if(a >= b && a >= c)
            System.out.println("Greatest num is " + a);
        else if(b >= a && b >= c)
            System.out.println("Greatest num is " + b);
        else
            System.out.println("Greatest num is " + c);
    }
}