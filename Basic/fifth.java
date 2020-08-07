import java.util.*;
class fifth
{
	public static void main(String myarray[])
	{
		
		int space1=30,space2=23,star=1,star2=15,a=1;
		for( a=1;a<=17;a++)   //middle lines
		{
			if(a<=9)  //rows
			{
				for(int b=1;b<=space1;b++)
				{
					System.out.print(" ");
				}
				for(int c=1;c<=star;c++)
				{
					System.out.print("*");
				}
				star+=2;space1--;
				System.out.println();
			}
			else
			{
				for(int b=1;b<=space2;b++)
				{
					System.out.print(" ");
				}
				for(int c=1;c<=star2;c++)
				{
					System.out.print("*");
				}
				star2-=2;space2++;
				System.out.println();
			}
		}
	}
}

				
		
			
	



	


				
		
				
				
		
	


		
				
			
				
		
	


		
	


			
					
			
			
			
	
	


		
	
		
	


	


	
		 
	


	
		
	


		
	


									
		
	

