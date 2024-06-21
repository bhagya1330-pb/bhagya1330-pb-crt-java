import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a,w;
        float h;
        a=s.nextInt();
        w=s.nextInt();
        h=s.nextFloat();
        if(a>=18 && w>=45 && h>=5.5)
        {
            System.out.println("He or She can donate blood");
        }
        else
        {
            System.out.println("He or She unable to donate blood");
        }
    }
}
Input (stdin)

15
44
5.4
Your Output (stdout)

He or She unable to donate blood
Expected Output

He or She unable to donate blood
