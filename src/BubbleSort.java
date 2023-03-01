public class BubbleSort {
    public static void main(String[] args) {
        int num[] ={50,40,30,20,10,90,60,70}; // o/p - 20 30 40 50 ,90 70 60 10
        // we will apply bubble sort here
        int size=num.length;

        int temp;
        for(int i=0;i<(size/2);i++) // 0 to 3
        {
            // 1st half in ascending order
            for(int j=i+1;j<(size/2);j++)
            {
                if(num[i]>num[j])
                {
                    temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
            // 2nd half in descending order
            for(int j=(size/2);j<size-1;j++) // 4 t0 7 / 10 90 60 70
            {
                if(num[j]<num[j+1]) // 10<90
                {
                    temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(num[i]+" ");
        }
    }
}
