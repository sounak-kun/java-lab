import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str1 = sc.nextLine();
        String str2 = str1;
        
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("==: " + (str1 == str2));
        System.out.println("equals(): " + str1.equals(str2));
        
        System.out.print("\n\nEnter another string: ");
        String str3 = sc.nextLine();
        String str4 = new String(str3);
        
        System.out.println("String 3: " + str3);
        System.out.println("String 4: " + str4);
        System.out.println("==: " + (str3 == str4));
        System.out.println("equals(): " + str3.equals(str4));

        sc.close();
    }
}