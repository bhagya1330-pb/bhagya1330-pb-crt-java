import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        n=s.nextInt();
        {
            if(n>=100&&n<=200)
        {
            int r=(n/4);
            System.out.println(r);
                System.out.println(r);
                System.out.println(r);
                System.out.println(r+n%4);
        }
        else
        {
            System.out.println("INVALID INPUT");
        }
        }
    }
}
Input (stdin)

102
Your Output (stdout)

25
25
25
27
Expected Output

25
25
25
27
Input (stdin)

320
Your Output (stdout)

INVALID INPUT
Expected Output

INVALID INPUT
