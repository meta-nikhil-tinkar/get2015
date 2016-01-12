import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JunitTestCaseAssignment2 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Assignment2Test() {
	
		 Assignment2 assin2=new Assignment2();
		String[] output=assin2.makePyramind(5,5);
		String[] expectedOutput={"12345",
								" 1234",
								"  123",
								"   12",
								"    1",
								};
		assertArrayEquals(" matched",expectedOutput,output);
	}



}
