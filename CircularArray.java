import java.util.Scanner;
public class CircularArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char arr[]={'A','B','C','D','E','F'};
        System.out.println("Enter index btw. 0 & 5:");
        int n=sc.nextInt();
        for(int i=n;i<arr.length+n;i++)
            System.out.print(arr[i%arr.length]+" ");
    }
}
