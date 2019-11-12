package practiceProject;

import java.util.Arrays;

class Triangle
{
	// Field properties
	
	double [] sideArray = new double [3];
	String rightClass, sideClass;
	
	public Triangle()
	{System.out.println("Created a triangle Object");}
	
	// General function used in static main
	
	public void classifyDoubles (double [] doubleArray)
	{
		boolean validity;
			
		// Sort to allow for the user to enter input in any possible combination
		
		Arrays.sort(doubleArray);
		
		// Copy double array to object's field array
		
		this.sideArray = doubleArray.clone();
		
		validity = checkValidity();
		
//		if(validity == false)
//		{
//			System.out.println("Triangle is not valid - System terminating");
////			System.exit(1);
//		}
		if (validity == true)
		{
			// Pass back into Triangle's methods to classify the type of Triangle it is
			
			this.isRightTriangle();
			this.sideClassification();
			
			System.out.println("Triangle is a " + this.rightClass + this.sideClass + " triangle");
			System.out.println("Area of the triangle : " + getArea());
		}
		
	}
	
	// Same function as above, but used if we already have the double Array sorted and saved in the object
	
	public void classifyDoubles ()
	{
		boolean validity;
		
		validity = checkValidity();
		
//		if(validity == false)
//		{
//			System.out.println("Triangle is not valid - System terminating");
////			System.exit(1);
//		}
		
		// Pass back into Triangle's methods to classify the type of Triangle it is
			this.isRightTriangle();
			this.sideClassification();
			
			System.out.println("Triangle is a " + this.rightClass + this.sideClass + " triangle");
			System.out.println("Area of the triangle : " + getArea());
		
	}
	
	/* Helper functions within the class */
	
	// Determines whether or not the triangle is a right triangle
	
	protected void isRightTriangle()
	{
		if (Math.abs(Math.pow(this.sideArray[0], 2) + Math.pow(this.sideArray[1], 2) - Math.pow(this.sideArray[2], 2)) < 0.01)
		{this.rightClass = "Right ";}
		else
		{this.rightClass = "";}
	}
	
	// Gives the classification of the triangle
	
	protected void sideClassification()
	{
		if (this.sideArray[0] == this.sideArray[1] && this.sideArray[1] == this.sideArray[2])
			this.sideClass = "Equilateral";
		
		else if (this.sideArray[0] == this.sideArray[1] || this.sideArray[1] == this.sideArray[2])
			this.sideClass = "Isoceles";
		
		else
			this.sideClass = "Scalene";
	}
	
	// Checks validity of the Triangle
	
	protected boolean checkValidity ()
	{
		if (this.sideArray[0] + this.sideArray[1] <= this.sideArray[2])
			{return false;}
		else
			{return true;}
	}
	
	// Gives us the area of the Triangle - equation from Assignment 2 PDF
	
	protected double getArea ()
	{
		double semiPerimeter;
		
		semiPerimeter = (this.sideArray[0] + this.sideArray[1] + this.sideArray[2]) / 2;
		
		return Math.sqrt(semiPerimeter*(semiPerimeter-this.sideArray[0])*(semiPerimeter-this.sideArray[1])*(semiPerimeter-this.sideArray[2]));
	}
	
}
