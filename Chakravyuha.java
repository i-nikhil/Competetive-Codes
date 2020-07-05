import java.util.ArrayList;
import java.util.Scanner;
class Coordinate
{
    int x,y;
    Coordinate(int x,int y)
    {
        this.x=x;
        this.y=y;
    }

}
public class Chakravyuha {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        int spiral = (n + 1) / 2, start = 0, end = n - 1, step = 1;
        ArrayList<Coordinate> al=new ArrayList<Coordinate>();
        al.add(new Coordinate(0,0));
        for (int i = 0; i < spiral; i++) //spiral
        {
            for (int top = start; top <= end; top++) //top
            {
                arr[start][top] = step;
                if (step % 11 == 0)
                    al.add(new Coordinate(start,top));
                step++;
            }
            for (int right = start+1; right <= end; right++) //right
            {
                arr[right][end] = step;
                if (step % 11 == 0)
                    al.add(new Coordinate(right,end));
                step++;
            }
            for (int bottom = end-1; bottom >= start; bottom--) //bottom
            {
                arr[end][bottom] = step;
                if (step % 11 == 0)
                    al.add(new Coordinate(end,bottom));
                step++;
            }
            for (int left = end-1; left >= start+1; left--) //left
            {
                arr[left][start] = step;
                if (step % 11 == 0)
                    al.add(new Coordinate(left,start));
                step++;
            }
            start++;
            end--;
        }

        for(int i=0;i<n;i++)//printing array
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Total Power points:"+al.size());

        for(int i=0;i<al.size();i++)//printing power points
            System.out.println("("+al.get(i).x+","+al.get(i).y+")");
    }
}