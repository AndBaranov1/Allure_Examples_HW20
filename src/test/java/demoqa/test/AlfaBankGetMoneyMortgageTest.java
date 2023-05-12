package demoqa.test;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Owner("baranov_aa")
@Feature("Issues")
@Tags({@Tag("main")})
public class AlfaBankGetMoneyMortgageTest extends TestBase {

    @Story("Create new issue")
    @DisplayName("Display results when searching for Credit")
    @Test
    void searchResultsCredit() {
        step("Open form alfabank", () -> {
            alfaBankPage.openPage();
        });

        step("Click on the search button and enter a value", () -> {
            alfaBankPage.setInputValue("Кредит");
        });

        step("Verify results text", () -> {
            alfaBankPage.verifyResults("Кредит наличными от 4%: рассчитать и оформить онлайн");
        });
    }

    @Story("Create new issue")
    @DisplayName("Display results when searching for Investments")
    @Test
    void searchResultsInvestments() {
        step("Open form alfabank", () -> {
            alfaBankPage.openPage();
        });

        step("Click on the search button and enter a value", () -> {
            alfaBankPage.setInputValue("Инвестиции");
        });

        step("Verify results text", () -> {
            alfaBankPage.verifyResultsInvest("Инвестиции: что это, как начать инвестировать на бирже");
        });
    }

    @Story("Create new pull request")
    @DisplayName("Savings account form display")
    @Test
    void checkConnectivity() {

        step("Open form alfabank", () -> {
            alfaBankPage.openPage();
        });

        step("Switching to the alpha account form", () -> {
            alfaBankPage.setAlphaAccount();
        });

        step("Verify results alpha account", () -> {
            alfaBankPage.verifyAlphaAccount("Накопительный Альфа-Счёт");
        });
    }

    @Story("Create new issue")
    @DisplayName("Payment schedule display")
    @Test
    void ipotecaPayment() {
        step("Open form alfabank", () -> {
            alfaBankPage.openPage();
        });

        step("Selecting the section Secondary housing", () -> {
            alfaBankPage.setHouse();
        });

        step("Click on the Calculate Mortgage button", () -> {
            alfaBankPage.setCalculate();
        });

        step("Display payment schedule", () -> {
            alfaBankPage.setSchedulePayment();
        });

        step("Verify payment schedule", () -> {
            alfaBankPage.setverifyPaymentShedule("График платежей");
        });
    }

    @Story("Create new pull request")
    @DisplayName("Find out your mortgage limit")
    @Test
    void findMortgageLimit() {
        step("Open form alfabank", () -> {
            alfaBankPage.openPage();
        });

        step("Selecting the section Secondary housing", () -> {
            alfaBankPage.setHouse();
        });

        step("Click on the button submit a request", () -> {
            alfaBankPage.setSubmitApplication();

        });

        step("Click on the button submit a request", () -> {
            alfaBankPage.verifySubmitApp("Узнайте лимит по ипотеке");
        });
    }
}