import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
    Scanner s=new Scanner(System.in);
        int d,m,y,n;
        d=s.nextInt();
        m=s.nextInt();
        y=s.nextInt();
        n=s.nextInt();
        int sum=d+m+y;
        if(sum%12==0&&n>50 && n<100)
        {
            System.out.println("Cinema Day");
        }
        else
        {
            System.out.println("Not a Cinema Day");
        }
    }
}

Input (stdin)

3 
3 
1914 
76
Your Output (stdout)

Cinema Day
Expected Output

Cinema Day
