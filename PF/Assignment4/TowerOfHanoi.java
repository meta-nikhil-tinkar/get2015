import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class TowerOfHanoi {
	List<String> OutputString = new ArrayList();

	   /**
	 	 * UserInputForNumberOfDiskf is a function which is take the input as Number of disk  which we have to shifted in another tower
	 	 * 
	 	 *  */
	
     int UserInputForNumberOfDisk() {
 		int NumberOfDisk;
 		try {
 			Scanner scanner = new Scanner(System.in);

 			System.out.println("Enter the Number of Disk");
 			NumberOfDisk = scanner.nextInt();
 			if (NumberOfDisk <= 0) {
 				System.out.println("Disk can't be negative and zero");
 				NumberOfDisk = UserInputForNumberOfDisk();

 			}
 			return NumberOfDisk;
 		} catch (InputMismatchException e) {
 			System.out.println("enter the correct input");
 			NumberOfDisk = UserInputForNumberOfDisk();
 			return NumberOfDisk;
 		}

 	}
     /**
	 	 * UserInputForTowerName String is a function which is take the input as a string to assign name to tower
	 	 * 
	 	 *  */

     String UserInputForTowerName()
     {   String TowerName;
     	 Scanner scanner = new Scanner(System.in);
         TowerName=scanner.next();
        return TowerName;
    	 
    	 
     }
     
     /**
	 	 * CalculatedToweOfHanoi is a function which is calculated the solution of tower of hanoi problem
	 	 * 
	 	 *  */
public List<String> CalculatedToweOfHanoi(int NumberOfDisk,String Source,String intermediate,String Destination)
	{
	    if(NumberOfDisk==1)
	    {	
	    	OutputString.add("Move Disk "+NumberOfDisk+" "+Source+" to "+Destination);
	    }
	    	else
	    	
	    {	CalculatedToweOfHanoi(NumberOfDisk-1, Source, Destination,intermediate);
	        OutputString.add("Move Disk "+NumberOfDisk+" "+Source+" to "+Destination);
	        CalculatedToweOfHanoi(NumberOfDisk-1,intermediate,Source , Destination);  
	    }	
		return OutputString;
		
	}





	public static void main(String args[])
	  {  int NumberOfDisk;
	  
	     String SourceTower,IntermediateTower,DestinationTower;
	     
		TowerOfHanoi towerOfHanoi=new TowerOfHanoi();
		
	    NumberOfDisk=towerOfHanoi.UserInputForNumberOfDisk();
	    
	    System.out.println("enter the name of Source Tower");
	    SourceTower=towerOfHanoi.UserInputForTowerName();
	   
	     System.out.println("enter the name of Intermediate Tower");
		 IntermediateTower=towerOfHanoi.UserInputForTowerName();
	    
		 System.out.println("enter the name of Destination Tower");
		  DestinationTower=towerOfHanoi.UserInputForTowerName();
		  
		 towerOfHanoi.CalculatedToweOfHanoi(NumberOfDisk,SourceTower,IntermediateTower,DestinationTower);
		
		 for(String Output:towerOfHanoi.OutputString )
			System.out.println(Output);
		
		
		
		
	  }
	
	
}
