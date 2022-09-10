package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class LoginFormPage {

    // locators
    SelenideElement userNameInput = $("#login");
    SelenideElement passwordInput = $("#password");
    SelenideElement signInButton = $("#LogIn");
    SelenideElement rememberMeCheckbox = $(".input-label");

    // actions
    public LoginFormPage openLoginPage() {
        step("Открыть страницу аутентификации", () -> {
            open("/Security/Account/LogOn");
        });

        return this;
    }

    public LoginFormPage setUserName(String value) {
        step("Заполнить поле UserName", () -> {
            userNameInput.setValue(value);
        });

        return this;
    }

    public LoginFormPage setPassword(String value) {
        step("Заполнить поле Password", () -> {
            passwordInput.setValue(value);
        });

        return this;
    }

    public LoginFormPage clickSignInButton() {
        step("Нажать на кнопку Sign In", () -> {
            signInButton.click();
        });

        return this;
    }
}

