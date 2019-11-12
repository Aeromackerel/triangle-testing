package triangleTest.testing;
import practiceProject.obscureTrianglev2;
import practiceProject.InputException;
import practiceProject.Point;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TrianglesTest 
{
	@Test
	public void testTriangle() throws InputException
	{
		// Point Test 
		obscureTrianglev2 triangleGod = new obscureTrianglev2();
		String [] stringOfPoints = {"(3,0)", "(0,4)", "(0,0)"};
		triangleGod.stringToPointArray(stringOfPoints);
		triangleGod.triangleOption('P', stringOfPoints);
		
		// Sides Test with doubles 
		obscureTrianglev2 triangleGodTwo = new obscureTrianglev2();
		String [] stringOfPointsTwo = {"4.3", "7.5", "9.5"};
		triangleGodTwo.triangleOption('S', stringOfPointsTwo);
		
		// Point Test with negatives
		obscureTrianglev2 triangleGodThree = new obscureTrianglev2();
		String [] stringOfPointsThree = {"(4,-2)", "(0,-7)", "(-5,0)"};
		triangleGodThree.triangleOption('P', stringOfPointsThree);
		
		// Point Test 2 with negatives
		obscureTrianglev2 triangleGodFour = new obscureTrianglev2();
		String [] stringOfPointsFour = {"(-5.9,-6.9)", "(-1.45, -3.95)", "(-29.34, -2.19)"};
		triangleGodFour.triangleOption('P', stringOfPointsFour);
		
		// Sides Test with negatives - exception, but conflicts with Jacoco, so no exception in package
		obscureTrianglev2 triangleGodFive = new obscureTrianglev2();
		String [] stringOfSides = {"-4", "-9", "-10"};
		triangleGodFive.triangleOption('S', stringOfSides);
		
		// Test with Equilateral Triangle
		obscureTrianglev2 triangleGodEquilateral = new obscureTrianglev2();
		String [] stringOfSides_Equilateral = {"5", "5", "5"};
		triangleGod.triangleOption('S', stringOfSides_Equilateral);
				
		// Test with Isoceles Triangle
		obscureTrianglev2 triangleGodTwoIsoceles = new obscureTrianglev2();
		String [] stringOfSides_Isoceles = {"4","4", "6"};
		triangleGod.triangleOption('S', stringOfSides_Isoceles);
				
		// Test with invalid Triangle
		obscureTrianglev2 falseTriangleGod = new obscureTrianglev2();
		String [] stringOfSides_Invalid = {"0", "532526322", "0"};
		triangleGod.triangleOption('S', stringOfSides_Invalid);
	}
	
	@Test
	public void testTriangleTwo() throws InputException
	{
		obscureTrianglev2 triangleGod = new obscureTrianglev2();
		String [] StringOfSides_Iso = {"4", "4","5"};
		String [] StringOfSides_IsoTwo = {"3", "3", "89"};
		triangleGod.triangleOption('S', StringOfSides_Iso);
		triangleGod.triangleOption('S', StringOfSides_IsoTwo);
	}
	

}
