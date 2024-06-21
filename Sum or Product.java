import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a,b;
        a=s.nextInt();
        b=s.nextInt();
        int r1=a*b;
        int r2=a+b;
        if(r1>1000)
        {
            System.out.println(r2);
        }
        else
        {
            System.out.println(r1);
        }
    }
}
Input (stdin)

10
20
Your Output (stdout)

200
Expected Output

200
