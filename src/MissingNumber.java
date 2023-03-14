public class MissingNumber {
    public static void main(String[] args) {
        int num[]={2,4,5,6,7,10};
        boolean status=true;
        for(int j=1;j<=10;j++)
        {
            for(int i=0;i< num.length;i++)
            {
                if(j==num[i])
                {
                    status=false;
                    break;
                }
            }
            if(status==true)
            {
                System.out.print(j+" ");
            }
            status=true;

        }
    }
}
