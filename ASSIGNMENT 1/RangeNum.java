import java.util.*;
public class RangeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting Num ");
        int start = sc.nextInt();
        System.out.print("Enter ending Num ");
        int end = sc.nextInt();
        int sum = 0;
        for(int i = start; i <= end; i++)
            sum += i;
        System.out.println(sum);
    }
}
