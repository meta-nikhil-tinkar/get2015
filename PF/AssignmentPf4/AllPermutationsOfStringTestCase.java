import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class AllPermutationsOfStringTestCase {


       @Test
		public void testPermutaion1() {
			AllPermutationsOfString permutationsOfString= new AllPermutationsOfString();
			String[] actual=permutationsOfString.GeneratePermutations("ABC");
			String[] expected={"ABC","ACB","BAC","BCA","CAB","CBA"};
			assertArrayEquals(actual,expected);
		}
		
		@Test
		public void testPermutaion2() {
			AllPermutationsOfString permutationsOfString= new AllPermutationsOfString();
		    String[] actual=permutationsOfString.GeneratePermutations("ABCD");
			String[] expected={"ABCD","ABDC","ACBD","ACDB","ADBC","ADCB","BACD","BADC","BCAD","BCDA","BDAC","BDCA","CABD","CADB","CBAD","CBDA","CDAB","CDBA","DABC","DACB","DBAC","DBCA","DCAB","DCBA"};
			assertArrayEquals(actual,expected);
		}


	}



