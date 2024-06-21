import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
        int x1,y1,x2,y2,x3,y3;
        x1=s.nextInt();
        y1=s.nextInt();
        x2=s.nextInt();
        y2=s.nextInt();
        x3=s.nextInt();
        y3=s.nextInt();
        float r1=(float)(x1+x2+x3)/3;
        float r2=(float)(y1+y2+y3)/3;
        System.out.printf("%.1f\n",r1);
        System.out.printf("%.1f\n",r2);
    }

}
Input (stdin)

2
4
10
15
5
8
Your Output (stdout)

5.7
9.0
Expected Output

5.7
9.0
