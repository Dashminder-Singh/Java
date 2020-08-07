import java.util.*;
class fourth
{
	public static void main(String myarray[])
	{
		Scanner obj=new Scanner(System.in);
		Scanner obj2=new Scanner(System.in);
		
		System.out.println("Enter your first name");
		String fname=obj.nextline();
		System.out.println("Enter your last name");
		String lname=obj.nextline();
		System.out.println("Enter M or F");
		String gender=obj.nextline();
		System.out.println("Enter your age");
		int age=obj.nextInt();
		
		if(gender.equalsIgnoreCase("F"))
		{
			if(age>20)
			{
				System.out.println("Are you Married");
				String status=obj2.nextline();
				if(status.equalsIgnoreCase("yes"))
				{
					System.out.println("Welcome Mrs. "+fname+(" ") +lname);
				}
				else if(status.equalsIgnoreCase("no"))
				{
					System.out.println("Welcome Miss. "+fname+(" ") +lname);
				}
			}
			else
			{
				System.out.println("Welcome "+fname+" "+lname);
			}
		}
		else if(gender.equalsIgnoreCase("M"))
		{
			if(age>20)
			{
				System.out.println("Welcome Mr. "+fname+" "+lname);
			}
			else
			{
				System.out.println("Welcome "+fname+" "+lname);
			}
		}
	}
}

		
		