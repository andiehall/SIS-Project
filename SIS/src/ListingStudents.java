import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ListingStudents {

	public static void listingStudent() throws IOException
	{
		int index = 1;
		
	for(int i=0; i < RunSIS.listOfStudents.size(); i++)
		{
		index++;
		System.out.println(index + ")  " + RunSIS.listOfStudents.get(i).getFirstName() + " " + 
				RunSIS.listOfStudents.get(i).getLastName() + " " +  
				RunSIS.listOfStudents.get(i).getFirstClass()  + " " + 
				RunSIS.listOfStudents.get(i).getFirstGrade() + " " + 
				RunSIS.listOfStudents.get(i).getSecondClass()  + " " + 
				RunSIS.listOfStudents.get(i).getSecondGrade() + " " + 
				RunSIS.listOfStudents.get(i).getThirdClass() + " " + 
				RunSIS.listOfStudents.get(i).getThirdGrade());

		}
	
	}
	
}
