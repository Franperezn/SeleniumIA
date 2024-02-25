package steps;

import io.cucumber.java.en.Given;
import pages.PaginaPrincipal;

public class MadisonSteps {

    PaginaPrincipal landingPage = new PaginaPrincipal();
    
    @Given ("I  navigate to Madison Store")
    public void iNavigateToPrincipalPage(){
        landingPage.navigateToMadison();
    }
}
