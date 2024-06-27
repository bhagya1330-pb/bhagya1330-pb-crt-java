import java.util.*;
class MergeSort
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int arr1[]=new int[n];
for(int i=0;i<n;i++)
{
 arr1[i]=s.nextInt();
}
int m=s.nextInt();
int arr2[]=new int[m];
for(int i=0;i<m;i++)
{
 arr2[i]=s.nextInt();
}
int arr3[]=new int[n+m];
int k=0;
for(int i=0;i<n;i++)
{
  arr3[k]=arr1[i];
  k++;
}
for(int i=0;i<m;i++)
{
  arr3[k]=arr2[i];
  k++;
}
Arrays.sort(arr3);
for(int i=0;i<k;i++)
{
  System.out.print(arr3[i]+" ");
}
}
}


