import java.util.Scanner;

public class One {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first short: ");
        short a = sc.nextShort();

        System.out.print("Enter second short: ");
        short b = sc.nextShort();

        short c = (short) (a + b);

        System.out.println("Sum: " + c);

        sc.close();
    }
}
