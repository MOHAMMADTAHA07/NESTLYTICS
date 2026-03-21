import java.util.*;
public class GreatestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first num ");
        int a = sc.nextInt();
        System.out.print("Enter second num ");
        int b = sc.nextInt();
        if (a > b)
            System.out.println(a + " is Greatest num");
        else
            System.out.println(b + " is Greatest num");
    }
}