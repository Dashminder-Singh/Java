import java.lang.*;
class second
{
	public static void main(String myarray[])
	{
		int sum=0;
		for(int x=0;x<myarray.length;x++)
		{
			System.out.println(myarray[x]);
			sum=sum+Integer.parseInt(myarray[x]);
		}
			System.out.println("sum of 10 numbers"+sum);
	}
}

	