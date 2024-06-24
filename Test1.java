class Test1
{
public static int fun(int n)
{
 int c=0;
	for(int i=1;i<n;i++)
	{
	for(int j=0;j<=Math.log(n);j++)
	{
	c++;
	}
	}
return c;
}
public static void main(String args[])
{
int n=100;
System.out.println("N=100, no.of instructions O(n logn):"+fun(n));
}
}