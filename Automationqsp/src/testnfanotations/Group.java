package testnfanotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Group {
	@Test(groups = "FUNCTIONAL")
	public void ft1() {
		Reporter.log("FT1 test case",true);
	}
	@Test(groups = "SMOKE")
	public void st1() {
		Reporter.log("ST1 test case",true);
	}
	@Test(groups = "INTIGRATION")
	public void it1() {
		Reporter.log("IT1 test case",true);
	}
	@Test(groups = "SMOKE")
	public void st2() {
		Reporter.log("ST2 test case",true);
	}
	@Test(groups = "FUNCTIONAL")
	public void ft2() {
		Reporter.log("FT2 test case",true);
	}
	@Test(groups = "INTIGRATION")
	public void it2() {
		Reporter.log("IT2 test case",true);
	}
	@Test(groups = "SMOKE")
	public void st3() {
		Reporter.log("ST3 test case",true);
	}
	@Test(groups = "FUNCTIONAL")
	public void ft3() {
		Reporter.log("FT3 test case",true);
	}
	@Test(groups = "INTIGRATION")
	public void it3() {
		Reporter.log("IT3 test case",true);
	}
	@Test(groups = "SMOKE")
	public void st4() {
		Reporter.log("ST4 test case",true);
	}
	@Test(groups = "FUNCTIONAL")
	public void ft4() {
		Reporter.log("FT4 test case",true);
	}
	@Test(groups = "INTIGRATION")
	public void it4() {
		Reporter.log("IT4 test case",true);
	}
	@Test(groups = "SMOKE")
	public void st5() {
		Reporter.log("ST5 test case",true);
	}
	@Test(groups = "FUNCTIONAL")
	public void ft5() {
		Reporter.log("FT5 test case",true);
	}
	@Test(groups = "INTIGRATION")
	public void it5() {
		Reporter.log("IT5 test case",true);
	}
	@Test(groups = "SMOKE")
	public void st6() {
		Reporter.log("ST6 test case",true);
	}
	@Test(groups = "FUNCTIONAL")
	public void ft6() {
		Reporter.log("FT6 test case",true);
	}
	@Test(groups = "INTIGRATION")
	public void it6() {
		Reporter.log("IT6 test case",true);
	}
}
