import java.util.*;

public class Three {
    public static void printArray(int[] arr, int n) {
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("\b\b]");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = i + 1;
        }
        
        System.out.print("1: ");
        printArray(numbers, n);
        
        int skipCount = 2;
        int elementCount = n;
        while (skipCount <= elementCount) {
            int newElementCount = 0;
            for (int i = 0; i < elementCount; i += skipCount) {
                numbers[newElementCount++] = numbers[i];
            }
            elementCount = newElementCount;
            System.out.print(skipCount + ": ");
            printArray(numbers, newElementCount);
            skipCount++;
        }
        
        sc.close();
    }
}