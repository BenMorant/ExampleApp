package pages;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.annotation.PageUrl;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;


//On remarque que FluentLenium fait usage de plus d'annotations que Selenium
@PageUrl("https://monapplication.net/accueil")
//Chaque classe Page Object utilisant FluentLenium étend la classe FluentPage
public class FluentAppHomePage extends FluentPage {

  //Usage simplifié de l'annotation FindBy pour localiser les FluentWebElements
  @FindBy(xpath = "//div[text()='Good afternoon, FluentLenium User!'") FluentWebElement loggedInUserNameText;

  // Definition des actions de l'utilisateur (donc des méthodes) qui peuvent être exécutées
  // sur la page d'accueil de notre application

  // Méthode pour vérifier que le nom de l'utilisateur s'affiche bien suite à la connexion

  public String verifyLoggedInUserNameText(){
    String userName = loggedInUserNameText.text();

    return userName;
  }

}
