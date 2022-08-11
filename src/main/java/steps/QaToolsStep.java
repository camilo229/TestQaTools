package steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import pages.QaToolsPage;

public class QaToolsStep {
    QaToolsPage page;

    @Step
    public void openQaToolsPage() {
        page.open();

    }

    @Step
    public void completeForm(String name, String email, String CAddres, String PAddres) {
        page.formQaTools(name, email, CAddres, PAddres);
    }

    @Step
    public void validateEmail(String name, String email, String CAddres, String PAddres) {

        Assert.assertEquals(page.validateName(), "Name:" + name);
        Assert.assertEquals(page.validateEmail(), "Email:" + email);
        Assert.assertEquals(page.validateCurrentAddress(), "Current Address :" + CAddres);
        Assert.assertEquals(page.validatePermanentAddress(), "Permananet Address :" + PAddres);

    }
}
