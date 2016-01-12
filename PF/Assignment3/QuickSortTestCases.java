import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class QuickSortTestCases {

	QuickSortSorting quickSortSorting=new QuickSortSorting();
	@Test
	public void testQuickSort() {
		int[] array={2,5,8,9,10, 77, 55, 11};
		int[] arrayExpected={2,5,8,9,10,11,55,77};
		quickSortSorting.QuickSort(array, 0, array.length-1);
		assertArrayEquals(arrayExpected, array);
	}
	@Test
	public void testQuickSort2() {
		int[] array={};
		int[] arrayExpected={};
		quickSortSorting.QuickSort(array, 0, array.length-1);
			assertArrayEquals(arrayExpected, array);
	}
	@Test
	public void test() {
		
	}

}
