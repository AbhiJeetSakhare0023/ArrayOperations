public class FirstHalfInAscendindAndSecondHalfInDescending {
    public static void main(String[] args) {

        int [] numbers={55,33,66,44,20,40,10,30};
        int size=numbers.length;//8
        int temp;
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(numbers[i]>numbers[j])
                {
                    temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
        // 10 20 30 33 40 44 55 66
        for(int i=0;i<(size/2);i++)
        {
            System.out.print(numbers[i] + " "); // 10 20 30 33
        }
        for(int i=(size-1);i>=(size/2);i--)
        {
            System.out.print(numbers[i]+ " "); // 66 55 44 40
        }

    }

}
