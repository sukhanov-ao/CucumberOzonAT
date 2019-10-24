package CucumberOzon;

//Локаторы до чекбоксов

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class OzonCheckboxMenu {
    public static SelenideElement checkboxBestsellers() {
        return $(byXpath("//div[@data-test-id = 'filter-block-isbest']"));
    }

    public static SelenideElement checkboxSoftwareLanguages() {
        return $(byXpath("//label[@data-test-id='filter-block-nonfictionbookgenre-item-135805']"));
    }

    public static SelenideElement getSnowboards() {
        return $(byXpath("//main/div/div/div/div/a[@href = '/category/snoubordy-11159/']"));
    }

    public static SelenideElement getPrice() {
        return $(byXpath("//input[contains(@id, 'from')]"));
    }
    public static SelenideElement getSkill() {
        return $(byXpath("//label[@data-test-id='filter-block-targetgroup-item-52054']"));
    }
}
