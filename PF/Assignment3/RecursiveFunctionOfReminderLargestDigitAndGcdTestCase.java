import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class RecursiveFunctionOfReminderLargestDigitAndGcdTestCase {

	RecursiveFunctionOfReminderLargestDigitAndGcd functionOfReminderLargestDigitAndGcd= new RecursiveFunctionOfReminderLargestDigitAndGcd();
	@Test
	public void testRemainder1() {
		int valueExpected=0;
		int valueActual=functionOfReminderLargestDigitAndGcd.Reminder(2, 1);
		assertEquals(valueActual,valueExpected);
	}
	
	@Test
	public void testRemainder2() {
			int valueExpected=0;
			int valueActual=functionOfReminderLargestDigitAndGcd.Reminder(2, 0);
			assertEquals(valueActual,valueExpected);
	}
	
	@Test
	public void testRemainder3() {
		int valueExpected=1;
		int valueActual=functionOfReminderLargestDigitAndGcd.Reminder(100, 3);
		assertEquals(valueActual,valueExpected);
	}
	
	@Test
	public void testGCD1() {
		
		int valueExpected=1;
		int valueActual=functionOfReminderLargestDigitAndGcd.Gcd(2, 1);
		assertEquals(valueActual,valueExpected);
	}
	
	@Test
	public void testGCD2() {
		int valueExpected=6;
		int valueActual=functionOfReminderLargestDigitAndGcd.Gcd(12, 0);
		assertEquals(valueActual,valueExpected);
	}
	
	@Test
	public void testGCD3() {
		int valueExpected=1;
		int valueActual=functionOfReminderLargestDigitAndGcd.Gcd(100, 3);
		assertEquals(valueActual,valueExpected);
	}
	
	@Test
	public void testLargestDigit1() {
		
		int valueExpected=2;
		int valueActual=functionOfReminderLargestDigitAndGcd.LargestDigit(2);
		assertEquals(valueActual,valueExpected);
	}
	
	
	@Test
	public void testLargestDigit2() {
		int valueExpected=9;
		int valueActual=functionOfReminderLargestDigitAndGcd.LargestDigit(1257369);
		assertEquals(valueActual,valueExpected);
	}
	
	


}
