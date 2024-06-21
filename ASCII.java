import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
Scanner s=new Scanner(System.in);
    char a;
        a=s.next().charAt(0);
        if(a>=65 && a<=90)
        {
            System.out.println("Upper");
        }
        else if(a>=97 && a<=122)
        {
            System.out.println("Lower");
        }
        else if(a>=48 && a<=57)
        {
            System.out.println("Number");
        }
        else
        {
            System.out.println("Symbol");
        }
    }
}
Input (stdin)

A
Your Output (stdout)

Upper
Expected Output

Upper
Input (stdin)

d
Your Output (stdout)

Lower
Expected Output

Lower
