package practiceProject;

import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

/* Helper Classes  in separate files */

public class obscureTrianglev2 
{
	Point [] pointArray = new Point[3];
	
	// Constructors for JUnit testcases
	
	public obscureTrianglev2() {}	
	
	/*Helper Functions */
	
	// Converts the input String Array to an array of 3 Points
	
	public Point [] stringToPointArray (String [] stringIn)
	{
		// Holder variable for parsing the ordered pairs
		
		String [] temp = new String [2];	
		Point [] pointArray = new Point[3];

		double xCoord, yCoord;
		
		for (int i = 0; i < stringIn.length; i++)
			{
				stringIn[i] = stringIn[i].replaceAll("[()]", "");
				temp = stringIn[i].split(",");
				
					xCoord = Double.parseDouble(temp[0]);
					yCoord = Double.parseDouble(temp[1]);
					pointArray[i] = new Point(xCoord, yCoord);
//				catch (Exception e)
//				{
//					System.out.println("Incorrect data type entered. Please enter in a positive integer or Double value in the following manner (x,y) where x and y"
//							+ " are the integers/Doubles. System terminating");
//					System.exit(1);
//				}
//				
			}
		
		System.out.println("<-------- Above this line three points were constructed ----------->");
		
		return pointArray;
	}
	
	public void triangleOption(char charIn, String [] stringArray) throws InputException
	{
		if (charIn == 'P')
		{
			this.pointArray = this.stringToPointArray(stringArray);
			this.pointArray[0].euclidDistSquare(this.pointArray);
		}
		
		else if (charIn == 'S')
		{
			double [] tempHolderArray = new double[3];
			for (int i = 0; i < 3; i++)
			{
				tempHolderArray[i] = Double.parseDouble(stringArray[i]);
				if (tempHolderArray[i] < 0)
					System.out.println("Negative value");
			}
			Triangle newTriangle = new Triangle();
			newTriangle.classifyDoubles(tempHolderArray);
		}
	}
	
	public static void main (String [] args)
	{
//		Scanner scanIn = new Scanner(System.in);
//		
//		obscureTrianglev2 triangleGod = new obscureTrianglev2();
//		
//		System.out.println("Please pick between entering side lengths or the three points of a triangle - Use S for side lengths and P for points");
//		
//		char typeInput = scanIn.next().charAt(0);
//		
//		if (typeInput == 'P')
//		{
//			String [] orderedPairArray = new String [3];
//			
//			System.out.println("Please enter your points in this format (8,9) three times and press enter for each unique pair");
//			System.out.println("Please note that if you have a 4 digit number (or larger) print it WITHOUT commas -> 1000");
//			
//			for (int i = 0; i < 3 ; i++)
//				orderedPairArray[i] = scanIn.next();
//			
//			scanIn.close();
//			
//			triangleGod.pointArray = triangleGod.stringToPointArray(orderedPairArray);
//						
//			triangleGod.pointArray[0].euclidDistSquare(triangleGod.pointArray);
//			
//			
//		}
//		
//		else if (typeInput == 'S')
//		{	
//			
//			System.out.println("Please enter your side lengths three times and press enter for each side.");
//			double [] tempHolderArray = new double [3];
//			
//			// Try and catch block for input errors
//			try {
//			
//			for (int i = 0; i < 3; i++)
//				{
//					tempHolderArray[i] = Double.parseDouble(scanIn.next());
//					
//					if (tempHolderArray[i] < 0)
//						throw new InputException ("Incorrect side length entered, please enter a positive integer or Double value - System terminated.");
//				}
//			}
//			
//			catch (InputException e)
//			{
//				System.out.println(e.getMessage());
//				System.exit(1);
//			}
//			catch (Exception e)
//			{
//				System.out.println("Unknown error caught - System terminating");
//				System.exit(1);
//			}
//			
//			scanIn.close();
//			
//			Triangle newTriangle = new Triangle();
//			
//			newTriangle.classifyDoubles(tempHolderArray);
//			
//		}
//		
//		else
//		{
//			System.out.println("Incorrect input - exitting program");
//			scanIn.close();
//			System.exit(0);
//		}
//		
	}
	
}