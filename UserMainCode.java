import java.io.*;
import java.util.*;
class UserMainCode
{
    public int findKey(int n1,int n2,int n3) {
    String s1,s2,s3,s="";
    s1=Integer.toString(n1);
    s2=Integer.toString(n2);
    s3=Integer.toString(n3);
    int a,b,c;
    for(int i=0;i<4;i++)
    {
        a=Integer.parseInt(String.valueOf(s1.charAt(i)));
        b=Integer.parseInt(String.valueOf(s2.charAt(i)));
        c=Integer.parseInt(String.valueOf(s3.charAt(i)));
        s=s+Integer.toString(Math.max(a,Math.max(b,c)));
    }
    return Integer.parseInt(s);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        UserMainCode ob =new UserMainCode();
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int key=ob.findKey(n1,n2,n3);
        System.out.println(key);
    }
}