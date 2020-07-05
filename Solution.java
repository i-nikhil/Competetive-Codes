import java.io.*;
import java.util.*;

public class Solution {

    static int[] Rotate(int a[], int k)
    {
        int temp[]=new int[a.length];
        int index=0;
        for(int i=a.length-k;i<(2*a.length)-k;i++)
        {
            temp[index++]=a[i%a.length];
        }
        return temp;
    }

    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();//array size
        int k=sc.nextInt();//rotation times
        int q=sc.nextInt();//no. of index
        int arr[]=new int[n];
        int query[]=new int[q];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(int i=0;i<q;i++)
            query[i]=sc.nextInt();
        arr=Rotate(arr,k);
        for(int i=0;i<q;i++)
            System.out.println(arr[query[i]]);
    }
}
