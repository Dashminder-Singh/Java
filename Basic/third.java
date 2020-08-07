import java.util.*;
class third
{
	public static void main(String myarray[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter percentage");
		double scholarship=0,percentage,fees;
		percentage=obj.nextInt();
		System.out.println("enter fees");
		fees=obj.nextInt();
	
		if(percentage>90)
		{
			scholarship=(60.0/100.0)*fees;
			System.out.println("excellent work");
		}
		else if(percentage>75)
		{
			scholarship=(35.0*fees)/100.0;
			System.out.println("good work");
		}
		else if(percentage>60)
		{
			scholarship=0;
			System.out.println("avarage work");
		}
		else
			{
				System.out.println("work hard");
			}
				
				System.out.println("scholarship"+scholarship);
			}
		}	
	
	
		