package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class OpenAccountPage {

    @FindBy(xpath = "//*[@id=\"username\"]")
    WebElement username;

    @FindBy(xpath = "/html/body/div/div/div/div/fieldset/form/div[2]/input")
    WebElement password;

    @FindBy(xpath = "/html/body/div/div/div/div/fieldset/form/div[3]/button")
    WebElement btnSubmit;


    public void clickSignInUsername(String username,String password){
        this.username.clear();
        this.username.sendKeys(username);
        this.password.clear();
        this.password.sendKeys(password);
    }

    public void clickButtonSubmit(){
        btnSubmit.click();
    }





}
