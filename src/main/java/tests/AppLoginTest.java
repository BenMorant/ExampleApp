package tests;

import static org.assertj.core.api.Assertions.assertThat;

import org.fluentlenium.core.annotation.Page;
import org.junit.Test;
import pages.FluentAppHomePage;
import pages.FluentAppLoginPage;


public class AppLoginTest extends TestBase {


  @Page
  FluentAppLoginPage fluentAppLoginPage;
  @Page
  FluentAppHomePage fluentAppHomePage;

  @Test
  public void shouldConnect() {
    //Given
    String emailTest = "benjamin@afcepf.fr";
    String paswwordTest = "123456789";
    String userNameExpected = "Good afternoon, Selenium User!";
    //When
    fluentAppLoginPage.connect(emailTest, paswwordTest);
    String userNameActual = fluentAppHomePage.verifyLoggedInUserNameText();
    //Then
    assertThat(userNameActual).as("Le userNameActuel doit être identique au userNameExpected").isEqualTo(userNameExpected);

  }

}