package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {
	@Test
	public void clickVehiclesTest() throws InterruptedException {
		homePage.clickVehicles();
	
	}

}
