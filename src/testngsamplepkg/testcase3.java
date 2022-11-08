package testngsamplepkg;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testcase3 {
	@Test(groups={"group1"})
	public void testcas4() {
		System.out.println("Test case 4");
	}
	
	@BeforeTest
	public void beforetest3()
	{
		System.out.println("From beforetest3");
	}

}
