package testSearch;

import home.Teams;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestTeams extends Teams {
    @Test
   public void userCanClickOnTeams(){
        Teams tm = PageFactory.initElements(driver,Teams.class);
        tm.userCanClickOnTeams();
    }
    @Test
    public void userCanMouseHouverOnTeams(){
        Teams tm = PageFactory.initElements(driver,Teams.class);
        tm.userCanMouseHouverOnTeams();
    }
    @Test
    public void userCanViewBangladeshTeam(){
        Teams tm = PageFactory.initElements(driver,Teams.class);
        tm.userCanClickOnTeams();
        tm.userCanViewBangladeshTeam();
    }
}
