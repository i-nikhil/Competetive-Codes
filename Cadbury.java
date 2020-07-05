import java.util.Scanner;

public class Cadbury {

    public static int no_of_student(int row,int column)
    {
        int count=0;
        while (row!=0 && column!=0)
        {
            count++;
            if(row>column)
                row-=column;
            else
                column-=row;
        }
        return count;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int min_length = sc.nextInt();
        int max_length = sc.nextInt();
        int min_width = sc.nextInt();
        int max_width = sc.nextInt();
        int student=0;
        if (0<min_length && min_length<1501 && 0<min_width && min_width<1501 && 0<max_length && max_length<1501 && 0<max_width && max_width< 1501)
        {
            for(int i=min_length;i<=max_length;i++)
            {
                for(int j=min_width;j<=max_width;j++)
                {
                    student+=no_of_student(i,j);
                }
            }
            System.out.println(student);
        }
    }
}
