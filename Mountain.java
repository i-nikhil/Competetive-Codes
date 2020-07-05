import java.util.*;
public class Mountain
{
    static int count=0;
    public static boolean isMountain(String s)
    {
        char peak1='1',peak2='2';
        for(int i=0;i<s.length()-1;i++)
        {
            if(Integer.parseInt(String.valueOf(s.charAt(i+1)))>Integer.parseInt(String.valueOf(s.charAt(i))))
                continue;
            else
            {
                peak1=s.charAt(i);
                break;
            }
        }
        for(int i=s.length()-1;i>0;i--)
        {
            if(Integer.parseInt(String.valueOf(s.charAt(i-1)))>Integer.parseInt(String.valueOf(s.charAt(i))))
                continue;
            else
            {
                peak2=s.charAt(i);
                break;
            }

        }
        return (peak1==peak2);
    }
    public static void permute(String str, int l, int r)
    {
        if (l == r)
        {
            if(isMountain(str))
                count++;
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
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 109)
            System.exit(0);
        String str="";
        for(int i=1;i<=n;i++)
            str=str+i;
        permute(str,0,n-1);
        System.out.println(count);
    }
}