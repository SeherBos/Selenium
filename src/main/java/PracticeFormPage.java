import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeFormPage {

        private WebDriver driver;
        private By name = By.id("firstName");
        private By lastName = By.id("lastName");
        private By email = By.id("userEmail");

        public PracticeFormPage (WebDriver driver){
                this.driver= driver;
        }

        public void setName(String nameInput){
                WebElement nameHolder = driver.findElement(name);
                nameHolder.click();
                nameHolder.sendKeys(nameInput);


        }
        public void setLastName(String lastNameInput){
                WebElement lastNameHolder = driver.findElement(lastName);
                lastNameHolder.click();
                lastNameHolder.sendKeys(lastNameInput);

        }
        public void setEmail(String emailInput){
                WebElement emailHolder = driver.findElement(email);
                emailHolder.click();
                emailHolder.sendKeys(emailInput);
        }







}
