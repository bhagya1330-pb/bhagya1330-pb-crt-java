import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
        int w,a,c;
        w=s.nextInt();
        a=s.nextInt();
        c=s.nextInt();
        int t=(a*75)+(c*30);
        if(t<=w)
        {
            System.out.println("Boat is stable");
        }
        else
        {
            System.out.println("Boat will drown");
        }
    }
}
Input (stdin)

600
7
4
Your Output (stdout)

Boat will drown
Expected Output

Boat will drown
