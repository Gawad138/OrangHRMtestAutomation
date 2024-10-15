package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIM extends PageBase {

    public PIM(WebDriver driver){
        super(driver);
    }
    private By ADDButton = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");

}
