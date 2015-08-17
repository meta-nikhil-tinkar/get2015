package surveyApplication;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Questions {

	public static String location="C:/Users/Nikhil/Desktop/questions.csv";
	
	public static List<String> question=new ArrayList<String>();
	
	public static String line="";
	
	public String SingleChoice()
	{  
		String SingleChoice=question.get(0);
		
		return SingleChoice;
		
	}
	
	
	public String MultipleChoice()
	{
		String MultipleChoice=question.get(1);
		
		return MultipleChoice;
		
	}
	

	public String FeedBack()
	{
		String FeedBack=question.get(2);
		
		return FeedBack;
		
	}
	

	public static List<String> readQuestions()
	{

		try
		{
			//Reading the questions stored in the csv file
			BufferedReader br=new BufferedReader(new FileReader(location));
			while((line=br.readLine())!=null)
			{
				String[] token=line.split(",");
				//Questions are added in the list of string type
				question.add(token[0]+" "+token[1]);
			}
			br.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);

		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		return question;


	}

   public static void main(String args[])
{
  Questions questions=new Questions();
 
  System.out.print(questions.SingleChoice());
  System.out.print(questions.MultipleChoice());
  System.out.print(questions.FeedBack());
  

}

}
