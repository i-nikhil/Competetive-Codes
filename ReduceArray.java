import java.util.*;

public class ReduceArray {
    public static void fun(int a[])
    {
        LinkedHashMap<Integer,Integer> h1=new LinkedHashMap<>();
        int copy[]=a.clone();
        Arrays.sort(a);
        for(int i=0;i<a.length;i++)
            h1.put(a[i],i);
        for(int i=0;i<copy.length;i++)
            copy[i]=h1.get(copy[i]);
        System.out.println(Arrays.toString(copy));
    }
    public static void main(String args[]) {
        int arr[] = {5, 10, 40, 30, 20};
        //int arr[] = {5, 10, 40, 30, 20,1,44,-4,0};
        //assuming all values are distinct
        fun(arr);
    }
}
