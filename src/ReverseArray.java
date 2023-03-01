
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Before");
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("After");
        for(int i=size-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
}
