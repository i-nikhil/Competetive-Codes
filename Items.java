import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Items {
    public static void main(String args[])
    {
        HashMap<String,Integer> h1=new HashMap<>();
        HashMap<String,Integer> h2=new HashMap<>();
        h1.put("apple", 60); h1.put("bread", 20); h1.put("wheat", 50); h1.put("oil", 30);
        h2.put("milk", 20); h2.put("bread", 15); h2.put("wheat", 40); h2.put("apple", 60);
        System.out.println(h1);
        System.out.println(h2);
        AtomicInteger count= new AtomicInteger();
        h1.forEach((k,v) ->
        {
            if(h2.containsKey(k) && h2.get(k)!=v)
                count.getAndIncrement();
        });
        System.out.println(count);
    }
}
