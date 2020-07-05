import java.util.Scanner;
import java.util.Stack;

public class BalancingStars
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Character> s = new Stack<Character>();
        int count=0,pair=0;
        boolean balanced=true,stars;
        for (int i = 0; i < str.length(); i++)
        {
            char c=str.charAt(i);
            if(c=='['||c=='{'||c=='(')
                s.push(c);
            else if(c=='*')
                count++;
            else if(c==')' && s.pop()=='(' && count>=2)
            {
                pair++;
                count=0;
                balanced=true;
            }
            else if(c=='}' && s.pop()=='{' && count>=2)
            {
                pair++;
                count=0;
                balanced=true;
            }
            else if(c==']' && s.pop()=='[' && count>=2)
            {
                pair++;
                count=0;
                balanced=true;
            }
            else
                balanced=false;
        }
        if(balanced)
            System.out.println("Yes "+pair);
    }
}
