package tests.petCity;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Home extends BaseTest {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.petCity.Home.open();
        pages.petCity.Home.closeCookiesPopUp();
    }
    @Test
    public void testSearchBoxWithInvalidData(){
        String testData = "tokioNera";
        String expectedMessage ="Negalime rasti prekių atitinkančių jūsų pasirinkimą.";
        String actualMessage;

        pages.petCity.Home.enterInvalidProduct(testData);
        pages.petCity.Home.clickSearchButton();
        actualMessage = pages.petCity.Home.readMessage();

        Assert.assertEquals(actualMessage, expectedMessage);

    }
}