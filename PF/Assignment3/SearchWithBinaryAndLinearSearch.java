import java.util.InputMismatchException;
import java.util.Scanner;


public class SearchWithBinaryAndLinearSearch {

	/**ChoseOneFunction a function which is use to select that by which method we search the element
     * @return It return a value of that function which we chose it. 
     */
	 int ChoseOneFunction()
	 {   
		 int choseFunction;
		 		
	     System.out.println("we have two searching algorithm.  press 1 for Linear Search. press 2 to Binary Search.");
              System.out.println("enter the key");
             choseFunction=UserInput();
             
		 while(choseFunction>2 || choseFunction<=0)
		 {	   System.out.println("you are press a wrong number");
		      choseFunction=UserInput();
		 }
	      	 
		 return choseFunction;
				
	 }
	 
	 /**UserInput is a function which is use to calculate the length of an array
      * @return It return a length of an array 
      */
	  int UserInput()
	   {            int length;
	            try
	            {
	                Scanner sc=new Scanner(System.in);
			
	               
			       length=sc.nextInt();
	                if(length<0)
	                 {
	                     System.out.println("length can't be negative");
	                     length=UserInput();
	                
	                 }
	                return length;
	            }
	           catch(InputMismatchException e)
	            { 
	                System.out.println("enter the correct input");
	                length=UserInput();
	                return length;
	            }

	      
	          }
	  /**UserInputInArray is a function which is use to insert the element in array
	   * @param length it take length of array
       * @return It return a length of an array 
       */
	  int[] UserInputInArray(int length)
      {  
          
          int input[]=new int[length];
	
        try
        {
            Scanner sc=new Scanner(System.in);
	
          
           
	  for(int i=0;i<length;i++)
	     input[i]=sc.nextInt();  
         return input;
          }
        catch(InputMismatchException e)
                    { 
                        System.out.println("enter the correct input");
                        input=UserInputInArray(length);
                       return input;
                    }



        }
	  /**  BinarySearch is a function which is use to find the element in array with binary search algorithm
       * @param SearchArray it is array in which we have to search the element
       *@param SearchElement it is number  which we want in array
       * @return It return a length of an array 
       */
	
	  
	int BinarySearch(int SearchArray[],int SearchElement,int StartIndex,int LastIndex )
	{ 
		int  MidIndex=(StartIndex+LastIndex)/2;
	    
		if(StartIndex>LastIndex)
	    		return -1;
		
		if(SearchArray[MidIndex]==SearchElement)
	        return MidIndex;     
		
		else if(SearchArray[MidIndex]<SearchElement)
	        return BinarySearch(SearchArray, SearchElement,MidIndex+1, LastIndex);
	    
		  else			
	    	 return BinarySearch(SearchArray, SearchElement,StartIndex,MidIndex-1);
			
	
	}
	
	 /**  LinearSearch is a function which is use to find the element in array with Linear search  algorithm
     * @param SearchArray it is array in which we have to search the element
     *@param SearchElement it is number  which we want in array
     * @return It return a length of an array 
     */
	
	int LinearSearch(int SearchArray[],int SearchElement,int StartIndex, int LastIndex)
	{ 
		if(StartIndex>LastIndex)
		   return -1;
		if(SearchArray[StartIndex]==SearchElement)
			return StartIndex;
		
	  return LinearSearch(SearchArray, SearchElement, StartIndex+1, LastIndex);
				
	}
 
	
	public static void main(String[] args) 
	    {  
		   int ChoseFunction,OutputIndex;
	       
	       SearchWithBinaryAndLinearSearch binaryAndLinearSearch=new SearchWithBinaryAndLinearSearch();
	      
	        ChoseFunction= binaryAndLinearSearch.ChoseOneFunction();
	        
	      
	         System.out.println("enter the length of array");
	        int Length=binaryAndLinearSearch.UserInput();
                
	        System.out.println("enter the input in array");
	        int Input[]=binaryAndLinearSearch.UserInputInArray(Length);
	        
	         System.out.println("enter the search element");
                int SearchElement=binaryAndLinearSearch.UserInput();
	       
	       if(ChoseFunction==1)  
	    	   OutputIndex=binaryAndLinearSearch.LinearSearch(Input, SearchElement,0,Input.length-1);
	    
	       else
	    	   OutputIndex=binaryAndLinearSearch.BinarySearch(Input, SearchElement, 0, Input.length-1);
	       
	       if(OutputIndex<0)  // check that array contain that element or not 
               { System.out.print("Array doesn't contain the input element");
                 return;}
	           
	       System.out.print(Input[OutputIndex]);
	       
	    }
	
}
