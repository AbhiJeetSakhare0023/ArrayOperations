public class CopyArrayInAnotherArray {
    public static void main(String[] args) {
        String str[] = {"Java", "SQL", "C++", "JDBC"};
        String str1[] = new String[str.length];
        for (int i = 0; i < str.length; i++)
        {
            str1[i]=str[i];
        }
        for(int j=0;j< str1.length;j++)
        {
            System.out.print(str1[j]+" ");
        }

    }
}
