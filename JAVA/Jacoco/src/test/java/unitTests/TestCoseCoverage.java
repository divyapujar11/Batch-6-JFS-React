package unitTests;

import org.testng.annotations.Test;

import compare.compareString;

public class TestCoseCoverage {
	
	@Test
	public void positiveTest() {
		compareString obj1 = new compareString();
		obj1.containsOrnot("Selenium is Test Automation");
	}

}
