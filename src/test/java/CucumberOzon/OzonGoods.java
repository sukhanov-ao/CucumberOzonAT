package CucumberOzon;

// В классе генерируется список необходимых товаров и выбирается случайный
// Определяем локаторы для выбранного товара (Название товара, кнопка "В корзину", название товара в корзине)

import com.codeborne.selenide.SelenideElement;

import java.util.List;
import java.util.Random;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class OzonGoods {

    private static List<SelenideElement> goodsList = $$(byClassName("tile-wrapper"));
    private static Random random = new Random();
    private static SelenideElement getRandomGood = goodsList.get(random.nextInt(goodsList.size()));


    public static SelenideElement getRandomGoodName() {
        return getRandomGood.$(byXpath(".//span[@data-test-id='tile-name']"));
    }
    public static SelenideElement getToCartButton() {
        return getRandomGood.$(byXpath(".//button[contains(@class, 'buy')]"));
    }
    public static SelenideElement getGoodInCartName() {
        return $(byXpath("//div[@class='cart-item__column m-main-block']/a/span"));
    }
}
