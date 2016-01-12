import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TowerOfHanoiTestCase {
TowerOfHanoi towerOfHonoi=new TowerOfHanoi();

	@Test
	public void testTowerOfHanoi1() {
		List<String> output= new ArrayList<String>();
		
		output=towerOfHonoi.CalculatedToweOfHanoi(1,"A","B","C");
	
		String[] actualList=output.toArray(new String[output.size()]);
		String[] expectedList={"Move Disk 1 A to C"};
		assertArrayEquals(expectedList,actualList);
	}  

	@Test
	public void testTowerOfHanoi2() {
		List<String> output= new ArrayList<String>();
		
		output=towerOfHonoi.CalculatedToweOfHanoi(3,"A","B","C");
		String[] actualList=output.toArray(new String[output.size()]);
		System.out.print(actualList[0]);
		String[] expectedList={"Move Disk 1 A to C",
                               "Move Disk 2 A to B",
                               "Move Disk 1 C to B",
                              "Move Disk 3 A to C",
                              "Move Disk 1 B to A",
                              "Move Disk 2 B to C",
                              "Move Disk 1 A to C"};
		assertArrayEquals(expectedList,actualList);
	}


	

}
