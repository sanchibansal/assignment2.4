import java.util.*;			//for importing scanner
class number				//new class number
{
	void num( int x) 		//method num which accepts integer value
{
	if (x==0)
	{
	System.out.println("you have entered zero.");		//prints 0 if entered 0
	}
	if(x>0)								
	{System.out.println("you have entered positive value.");}	//prints positive value if number is greater than 0
	if(x<0)
	{ System.out.println("you have entered negative value.");}	//prints negative value if number is lesser than 0
}
}
class TestDemo
{
	public static void main(String args[])			// main class
{
	int n;
	Scanner g= new Scanner(System.in);			//creates scanner object
	System.out.println("enter any number.");
	n=g.nextInt();						//accepts input from the console(user input)
	number b=new number();					//creates object for the num method in class number
	b.num(n);						//calls num method with the user input number as a parameter
}
}