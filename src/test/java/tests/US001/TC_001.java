package tests.US001;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_001 {
    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonURl"));
        Page page = new Page();
        page.aramaKutusu.sendKeys("Iphone", Keys.ENTER);
        Driver.closeDriver();
        //Amazon sayfasina gidildi,arama kutusu test edildi.
        //Erol hoca yeni kodlar ekledi.
    }
}
