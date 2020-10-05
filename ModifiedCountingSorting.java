import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

class ModifiedCountingSorting
{
    public static void main(String[] args)
    {
        //input array
        int arr[]={100000000,3,88,30,0,45,76,29,100000000,92,3,3,0,76,-1,-1,999999999};
        c_sort(arr);
        System.out.print(Arrays.toString(arr));
    }

    private static int[] c_sort(int[] arr)
    {
        int n=arr.length;
        HashMap<Integer,Integer> h=new HashMap<>();

        //storing frequency of all elements
        for(int i=0;i<n;i++)
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);

        AtomicInteger index= new AtomicInteger(0);

        //nested loop, but of O(k*v), where k is key & v is frequency
        //So total n iteration, hence O(n), right??
        h.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach((k)->
        {
            for(int i=0;i<k.getValue();i++)
                arr[index.getAndIncrement()]=k.getKey();
        });
        return arr;
    }
}
