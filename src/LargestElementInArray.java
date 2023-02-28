import java.util.Scanner;
// by using sorting we can search any element like large,second large,small,second small all
public class LargestElementInArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();//4
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        //arr={ 2,5,3,8}
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                int temp=0; // it is needed to swapping purpose
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Largest element in given array is "+arr[size-1]);
    }
}
