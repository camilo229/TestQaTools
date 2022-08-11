package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://demoqa.com/text-box")
public class QaToolsPage extends PageObject {


    @FindBy(xpath = "//*[@id=\"userName\"]")
    WebElement inputFullName;
    @FindBy(xpath = "//*[@id=\"userEmail\"]")
    WebElement inputEmail;
    @FindBy(xpath = "//*[@id=\"currentAddress\"]")
    WebElement inputCurrentAddres;
    @FindBy(xpath = "//*[@id=\"permanentAddress\"]")
    WebElement inputpermanentAddress;
    @FindBy(xpath = "//*[@id=\"submit\"]")
    WebElement btnSubmit;
    @FindBy(xpath = "//*[@id=\"name\"]")
    WebElement name;
    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement email;
    @FindBy(xpath = "//*[@id=\"currentAddress\"and@class=\"mb-1\"]")
    WebElement currentAddress;
    @FindBy(xpath = "//*[@id=\"permanentAddress\"and@class=\"mb-1\"]")
    WebElement permanentAddress;

    public void formQaTools(String name, String email, String CAddres, String PAddres) {

        inputFullName.sendKeys(name);
        inputEmail.sendKeys(email);
        inputCurrentAddres.sendKeys(CAddres);
        inputpermanentAddress.sendKeys(PAddres);
        btnSubmit.click();

    }


    public String validateName() {
        String vname = name.getText();
        return vname;
    }

    public String validateEmail() {
        String vemail = email.getText();
        return vemail;

    }

    public String validateCurrentAddress() {
        String VVAddress = currentAddress.getText();
        return VVAddress;

    }

    public String validatePermanentAddress() {
        String VPAddress = permanentAddress.getText();
        return VPAddress;
    }


}
