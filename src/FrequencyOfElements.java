import java.util.Arrays;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] arr= new int[]{2,2,3,4,5,2,1,1};
        int [] countArr=new int[arr.length];// {0,0,0,0,0,0,0,0}--Default values present in new array
        int visited=-1;// to store -1 value in new array whenever same element coming
        for(int i=0;i<arr.length;i++)
        {
            int count=1;// each element first have count=1
            for(int j=i+1;j<arr.length;j++)
        {
                if(arr[i]==arr[j])
                {
                    count++; // 3
                    countArr[j]=visited; //
                }
        }
            if(countArr[i]!=visited)
            {
                countArr[i]=count;
            }
            // at 1st iteration -- 3 -1 1 1 1 -1 2 -1
        }
        for(int i=0;i<countArr.length;i++)
        {
            if(countArr[i]!=visited)
            {
                System.out.println("Frequency of " + arr[i] + "= " + countArr[i]);
            }
        }
    }
}
