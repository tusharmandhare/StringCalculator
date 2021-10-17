package stringCalculator;



import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.platform.commons.annotation.Testable;


public class Testcalculator {
	//private Calculate cal;
	
		Calculate cal=new Calculate();
	
  //Test for checking emptyString
	@Test
	public void emptyString() throws Exception
	{
	
	  assertEquals(cal.add(""), 0);
	}
	
	//Test for single value as input
	@Test
 	public void singleValueAsInput() throws Exception
 	{
 		assertEquals(cal.add("1"), 1);
 	}
	
	//Test for sum of two numbers
	@Test
	public void twoNumbersSumWithDelimeter() throws Exception
	{
		assertEquals(cal.add("1,2"), 3);
	}
	//Test for Newline Delimiter
	@Test
	public void twoNumbersSumWithNewlineDelimeter() throws Exception
	{
		assertEquals(cal.add("1\n2"), 3);
	}
	
	//Test for Three numbers
	@Test
	public void threeNumbersSumWithBothDelimeter() throws Exception {
		assertEquals(cal.add("1,2,3"), 6);
	}
	
	//test for More than two numbers having default delimiters
	@Test
	public void multipleNumbersSumWithBothDelimeter() throws Exception {
		assertEquals(cal.add("1,2,3\n4,5"), 15);
	}
	
	//Test for sum with multiple delimiters other than default
	@Test
	public void sumWithMultipleDelimeters() throws Exception
	{
		assertEquals(cal.getSum("1,2\n3,,**4.5;6"),21);
	}
	//Test for negative number return exception
	@Test
	public void negativeInputReturnsException() throws Exception
	{
		cal.add("-1");
		
	}
	
	//check sum greater than 1000 and ignore it
	@Test
	public void ignoreNumbersGreaterThan1000() throws Exception
	{
		assertEquals(cal.add("10,10,1001"), 20);
	}
	
	
}