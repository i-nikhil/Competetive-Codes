import java.util.Arrays;
import java.util.Scanner;

public class ExchangeDigits {
    static int b,flag=0;
    private static void permute(String str, int l, int r)
    {
        if (l == r)
        {
            if(Integer.parseInt(str)>b)
            {
                flag=1;
                System.out.println(str);
                System.exit(0);
            }
        }
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }

    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        b = sc.nextInt();
        if(Integer.toString(b).length()>Integer.toString(a).length())
        {
            System.out.println("-1");
            System.exit(0);
        }
        String str = "";
        String arr[] = Integer.toString(a).split("");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++)
            str = str + arr[i];
        permute(str,0,str.length()-1);
        if(flag==0)
            System.out.println("-1");
    }
}