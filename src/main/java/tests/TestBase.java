package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;


public class TestBase {

  public static WebDriver driver = null;

  @BeforeClass
  //permet d'initialiser les tests avant leur lancement
  public void initialize() throws IOException{

    System.setProperty("webdriver.chrome.driver", System.getProperty("/home/benjamin/chromedriver"));
    driver = new ChromeDriver();
    //Pour maximiser la fenêtre du navigateur
    driver.manage().window().maximize();
    //Permet d'attendre explicitement
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    //Permet d'aller sur la page de mon application
    driver.get("https://monapplication.net/login");

  }

  @AfterClass
  //Permet de "nettoyer" les tests, une fois ceux-ci effectués
  public void TeardownTest()
  {
    TestBase.driver.quit();
  }

}
