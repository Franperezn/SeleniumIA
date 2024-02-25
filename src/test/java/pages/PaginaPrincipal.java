package pages;

public class PaginaPrincipal extends BasePage {

    private String accountButton = "//span[@class='label'][normalize-space()='Account']";


    public PaginaPrincipal(){
        super(driver);
    }

        // Método para navegar a Madison
        public void navigateToMadison() {
            //Navega a la página web 
            driver.get("http://demo-store.seleniumacademy.com/");
            clickElement(accountButton);
            
        }

    
}
