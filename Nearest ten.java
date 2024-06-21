import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        n=s.nextInt();
        int rem=n%10;
        if(rem>=5)
        {
            int r1=n+(10-rem);
            System.out.println(r1);
        }
        else
        {
            int r2=n-rem;
            System.out.println(r2);
        }
    }
}

Input (stdin)

18
Your Output (stdout)

20
Expected Output

20
