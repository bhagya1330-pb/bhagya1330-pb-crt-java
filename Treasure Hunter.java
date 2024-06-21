import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,a,b;
        n=s.nextInt();
        a=s.nextInt();
        b=s.nextInt();
        float div1 =a/100.0f;
        int r1 = (int) (div1 * n);
        float div2 =b/100.0f;
        int r2 = (int) (div2 * (n - r1));
        int rem = n - r1 - r2;
        int r = rem / 3;
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r);
    }
}
Input (stdin)

729
65
87
Your Output (stdout)

473
222
11
Expected Output

473
222
11
