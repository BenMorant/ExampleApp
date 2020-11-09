package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AppLoginPage {

  WebDriver driver;

  public AppLoginPage(WebDriver driver){
    this.driver=driver;
  }

  //Usage de l'annotation FindBy pour localiser les WebElements
  @FindBy(how=How.XPATH, using="//input[@type='email'][@name='email']") WebElement emailTextBox;
  @FindBy(how=How.XPATH, using="//input[@type='password'][@name='pass']") WebElement passwordTextBox;
  @FindBy(how=How.XPATH, using="//input[@type='submit'][@id='hotpink_button']") WebElement connectButton;

  // Definition des actions de l'utilisateur (donc des méthodes) qui peuvent être exécutées
  // sur la page d'identification de notre application

  // Cette méthode permet de mettre en place l'adresse e-mail dans la textbox email
  private void setEmail(String email){
    emailTextBox.sendKeys(email);
  }
  // Cette méthode permet de mettre en place le mot de passe dans la textbox password
  private void setPassword(String password){
    passwordTextBox.sendKeys(password);
  }
  //Cette méthode permet de cliquer sur le bouton "connecter"
  private void clickOnLoginButton(){
    connectButton.click();
  }

  //méthode CONNECT qui permet de se connecter
  public void connect(String email, String password) {
    setEmail(email);
    setPassword(password);
    clickOnLoginButton();
  }

}