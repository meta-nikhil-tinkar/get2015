import java.util.Scanner;


public class AllPermutationsOfString {

	 private String OutputString[];
     private  int count;
	
     /**
      * 	factorial is a function which is used to calculate the factorial of function
 	 * 
 	 *  */

     
     private int factorial(int number)
	{
		if(number<2)
			return 1;
		else
			return number*factorial(number-1);
	}
	
     /**
 	 * UserInputForPrintPermutationOf String is a function which is take the input as a string which we have to calculate the Permutation
 	 * 
 	 *  */

    private String UserInputForPrintPermutationOfString()
     {   String Permutation;
     	 Scanner scanner = new Scanner(System.in);
         System.out.print("Enter the String");
     	 Permutation=scanner.next();
        return Permutation;
    	 
    	 
     }
	
     
	public String[] GeneratePermutations(String Input)
	{   String PrefixString="";
	    count=0;
	    OutputString=new String[factorial(Input.length())];
		RecusiveFunctionForPermutation(PrefixString, Input);
		return OutputString;
		
	}
	
	/**
 	 * RecusiveFunctionForPermutation is a function which is calculate the Permutation of sting in recursive manner
 	 * 	 * 	 */

	private void RecusiveFunctionForPermutation(String PrefixString, String input)
	{
		int length=input.length();
	   if(length==0)
		   OutputString[count++]=PrefixString;
	   else
	     {
		 for(int count=0;count<length;count++)
			 RecusiveFunctionForPermutation(PrefixString+input.charAt(count), input.substring(0,count)+input.substring(count+1,length));
		   
		   
		   
	     }
		
		
		
		
	}
	
	
	
	
	public static void main(String args[])
  {
	  String InputString;
	  
	AllPermutationsOfString allPermutationsOfString=new AllPermutationsOfString();
	
	InputString=allPermutationsOfString.UserInputForPrintPermutationOfString();
	
	allPermutationsOfString.GeneratePermutations(InputString);
	
	for(int PrintString=0;PrintString<allPermutationsOfString.OutputString.length;PrintString++)
	
		System.out.println(allPermutationsOfString.OutputString[PrintString]);
	  
  }
	
}
	
	
	

