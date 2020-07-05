public class CircularKanade {
    static int kadane(int a[])
    {
        int n = a.length;
        int max_so_far=0;
        int max_ending_here=0;
        for (int i = 0; i < n; i++)
        {
            max_ending_here = max_ending_here + a[i];
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }
    public static void main(String args[])
    {
        int arr[]={11, 10, -20, 5, -3, -5, 8, -13, 10};
        int linear[]=new int[arr.length];
        int result=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            int index=0;
            for (int j = i; j < arr.length + i; j++)
                linear[index++] = arr[j % arr.length];
            result=Math.max(kadane(linear),result);
        }
        System.out.println(result);
    }
}

