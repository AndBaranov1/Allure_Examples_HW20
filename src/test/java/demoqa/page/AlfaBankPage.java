package demoqa.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AlfaBankPage {

    private SelenideElement
    tabSearch = $(".aPwyr > svg"),
    inputSearch = $(".c3pCr"),
    verifyCredit = $(".b-serp-item:nth-child(1) .b-serp-item__title yass-span"),
    verifyInvest = $(".b-serp-item:nth-child(3) .b-serp-item__title yass-span"),
    tabVclad =  $(".r1B_-:nth-child(2) > span > .a2_r6"),
    alfaAccountBtn = $("#alfa-account .k30tm > .a1jIK .a1cAc"),
    textAlphaAccount = $(".w2rNW"),
    tabIpoteca = $(".r1B_-:nth-child(4) > span > .a2_r6"),
    houseInput = $(".r1B_-:nth-child(4) .B1B_-:nth-child(1) > span:nth-child(2) .D1B_-"),
    calculateInput = $("span > .button__secondary_zsrtz > .button__text_1mgd7"),
    paymentInput = $(".button__text_1mgd7:nth-child(2)"),
    verifyPaymentShedule = $(".a2AOn"),
    submitApplication = $(".a1cAc:nth-child(1) > span > .button__primary_zsrtz > .button__text_1mgd7"),
    verifySubApp = $(".p2u4N");


    public AlfaBankPage openPage() {
        open("https://alfabank.ru/");
        return this;
    }

    public AlfaBankPage setInputValue(String value) {
        tabSearch.click();
        inputSearch.setValue(value).pressEnter();

        return this;
    }
    public AlfaBankPage verifyResults(String value) {
        verifyCredit.shouldHave(text(value));
        return this;
    }
    public AlfaBankPage verifyResultsInvest(String value) {
        verifyInvest.shouldHave(text(value));
        return this;
    }


    public AlfaBankPage setAlphaAccount() {
        tabVclad.click();
        alfaAccountBtn.click();
        return this;
    }

   public AlfaBankPage verifyAlphaAccount(String value) {
       textAlphaAccount.shouldHave(text(value));
        return this;
    }

    public AlfaBankPage setHouse() {
        tabIpoteca.hover();
        houseInput.click();
        return this;
    }

    public AlfaBankPage setCalculate() {
        calculateInput.click();
        return this;
    }

    public AlfaBankPage setSchedulePayment() {
        paymentInput.click();
        return this;
    }

    public AlfaBankPage setverifyPaymentShedule(String value) {
        verifyPaymentShedule.shouldHave(text(value));
        return this;
    }

    public AlfaBankPage setSubmitApplication() {
        submitApplication.click();
        return this;
    }

    public AlfaBankPage verifySubmitApp(String value) {
        verifySubApp.shouldHave(text(value));
        return this;
    }
}