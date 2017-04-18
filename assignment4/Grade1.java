import java.util.*;			//for importing scanner
class Grade1					//creating class Grade1
{
	public static void main(String args[])		//main method
	{
		Scanner g = new Scanner(System.in);		//creates scanner object
		System.out.println("enter marks=");		
		int marks=g.nextInt();				//assigning value to marks from console(user input)
		System.out.println("enter age=");
		int age=g.nextInt();				//assigning value to age from console(user input)
		if(age>=15)					
		{
			if(marks>=70)
			{System.out.println(" Grade A");}	//prints grade a if marks are greater than or equal to 70 and age is greater than or equal to 15
			else if(marks>=61 && marks<70)
			{ System.out.println(" Grade B");}	//prints grade b if marks are between 61 and 70  and age is greater than or equal to 15
			else
			{System.out.println("Grade C");}	//prints grade c if marks are less than 61 and age is greater than or equal to 15
		}
		if(age<15)
		{
			if(marks>=60)
			{System.out.println("Grade A");}	//prints grade a if marks are greater than or equal to 60 and age is smaller than 15
			else if(marks>=45 && marks<60)
			{ System.out.println(" Grade B");}	//prints grade b if marks are between 45 and 60  and age is smaller than 15
			else
			{System.out.println("Grade C");}	//prints grade c if marks are less than 45 and age is smaller than 15
		}
	}
}