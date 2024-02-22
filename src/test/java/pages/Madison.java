package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Madison {

private WebDriver driver; 

@BeforeMethod
public void setUp(){

    //Inicializar el WebDriver para Chrome 

    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
}

@Test
public void navegamosAMadison(){
    //Navega a la página web 
    driver.get("http://demo-store.seleniumacademy.com/");
}
 
@AfterMethod
 public void tearDown(){
 //Cierra el navegadro después de la prueba 
 if (driver != null){
    driver.quit();
 }
 }

}
