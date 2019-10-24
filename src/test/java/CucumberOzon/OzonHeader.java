package CucumberOzon;

//Локаторы для заголовка сайта. Также сюда добавил URL и локатор для кнопки "закрыть" в сообщение о cookie
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class OzonHeader {

    public static final String URL = "https://ozon.ru";

    public static SelenideElement CookieClose() {
        return $(byClassName("close"));
    }

    public static SelenideElement getCatalogMenu() {
        return $(byValue("Каталог"));
    }

    public static SelenideElement getBooks() {
        return $(byXpath("//a[@href='/category/knigi-16500/']"));
    }

    public static SelenideElement getCategory() {
        return $(byXpath("//a[@href='/category/kompyuternye-tehnologii-40020/']"));
    }

    public static SelenideElement getCart() {
        return $(byXpath("//a[@href = '/cart']"));
    }

    public static SelenideElement getCity() {
        return $(byXpath("//button[@class='d13f08']"));
    }
    public static SelenideElement inputCity() {
        return $(byXpath("//label/div/input[@type='text']"));
    }
    public static SelenideElement getSportsGoods() {
        return $(byXpath("//a[@href = '/category/sport-i-otdyh-11000/']"));
    }
    public static SelenideElement getSnowboardsAndAccessories() {
        return $(byXpath("//a[@href = '/category/snoubordy-i-aksessuary-11158/']"));
    }

}