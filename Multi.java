import java.util.*;
class Multi
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
int num=s.nextInt();
for(int i=0;i<n-1;i++)
	{
	for(int j=i+1;j<n;j++)
		{ 
		if(a[i]+a[j]==num)
		{
			System.out.println(i+" "+j);
			return;
		}
	}
}
System.out.println("-1");
}
}

