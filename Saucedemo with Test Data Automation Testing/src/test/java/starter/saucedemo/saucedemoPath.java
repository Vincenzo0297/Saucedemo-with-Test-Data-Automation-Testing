package starter.saucedemo;

import com.github.benmanes.caffeine.cache.stats.CacheStats;
import net.serenitybdd.core.pages.ResolvableElement;
import net.serenitybdd.screenplay.targets.Target;

public class saucedemoPath {


    public static final Target ENTER_USERNAME_FIELD = Target.the("username")
            .locatedBy("//*[@id=\"user-name\"]");

    public static final Target ENTER_PASSWORD_FIELD = Target.the("password")
            .locatedBy("//*[@id=\"password\"]");

    public static final Target CLICK_LOGIN_BUTTON = Target.the("login button")
            .locatedBy("//*[@id=\"login-button\"]");

    public static final Target SELECT_OPTION1 = Target.the("options")
            .locatedBy("//div[contains(@id, 'header_container')]/div/span/../div/span//select/option[1]");

    public static final Target SELECT_OPTION2 = Target.the("options")
            .locatedBy("//div[contains(@id, 'header_container')]/div/span/../div/span//select/option[2]");

    public static final Target SELECT_OPTION3 = Target.the("options")
            .locatedBy("//div[contains(@id, 'header_container')]/div/span/../div/span//select/option[3]");

    public static final Target SELECT_OPTION4 = Target.the("options")
            .locatedBy("//div[contains(@id, 'header_container')]/div/span/../div/span//select/option[4]");

    public static final Target CLICK_CART_BUTTON = Target.the("cart button")
            .locatedBy("//*[@id=\"add-to-cart-sauce-labs-onesie\"]");

    public static final Target CLICK_CART_ICON = Target.the("cart icon")
            .locatedBy("//*[@id=\"shopping_cart_container\"]/a");

    public static final Target CLICK_CHECKOUT_BUTTON = Target.the("check out button")
            .locatedBy("//*[@id=\"checkout\"]");

    public static final Target ENTER_FIRST_NAME_FIELD = Target.the("first name")
            .locatedBy("//*[@id=\"first-name\"]");

    public static final Target ENTER_LAST_NAME_FIELD = Target.the("last name")
            .locatedBy("//*[@id=\"last-name\"]");

    public static final Target ENTER_ZIPCODE_FIELD = Target.the("zip code")
            .locatedBy("//*[@id=\"postal-code\"]");

    public static final Target CLICK_CONTINUE_BUTTON = Target.the("continue button")
            .locatedBy("//*[@id=\"continue\"]");

    public static final Target CLICK_FINISH_BUTTON = Target.the("finish button")
            .locatedBy("//*[@id=\"finish\"]");

    public static final Target CLICK_BACK_HOME_BUTTON = Target.the("back home button")
            .locatedBy("//*[@id=\"back-to-products\"]");

    public static final Target CLICK_MENU_BUTTON = Target.the("menu button")
            .locatedBy("//*[@id=\"react-burger-menu-btn\"]");

    public static final Target CLICK_LOGOUT_BUTTON = Target.the("logout button")
            .locatedBy("//*[@id=\"logout_sidebar_link\"]");

    public static final Target INFORMATION_SUMMARY = Target.the("information summary")
            .locatedBy("//div[contains(@class, 'summary_info')]/div[contains(text(), '{0}')]");

    public static final Target PRICE_SUMMARY = Target.the("price summary")
            .locatedBy("//div[contains(@id, 'cart_contents_container')]/div/div[1]/div[3]/div[2]/div[2]/div/text()[2]");

    public static final Target PRICE_SUMMARY1 = Target.the("price summary")
            .locatedBy("//div[contains(@id, 'cart_contents_container')]/div/div[1]/div[3]/div[2]/div[2]/div/text()[1]");

}
