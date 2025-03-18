package starter.saucedemo;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import starter.UilityFunctions.CSVDataReader;

public class saucedemoActions {

    public static Performable enterUserName(String userName) {
        return Task.where("{0} enter user name",
                    actor -> {
                                actor.attemptsTo(
                                        Enter.keyValues(userName).into(saucedemoPath.ENTER_USERNAME_FIELD)
                                );
                                actor.remember("userName", userName);
                                String remembereduserName = actor.recall("userName");
                                Serenity.recordReportData()
                                        .withTitle("Remember userName")
                                        .andContents("userName: " + remembereduserName);
                    });
    }

    public static Performable enterPassword(String password) {
        return Task.where("{0} enter password",
                actor -> {
                    actor.attemptsTo(
                            Enter.keyValues(password).into(saucedemoPath.ENTER_PASSWORD_FIELD)
                    );
                    actor.remember("password", password);
                    String rememberedPassword = actor.recall("password");
                    Serenity.recordReportData()
                            .withTitle("Remember password")
                            .andContents("password: " + rememberedPassword);
                });
    }

    public static Performable selectOptions(String options) {
        return Task.where("{0} select options" + options,
                actor -> {
                            Target optionsTarget;
                            if (options.contains("Name (A to Z)")) {
                                optionsTarget = saucedemoPath.SELECT_OPTION1;
                            } else if (options.contains("Name (Z to A)")) {
                                optionsTarget = saucedemoPath.SELECT_OPTION2;
                            } else if (options.contains("Price (low to high)")) {
                                optionsTarget = saucedemoPath.SELECT_OPTION3;
                            }else if (options.contains("Price (high to low)")) {
                                optionsTarget = saucedemoPath.SELECT_OPTION4;
                            } else {
                                throw new IllegalArgumentException("Invalid options: " + options);
                            }
                            actor.attemptsTo(Click.on(optionsTarget));
                            actor.remember("options", options);
                            String rememberedoptions = actor.recall("options");
                            Serenity.recordReportData()
                                    .withTitle("Remember options")
                                    .andContents("options: " + rememberedoptions);
                }
        );
    }


    public static Performable rememberPrice() {
        return Task.where("{0} remember the price",
                    actor -> {
                            String PricePaymentUI1 = saucedemoPath.PRICE_SUMMARY1.resolveFor(actor).getText();
                            String PricePaymentUI2 = saucedemoPath.PRICE_SUMMARY.resolveFor(actor).getText();
                            String RememberPrice = actor.recall("RememberPrice");
                            Serenity.recordReportData()
                                .withTitle("Remember price information")
                                .andContents("Symbol: " + PricePaymentUI1 + "Price:" + PricePaymentUI2 + RememberPrice);
                    }
                );
    }

    public static Performable enterFirstName(String FirstName) {
        return Task.where("{0} enter first name",
                    actor -> {
                                actor.attemptsTo(
                                        Enter.keyValues(FirstName).into(saucedemoPath.ENTER_FIRST_NAME_FIELD)
                                );
                                actor.remember("FirstName", FirstName);
                                String rememberedFirstName = actor.recall("FirstName");
                                Serenity.recordReportData()
                                        .withTitle("Remember FirstName")
                                        .andContents("FirstName: " + rememberedFirstName);
                    }
                );
    }

    public static Performable enterLastName(String LastName) {
        return Task.where("{0} enter last name",
                actor -> {
                    actor.attemptsTo(
                            Enter.keyValues(LastName).into(saucedemoPath.ENTER_LAST_NAME_FIELD)
                    );
                    actor.remember("LastName", LastName);
                    String rememberedLastName = actor.recall("LastName");
                    Serenity.recordReportData()
                            .withTitle("Remember LastName")
                            .andContents("LastName: " + rememberedLastName);
                }
        );
    }

    public static Performable enterZipCode(String ZipCode) {
        return Task.where("{0} enter Zip Code",
                actor -> {
                    actor.attemptsTo(
                            Enter.keyValues(ZipCode).into(saucedemoPath.ENTER_ZIPCODE_FIELD)
                    );
                    actor.remember("ZipCode", ZipCode);
                    String rememberedZipCode = actor.recall("ZipCode");
                    Serenity.recordReportData()
                            .withTitle("Remember ZipCode")
                            .andContents("ZipCode: " + rememberedZipCode);
                }
        );
    }
}
