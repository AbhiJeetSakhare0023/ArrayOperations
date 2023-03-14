import java.util.Scanner;

public class AvgOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int size=sc.nextInt();
        int num[]=new int[size];
        int sum=0;
        double avg;
        System.out.println("Enter Elements : ");
        for(int i=0;i<size;i++)
        {
            num[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            sum=sum+num[i];
        }
        avg=sum/(size);
        System.out.println("Avg of Array Elements : "+ avg);
    }
}
