public class SortInAsending {
    public static void main(String[] args) {
        int num[]={40,30,20,10}; // o/p - 10 20 30 40
        int size=num.length; // 4
        int temp;
        for(int i=0;i<size;i++) // 0 to 3
        {
            for(int j=i+1;j<size;j++) // j=1 , 1 to 3,j=2
            {
                if(num[i]>num[j]) // 40>30 ,
                {
                    temp=num[i]; // temp=40
                    num[i]=num[j]; // num[i]=30
                    num[j]=temp; // num[j]=40
                }
            }

        }
        for(int i=0;i<size;i++)
        {
            System.out.print(num[i]+" "); // 10 20 30 40
        }
    }
}
