public class PrimeNumberArray {
    public static void main(String[] args) {

        int num1[]={1,2,13,4,56,99,11};
        for(int i=0;i<num1.length;i++)
        {
            if(num1[i]!=0 || num1[i]!=1)
            {
                int count=0;
                for(int j=2;j<=num1[i];j++)
                {
                    if(num1[i]%j==0)
                    {
                        count++;
                    }
                }
                if(count==1){
                    System.out.print(num1[i]+" ");
                }
            }

        }
    }



}
