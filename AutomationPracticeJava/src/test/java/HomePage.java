import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    static TestData testData = new TestData();
    static Locators locators = new Locators();

    public HomePage(WebDriver driver){
        super(driver);
    }

    public static void signIn(){
        click(locators.SIGN_IN_BUTTON);
        isVisible(locators.SIGN_IN_INPUT_EMAIL);

    }
}
