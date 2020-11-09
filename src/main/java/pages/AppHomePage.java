package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AppHomePage {

  WebDriver driver;

  public AppHomePage(WebDriver driver){
    this.driver=driver;
  }

  //Usage de l'annotation FindBy pour localiser les WebElements

  @FindBy(how=How.XPATH, using="///div[text()='Good afternoon, Selenium User!']") WebElement loggedInUserNameText;


  // Definition des actions de l'utilisateur (donc des méthodes) qui peuvent être exécutées
  // sur la page d'accueil de notre application

  // Méthode pour vérifier que le nom de l'utilisateur s'affiche bien suite à la connexion

  public String verifyLoggedInUserNameText(){
    String userName = loggedInUserNameText.getText();
    return userName;
  }

}