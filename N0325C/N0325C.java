import java.util.Scanner;
public class N0325C 
{
	public static void main(String[] args)
	{
		long n;
		long d=0;
		long i;
		Scanner sc = new Scanner(System.in);
		n=sc.nextLong();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				d+=i;
			}
			System.out.print(d);
			break;
		}
	}
}
