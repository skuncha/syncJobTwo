package production.jbehave;


import production.utils.WebDriverConfigurer;
import net.thucydides.jbehave.ThucydidesJUnitStories;

/**
 * @author srinivasa.kuncha
 *
 */
public class AcceptanceTestSuite extends ThucydidesJUnitStories {
	
	public AcceptanceTestSuite() {
		
		WebDriverConfigurer.configureDrivers();
		
		}
}
