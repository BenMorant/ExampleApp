package tests;

import static org.assertj.core.api.Assertions.assertThat;

import org.fluentlenium.adapter.junit.FluentTest;
import org.fluentlenium.core.annotation.Page;
import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.FluentAppHomePage;
import pages.FluentAppLoginPage;


public class AppLoginTest extends FluentTest {

  @Override
  public WebDriver newWebDriver() {
    return new ChromeDriver();
  }

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