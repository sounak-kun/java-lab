import java.util.Scanner;
public class ArrayQ3 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int [n];
        int temp[] = new int [n];
        for(int i=0;i<n;i++)
            arr[i]=i+1;
        System.out.print("Array is: ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        int size=n;
        int skip=2;
        while(skip < temp.length)
        {
            size=size/skip;
            temp = new int [size+1];
            int idx=0;
            for (int i = 0; i < arr.length; i+=skip) 
                temp[idx++] = arr[i];
            arr = new int [size+1];
            for(int i = 0; i < temp.length; i++) 
                arr[i]=temp[i];
            skip+=1;
        }
        System.out.println("\nFinal Array: ");
        for (int i = 0; i < temp.length; i++) 
            System.out.print(temp[i]+" ");
    }
}

