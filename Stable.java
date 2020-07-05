import java.io.*;
import java.util.*;
class Stable
{
   public int password(int n1,int n2,int n3,int n4,int n5) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        if(isBalanced(n1))
            al.add(n1);
        if(isBalanced(n2))
            al.add(n2);
        if(isBalanced(n3))
            al.add(n3);
        if(isBalanced(n4))
            al.add(n4);
        if(isBalanced(n5))
            al.add(n5);
        Collections.sort(al);
       System.out.println(al);
        //return (al.get(al.size()-1) - al.get(0));
       return 0;
    }
   static boolean isBalanced(int N)
   {
       String st = "" + N;
       boolean isBalanced = true;
       int[] freq = new int[10];
       int i = 0;
       int n = st.length();
       for (i = 0; i < n; i++)
           freq[st.charAt(i) - '0']++;

       for (i = 0; i < 9; i++) {
           if (freq[i] != freq[i + 1])
               isBalanced = false;
       }
       if (isBalanced)
           return true;
       else
           return false;
   }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Stable ob =new Stable();
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int n4=sc.nextInt();
        int n5=sc.nextInt();
        int key=ob.password(n1,n2,n3,n4,n5);
        System.out.println(key);
    }
}