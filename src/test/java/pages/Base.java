package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public abstract class Base {

    protected Base(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
