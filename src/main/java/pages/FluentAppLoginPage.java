package pages;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.annotation.PageUrl;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

//On remarque que FluentLenium fait usage de plus d'annotations que Selenium
@PageUrl("https://monapplication.net/login")
//Chaque classe Page Object utilisant FluentLenium étend la classe FluentPage
public class FluentAppLoginPage extends FluentPage {

  //Usage simplifié de l'annotation FindBy pour localiser les FluentWebElements
  @FindBy(xpath = "//input[@type='email'][@name='email']") FluentWebElement emailTextBox;
  @FindBy(xpath = "//input[@type='password'][@name='pass']") FluentWebElement passwordTextBox;
  @FindBy(xpath = "//input[@type='submit'][@id='hotpink_button']") FluentWebElement connectButton;

  // Definition des actions de l'utilisateur (donc des méthodes) qui peuvent être exécutées
  // sur la page d'identification de notre application

  // Cette méthode permet de mettre en place l'adresse e-mail dans la textbox email
  private void setEmail(String email){
    emailTextBox.write(email);
  }
  // Cette méthode permet de mettre en place le mot de passe dans la textbox password
  private void setPassword(String password){
    passwordTextBox.write(password);
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