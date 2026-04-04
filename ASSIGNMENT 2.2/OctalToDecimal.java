import java.util.*;

public class OctalToDecimal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter octal number:");
        int octal = sc.nextInt();

        int decimal = 0;
        int base = 1;

        while (octal > 0) {

            int digit = octal % 10;
            decimal = decimal + digit * base;

            base = base * 8;
            octal = octal / 10;

        }

        System.out.println("Decimal = " + decimal);
    }
}