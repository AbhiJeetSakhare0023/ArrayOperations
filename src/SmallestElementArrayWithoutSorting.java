import java.util.Scanner;

public class SmallestElementArrayWithoutSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt(); // 4
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt(); // 55 33 22 11
        }
        int small=arr[0];
        for(int i=0;i<size;i++)
        {
            if(small>arr[i])
            {
                small=arr[i];
            }
        }
        System.out.println("Smallest element "+small);
    }
}
