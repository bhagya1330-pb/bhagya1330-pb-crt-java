import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int u;
        u=s.nextInt();
        if(u>=30&&u<=50)
        {
            System.out.println("Average");
                
        }
        else if(u>=51&&u<=60)
        {
            System.out.println("Good");
        }
        else if(u>=61&&u<=80)
        {
            System.out.println("Excellent");
        }
        else if(u>=81&&u<=100)
        {
            System.out.println("Outstanding");
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}
Input (stdin)

77
Your Output (stdout)

Excellent
Expected Output

Excellent
