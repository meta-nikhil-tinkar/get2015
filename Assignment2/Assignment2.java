import java.util.Scanner;


public class Assignment2 {

	String spaces(int row, int n)
	{
		String space=new String();
		for(int i=1;i<row;i++)
		{
			space=space+" ";
		}
		return space;
		
	}
	String numbers(int row, int n)
	{
		String number=new String();
		
			for(int j=1;j<=n-row+1;j++)
			{
				number=number+j;
			}
		
		return number;
	}
	String[] makePyramind(int row ,int n)
	{
		String[] combine=new String[row];
		for(int i=0;i<row;i++)
	
		{	combine[i]=new String();
    	combine[i]=spaces(i+1, n)+numbers(i+1, n);
	   }
		
		return combine;
		
		
	}
	
	
	public static void main(String[] args) 
	{    int n,row;
		Assignment2 check=new Assignment2();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		 n=sc.nextInt();
		System.out.println("enter the row");
		 row=sc.nextInt();
		 if(n<=0 || row<=0)
			 {System.out.print("please enter the positive number");
		      sc.close(); 
			  return;
			 }
		String output[]=new String [row];
			output=check.makePyramind(row, n);
		for(int i=0;i<row;i++)
		{    
			System.out.println(output[i]);
				
			
		}
		
		sc.close();
		
		
		
	}

}
