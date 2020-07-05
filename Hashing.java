import java.util.HashSet;

public class Hashing
{
    static boolean isSubset(int a1[],int a2[])
    {
        HashSet<Integer> h=new HashSet<Integer>();
        for(int i=0;i<a1.length;i++)
            h.add(a1[i]);
        System.out.println(h);
        for(int i=0;i<a2.length;i++)
        {
            if(!h.contains(a2[i]))
                return false;
        }
        return true;
    }

    public static void main(String args[])
    {
        int a1[]={6,5,7,0,2,3,5,3,1,2,2,3,3,0,0,0,1,4,0};
        int a2[]={2,3,3};
        System.out.println(isSubset(a1,a2));
    }
}
