package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.fluentlenium.adapter.junit.FluentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestBase extends FluentTest {

  public static WebDriver driver = null;

//permet d'initialiser le driver chrome
  public void initialize() throws IOException {

    System
        .setProperty("webdriver.chrome.driver", System.getProperty("/home/benjamin/chromedriver"));
    driver = new ChromeDriver();
    //Pour maximiser la fenêtre du navigateur
    driver.manage().window().maximize();
    //Permet d'attendre explicitement
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    //Permet d'aller sur la page de mon application
    driver.get("https://monapplication.net/login");

  }

  //Permet d'"éteindre" le driver une fois les tests effectués
  public void TeardownTest()
  {
    TestBase.driver.quit();
  }

}
