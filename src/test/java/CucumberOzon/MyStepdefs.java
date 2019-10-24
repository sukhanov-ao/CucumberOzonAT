package CucumberOzon;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static com.codeborne.selenide.Selenide.open;

public class MyStepdefs {
    @When("^open ozon market$")
    public void openOzonMarket() {
        open(OzonHeader.URL);
    }

    @And("^cookie is closed$")
    public void cookieIsClosed() {
        OzonHeader.CookieClose().click();
    }

    @And("^choose city \"([^\"]*)\"$")
    public void chooseCity(String city) throws InterruptedException {
        OzonHeader.getCity().click();
        OzonHeader.inputCity().sendKeys(city);
        Thread.sleep(500);
        OzonHeader.inputCity().pressEnter();
    }

    @And("^catalog is opened$")
    public void catalogIsOpened() {
        OzonHeader.getCatalogMenu().click();
    }

    @And("^books is chosen$")
    public void booksIsChosen() {
        OzonHeader.getBooks().hover();
    }

    @And("^computer technologies are chosen$")
    public void computerTechnologiesAreChosen() {
        OzonHeader.getCategory().click();
    }

    @And("^bestsellers checked$")
    public void bestsellersChecked() {
        OzonCheckboxMenu.checkboxBestsellers().click();
    }

    @And("^software languages checked$")
    public void softwareLanguagesChecked() {
        OzonCheckboxMenu.checkboxSoftwareLanguages().click();
    }

    private String randomGoodName;

    @And("^random good is chosen$")
    public void randomGoodIsChosen() throws InterruptedException {
        Thread.sleep(300);
        randomGoodName = OzonGoods.getRandomGoodName().getText();
    }

    @And("^cart button is pressed$")
    public void cartButtonIsPressed() {
        OzonGoods.getToCartButton().click();
    }

    @And("^to cart button is vanished$")
    public void toCartButtonIsVanished() throws InterruptedException {
        Thread.sleep(500);
        Assert.assertFalse("Кнопка не нажалась", OzonGoods.getToCartButton().isDisplayed());
    }

    @And("^cart is opened$")
    public void cartIsOpened() {
        OzonHeader.getCart().click();
    }

    private String goodInCartName;

    @And("^good in cart is found$")
    public void goodInCartIsFound() {
        goodInCartName = OzonGoods.getGoodInCartName().getText();
    }

    @Then("^check if goods are equal$")
    public void checkIfGoodsAreEquals() {
/*        Assert.assertEquals(Books.getRandomBookName().getText() + " " + Books.getBookInCartName().getText() +
                "Книги не одинаковые", Books.getRandomBookName().getText(), Books.getBookInCartName().getText());*/
        Assert.assertEquals(randomGoodName, goodInCartName);

    }

    @And("^sports goods are chosen$")
    public void sportsGoodsAreChosen() {
        OzonHeader.getSportsGoods().hover();
    }

    @And("^snowboards and accessories are chosen$")
    public void snowboardsAndAccessoriesAreChosen() {
        OzonHeader.getSnowboardsAndAccessories().click();
    }

    @And("^snowboards are chosen$")
    public void snowboardsAreChosen() {
        OzonCheckboxMenu.getSnowboards().click();
    }

    @And("^price is set to \"([^\"]*)\"$")
    public void priseIsSetTo(String price) throws InterruptedException {
        Thread.sleep(500);
        OzonCheckboxMenu.getPrice().doubleClick();
        OzonCheckboxMenu.getPrice().sendKeys(price);
        OzonCheckboxMenu.getPrice().pressEnter();
    }

    @And("^for advanced is checked$")
    public void forAdvancedIsChecked() {
        OzonCheckboxMenu.getSkill().click();
    }

}