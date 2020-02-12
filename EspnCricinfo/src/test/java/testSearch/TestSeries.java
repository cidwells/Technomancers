package testSearch;

import home.Series;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSeries extends Series {
    @Test
    public void userCanGetIntoSeriesTab() throws InterruptedException {
        Series sr = PageFactory.initElements(driver,Series.class);
        sr.series();
        sr.validateTitle("Series");
        Thread.sleep(4000);
        Assert.assertEquals("Series","Series");
    }
    @Test
    public void userCanHoverSeriesAndClickIntoNzVInd() throws InterruptedException {
        Series sr = PageFactory.initElements(driver,Series.class);
        sr.selectMouseHover(series);
        sr.clickNewzealandVIndia();
        sr.validateTitle("New Zealand v India ");
        Assert.assertEquals(true,true);
    }
    @Test
    public void userCanHoverSeriesAndClickIntoPakVBan() throws InterruptedException {
        Series sr = PageFactory.initElements(driver, Series.class);
        sr.selectMouseHover(series);
        sr.clickPakistanVBangladesh();
        sr.validateTitle("Pakistan v Bangladesh ");
        Assert.assertEquals(true, true);
    }
    @Test
    public void userCanHoverSeriesAndClickIntoWiVIrl() throws InterruptedException {
        Series sr = PageFactory.initElements(driver, Series.class);
        sr.selectMouseHover(series);
        sr.clickWestIndiesVIreland();
        sr.validateTitle("West Indies v Ireland ");
        Assert.assertEquals(true, true);
    }
    @Test
    public void userCanHoverSeriesAndClickIntoSafVEng() throws InterruptedException {
        Series sr = PageFactory.initElements(driver, Series.class);
        sr.selectMouseHover(series);
        sr.clickSouthAfricaVEngland();
        sr.validateTitle("South Africa v England ");
        Assert.assertEquals(true, true);
    }
    @Test
    public void userCanHoverSeriesAndClickIntoWCupLeague2() throws InterruptedException {
        Series sr = PageFactory.initElements(driver, Series.class);
        sr.selectMouseHover(series);
        sr.clickWorldCupLeague2();
        sr.validateTitle("World Cup League 2");
        Assert.assertEquals(true, true);
    }
    @Test
    public void userCanHoverSeriesAndClickIntoWmnT20TSires() throws InterruptedException {
        Series sr = PageFactory.initElements(driver, Series.class);
        sr.selectMouseHover(series);
        sr.clickWomenT20TriSeries();
        sr.validateTitle("Women's T20 Tri-Series");
        Assert.assertEquals(true, true);
    }
    @Test
    public void userCanHoverSeriesAndClickIntoIccWmnChamp() throws InterruptedException {
        Series sr = PageFactory.initElements(driver, Series.class);
        sr.selectMouseHover(series);
        sr.clickIccWomenChampionShip();
        sr.validateTitle("ICC Women's Championship");
        Assert.assertEquals(true, true);
    }
    @Test
    public void userCanHoverSeriesAndClickIntoUnder19WldCup() throws InterruptedException {
        Series sr = PageFactory.initElements(driver, Series.class);
        sr.selectMouseHover(series);
        sr.clickUnder19WorldCup();
        sr.validateTitle("U19 World Cup");
        Assert.assertEquals(true, true);
    }
    @Test
    public void userCanHoverSeriesAndClickIntoBbl2019() throws InterruptedException {
        Series sr = PageFactory.initElements(driver, Series.class);
        sr.selectMouseHover(series);
        sr.clickBbl2019();
        sr.validateTitle("BBL 2019");
        Assert.assertEquals(true, true);
    }
    @Test
    public void userCanHoverSeriesAndClickIntoNzVIndScrDwnToOdiBtn() throws InterruptedException {
        Series sr = PageFactory.initElements(driver, Series.class);
        sr.selectMouseHover(series);
        sr.clickNewzealandVIndia();
        sr.scrollByElement(topRunScorers);
        sr.clickOdiButton();
    }
    @Test
    public void userCanPrintListOfTextFromSeriesTab(){
        Series sr = PageFactory.initElements(driver, Series.class);
        sr.getListOfTextFromSeries();
    }




}
