package practiceProject;

import java.util.Arrays;

public class Point extends Triangle{
	
	// Field variables
	
	double x,y;
	
	// Constructors - Default and overloaded
	
	public Point () {}
	public Point (double xIn, double yIn) {x = xIn; y = yIn;}
	
	// Helper method to convert points to doubles -> Triangle
	
	public void euclidDistSquare(Point [] pointArrayIn)
	{
		 this.sideArray[0] = Math.sqrt(Math.pow((pointArrayIn[0].x - pointArrayIn[1].x),2) + Math.pow((pointArrayIn[0].y - pointArrayIn[1].y),2));
		 this.sideArray[1] = Math.sqrt(Math.pow((pointArrayIn[0].x - pointArrayIn[2].x),2) + Math.pow((pointArrayIn[0].y - pointArrayIn[2].y),2));
		 this.sideArray[2] = Math.sqrt(Math.pow((pointArrayIn[1].x - pointArrayIn[2].x),2) + Math.pow((pointArrayIn[1].y - pointArrayIn[2].y),2));
		 
		 // Sort to ensure that the user can enter points in any order
		 
		 Arrays.sort(this.sideArray);
		 
		 System.out.println("The following side lengths are : ");
		 
		 for (double side : this.sideArray)
			 System.out.println(side);
		 	 
		 // Calls triangle's method since we already stored sorted double array into Triangle object
		 
		 this.classifyDoubles();
	}
	

	
}
