import java.util.Scanner;
public class N0349B
{
	public static void main(String[] args)
	{
		int a,b;
		int d=0;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		for(int i=a;i<b;i++)
			if(i%2==1)
			{
				d+=i;
			}
			System.out.print(d);
	}
}
