import java.util.Scanner;


public class Assignment1 {
	
	
	
	String spaces(int row, int n)
	{
		String space=new String();
		if(row<=n)
		{
		for(int i=n;i>row;i--)
		  {
			space=space+" ";
		  }
		}
		else
		{
			
			for(int i=n;i<row;i++)
			{
				space=space+" ";
			}
		}
		return space;
		
	}
	String numbers(int row, int n)
	{
		String number=new String();
		
			for(int j=1;j<=row;j++)
			{
				number=number+j;
			}
			
			for(int j=row-1;j>=1;j--)
			{
				number=number+j;
			}
		return number;
	}
	String[] makePyramind(int row ,int n)
	{    int count=0;
		String[] combine=new String[n+n-1];
		
		for( count=0;count<row;count++)
		{	combine[count]=new String();
	    	combine[count]=spaces(count+1, n)+numbers(count+1, n);
		    if(count==n)
		    	break;
		}
		
		for(int i=n-1;i>0;i--)
		{  if(n>row)
			 break;
			combine[count++]=spaces(i, n)+numbers(i, n);
			
		}		
		return combine;
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment1 check=new Assignment1();
		//System.out.print(check.spaces(9, 5));
		// System.out.print(check.numbers(5, 5));
		 int n,row;
			
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
	
		for(int i=0;i<(2*n-1);i++)
		{
			System.out.println(output[i]);
				
			
		}
	sc.close();
	}

}
