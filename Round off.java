import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        float a;
        a=s.nextFloat();
        System.out.printf("%.0f\n",Math.floor(a));
        System.out.printf("%.1f\n",Math.ceil(a));
        System.out.printf("%.1f\n",Math.floor(a));
    }
}
Input (stdin)

54.5
Your Output (stdout)

54
55.0
54.0
Expected Output

54
55.0
54.0
