package testngsamplepkg;

import org.testng.annotations.Test;

public class testcase2 {
	@Test
	public void testcas3() {
		System.out.println("Test case 3");
	}
	@Test(enabled=false)
	public void paymnettestcase1() {
		System.out.println("Test case 3.1");
	}
	@Test(timeOut=4000)
	public void paymenttestcase2() {
		System.out.println("Test case 3.2");
	}
	@Test(groups={"group1"},dependsOnMethods= {"reporttestcase2"})
	public void reporttestcase1() {
		System.out.println("Test case 3.3");
	}
	@Test(groups={"group1"})
	public void reporttestcase2() {
		System.out.println("Test case 3.4");
	}
	@Test
	public void insurancetestcase1() {
		System.out.println("Test case 3.5");
	}

}
