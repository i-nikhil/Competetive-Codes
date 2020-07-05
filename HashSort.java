import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class HashSort
{
    public static void fun(int arr[])
    {
        LinkedHashMap<Integer,Integer> h1=new LinkedHashMap<>();//frequency
        for(int i=0;i<arr.length;i++)
        {
            h1.put(arr[i],h1.getOrDefault(arr[i],0)+1);
        }
        //System.out.println(h1);
        AtomicInteger count= new AtomicInteger();
        h1.entrySet().stream().sorted(Map.Entry.<Integer,Integer> comparingByValue().reversed()).forEach(v->{
            for(int i=0;i<v.getValue();i++)
            {
                arr[count.getAndIncrement()]=v.getKey();
            }
        });
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String args[]) {
        int arr[] = {2, 5, 2, 8, 5, 6, 8, 8};
        //int arr[]={5,3,4,5,8,1,1,5};
        fun(arr);
    }
}
