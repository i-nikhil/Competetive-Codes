import java.util.Arrays;
import java.util.HashMap;

public class HashMapDemo
{
    public static void find(int a[])
    {
        HashMap<Integer,Integer> h= new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            if (h.containsKey(a[i]))
                h.put(a[i], h.get(a[i]) + 1);
            else
                h.put(a[i], 1);
        }
        System.out.println(h);
        int max1=0,max2=0,max3=0,v1,v2,v3;
        v1=v2=v3=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++) {
            if (h.get(a[i]) > v1) {
                max1 = a[i];
                v1 = h.get(a[i]);
            }
        }
        for(int i=0;i<a.length;i++) {
            if (h.get(a[i]) > v2 && h.get(a[i]) != v1) {
                max2 = a[i];
                v2 = h.get(a[i]);
            }
        }
        for(int i=0;i<a.length;i++)
        {
            if(h.get(a[i])>v3 && h.get(a[i])!=v1 && h.get(a[i])!=v2)
            {
                max3 = a[i];
                v3 = h.get(a[i]);
            }
        }
        System.out.println("1st Maximum="+max1+"\n2nd Maximum="+max2+"\n3rd Maximum="+max3);
    }
    public static void main(String args[])
    {
        //int arr[] = {4,3,4,4,2,4,6,6,6,6,5,3,5,7,9,7,6,4,2};
        //int arr[]={56,56,56,56,32,32,11,11,11,11};
        int arr[]={9,8,8,7,7,7,7,7,6,6,6,6,5,5,5,5,5,4,4,4,4,4,4,3,3,3,3,3,3,3,3,3,3,2,2,1,1,1,0};
        find(arr);
    }
}
