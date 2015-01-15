package production.steps;

import java.io.IOException;

import production.pages.DailyMailAccountPage;
import net.thucydides.core.steps.ScenarioSteps;


/**
 * @author srinivasa.kuncha
 *
 */
public class EndUserSteps extends ScenarioSteps {

    DailyMailAccountPage dictionaryPage;

        public void supplyLoginCredientials(String username, String password){
    	dictionaryPage.supplyLogin_Credientials(username, password);
    	dictionaryPage.clickOnLogin();
    }

    public void is_the_home_page() {
        dictionaryPage.open();
    }

    public void migrationDataFile(String file) throws IOException{
    	    	
    	dictionaryPage.readfile(file);
    }
    
    public void verfiyOrdersuccessfullyPlaced(){
    	System.out.println("           XXXXXXXXXXXXXXX             ORDERS PLACED SUCCESSFULLY       XXXXXXXXXXXXXXXX           ");
    }
}