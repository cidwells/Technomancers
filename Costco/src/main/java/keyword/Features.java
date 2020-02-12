package keyword;

import home.Search;
import org.openqa.selenium.support.PageFactory;
import base.CommonAPI;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

    public class Features extends CommonAPI {

        Search s = PageFactory.initElements(driver, Search.class);

        public void search1(){
            s.makeSearch();
        }

        public void membership(){
            s.memeberShip();
        }
         public void costcoOffers(){
            s.getEmailOffers();
         }

        public void select(String featureName, WebDriver driver1)throws IOException, InterruptedException{
            switch(featureName){
                case "search":
                    search1();
                    break;
                case "membership":
                    membership();
                    break;
                case "costco":
                   costcoOffers(); ;
                    break;
                default:
                    throw new InvalidArgumentException("Invalid features choice");
            }
        }

        public void selectFeatures(WebDriver driver1)throws IOException, InterruptedException{
            ItemTobeSearched itemsToBeSearched = new ItemTobeSearched();
            String [] testSteps = itemsToBeSearched.getDataFromExcelFileForFeaturesChoice();
            for(int i=1; i<testSteps.length; i++) {
                select(testSteps[i], driver1);
            }
        }
    }

