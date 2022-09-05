package com.gmail.jobstest18;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.github.javafaker.Faker;
import io.qameta.allure.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.LoginFormPage;
import pages.MainFormPage;

public class LoginFormTests {

    Faker faker = new Faker();
    LoginFormPage loginFormPage = new LoginFormPage();
    MainFormPage mainFormPage = new MainFormPage();

    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "http://localhost:9000";
    }

    @Test
    @Owner("parfionov")
    @DisplayName("Вход с верными логин и пароль")
    @Severity(SeverityLevel.BLOCKER)
    @Feature("Аутентификация c верными/ не верными данными")
    @Story("Аутентификация")
    public void loginCorrectUsernameAndPassword() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        loginFormPage.openLoginPage()
                .setUserName("admin")
                .setPassword("admin")
                .clickSignInButton();
        mainFormPage.visibleTaskPortlet("Task");
    }

}
