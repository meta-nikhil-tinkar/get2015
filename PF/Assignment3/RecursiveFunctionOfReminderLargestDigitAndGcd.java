import java.util.InputMismatchException;
import java.util.Scanner;


public class RecursiveFunctionOfReminderLargestDigitAndGcd {

	

	/**ChoseOneFunction a function which is use to select that by which method we search the element
     * @return It return a value of that function which we chose it. 
     */
	
	int ChoseOneFunction()
	 {   
		 int choseFunction;
		 		
	     System.out.println("what you want to calculate.  press 1 for reminder. press 2 to gcd.  press 3 to Largest digit");
             choseFunction=UserInput();
		 while(choseFunction>3 || choseFunction==0)
		 {	   System.out.println("the number you entered is not correct");
		        choseFunction=UserInput();
		 }
	      	 
		 return choseFunction;
				 
			 
		
	 }
	
	
	/**UserInput is a function which is use take input from user
     * @return It return a number
     */
	
    int UserInput()
   {            int number;
            try
            {
                Scanner sc=new Scanner(System.in);
		
                System.out.println("enter the number");
		       number=sc.nextInt();
                if(number<0)
                 {
                     System.out.println("number can't be negative");
                     number=UserInput();
                
                 }
                return number;
            }
           catch(InputMismatchException e)
            { 
                System.out.println("enter the correct input");
                number=UserInput();
                return number;
            }

      
          }
    /**rem is a function which is use to calculate the reminder of number
     * @param x is divident
     * @param y is divisior
     * @return It return a number
     */
    
	 int Reminder(int FrirstInput, int SecondInput)
	 {
		
		 if(FrirstInput<0)
		 {
		    return FrirstInput+SecondInput;
		 }
		 if(FrirstInput==0)
		 {
			 return FrirstInput;
		 }
		 
		return Reminder(FrirstInput-SecondInput,SecondInput); 
	 }
	
	 
	 /**Gcd is a function which is use to calculate the HCF of two number
	     * @param x is first input
	     * @param y is second input
	     * @return It return a number
	     */
	     
	public int Gcd(int FrirstInput, int SecondInput)
	 {
		if (SecondInput==0)
		return FrirstInput;
	else
		return Gcd(SecondInput,FrirstInput%SecondInput );

		 
	 }
	 
	 /**LargestDigits is a function which is use to calculate the largest digit of number
	     * @param  number is in which we have to find Largest Digit
	     * @return It return Largest Digit
	     */
	    
	 int LargestDigit(int number) 
	 {  
		 if(number<=0)
			 return 0;
		 
		 int max=number%10;
		 number=LargestDigit(number/10);
		 
		 if(max<number)
			 max=number;
		 
         return max;		 
	 }
	

	
	 
	 
	 public static void main(String[] args) 
	    {
	        int FristInput,SecondInput=0,result,ChoseFunction;
	        RecursiveFunctionOfReminderLargestDigitAndGcd largestDigitAndGcd=new RecursiveFunctionOfReminderLargestDigitAndGcd();
	        
	        ChoseFunction=largestDigitAndGcd.ChoseOneFunction();
	        FristInput=largestDigitAndGcd.UserInput();
	       
	        if(ChoseFunction==1)
	            {
	        	
	        	     SecondInput=largestDigitAndGcd.UserInput();
                         
                          while(SecondInput==0)
                          {    System.out.println("divider should be greter than zero");
                              SecondInput=largestDigitAndGcd.UserInput();
                          
                          }
                          result=largestDigitAndGcd.Reminder(FristInput, SecondInput);
                          System.out.println("Reminder of a number is");
	        	  
	           }
	         else if(ChoseFunction==2)
	           {
	        	    SecondInput=largestDigitAndGcd.UserInput();
	        	  result=largestDigitAndGcd.Gcd(FristInput, SecondInput);
                   System.out.println("Gcd of a number is");
	        	  
	           } 
	         else
	         {	        	 
		        	  result=largestDigitAndGcd.LargestDigit(FristInput);
		        	  System.out.println("Largest Digits of number is");
		           
	        	 
	         }
	        
	        
	        
	        System.out.println(result);
	      }
	    
}
