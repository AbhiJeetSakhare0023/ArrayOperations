import java.util.Scanner;

public class SumOfEvenPositionNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : "); // 4
        int size=sc.nextInt();
        int num[]=new int[size];
        int sum=0;
        System.out.println("Enter Elements : "); // 10,20,30,40
        for(int i=0;i<size;i++)
        {
            num[i]=sc.nextInt();
        }
        for(int i=0;i<size;i=i+2) // if use if() --> i++
        {
            sum=sum+num[i];
            /*if(i%2==0)
            {
                sum=sum+num[i];
            }*/
        }
        System.out.println("Sum of Even position numbers: "+sum);
    }
}
