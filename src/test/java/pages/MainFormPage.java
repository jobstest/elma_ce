package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class MainFormPage {

    // locators
    SelenideElement taskPortletHeaderName = $(".portlet-header-name");
    // actions

    public MainFormPage visibleTaskPortlet(String value) {
        step("Проверить наличие портлета с именем Task", () -> {
            taskPortletHeaderName.shouldHave(text(value));
        });

        return this;
    }
}
