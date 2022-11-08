package testngsamplepkg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testcase1 {
	
	@BeforeClass
	public void beforeclass1() {
		System.out.println("from method: before class");
	}
	
	@AfterClass
	public void afterclass1() {
		System.out.println("from method: after class");
	}
	
	@BeforeTest
	public void somename() {
		System.out.println("from method: somename");
	}
	
	@BeforeSuite
	public void somename2() {
		System.out.println("from method: before suite");
	}
	
	@BeforeMethod
	public void somename4() {
		System.out.println("from method: before method");
	}
	
	@AfterMethod
	public void somename5() {
		System.out.println("from method: after method");
	}
	
	@AfterSuite
	public void somename3() {
		System.out.println("from method: after suite");
	}
	
	@AfterTest
	public void somename1() {
		System.out.println("from method: After test somename1");
	}
	
	@Test(groups={"group1"})
	public void Mtestcas1() {
		System.out.println("MTest case 1");
	}
	
	@Test(groups={"group1"})
	public void Mtestcas2() {
		System.out.println("MTest case 2");
	}
	
	@Test
	public void Atestcas1() {
		System.out.println("ATest case 1");
	}
	
	@Test
	public void Atestcas2() {
		System.out.println("ATest case 2");
	}
	
	@Test
	public void Btestcas1() {
		System.out.println("BTest case 1");
	}
	
	@Test
	public void Btestcas2() {
		System.out.println("BTest case 2");
	}

}



	

