import java.util.Scanner;

public class LargestElementArrayWithoutSorting {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();

        // Declaration of an array // datType [] arrName;
        int [] arr;
        // initializing array after Declaration // arrName=new dataType[]{ x,y,z};
        arr = new int[]{22,33,44,66,55};

        // Declaration + Initializing of an array // dataType [] arrName={x,y,z};
        int [] arrN2 = {22,73,88,55,66};

        // Initializing array without passing values with passing size
        // dataType arrName[]=new dataType[size];
        int arrN[] = new int[size];

        for(int i=0;i<arrN.length;i++)
        {
            arrN[i]= sc.nextInt(); // 22 73 88 55 66
        }
        int max=arrN[0];
        for(int i=0;i<arrN.length;i++)
        {
            if(max<arrN[i])
            {
                max=arrN[i];
            }
        }
        System.out.println("Largest element "+max);




    }
}
