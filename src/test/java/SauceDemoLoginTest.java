import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.pages.Pages;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

@ExtendWith(SerenityJUnit5Extension.class)
class SauceDemoLoginTest {

    WebDriver hisBrowser;
    Pages pages;
    Actor user = Actor.named("Víctor");

    // Obtén las variables de entorno
    EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();

    // Obtén el ambiente desde la propiedad 'environment'. Si no se especifica, usa 'default'
    String environment = variables.getProperty("environment", "default");

    // Obtén las credenciales correspondientes al ambiente
    String username = variables.getProperty("environments." + environment + ".webdriver.user");
    String password = variables.getProperty("environments." + environment + ".webdriver.password");

    @BeforeEach
    void setUp() {
        // hisBrowser = new WebDriverFactory().newInstanceOf("chrome");
        pages = new Pages(hisBrowser);
    }

    @Test
    void login() {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

        user.can(BrowseTheWeb.with(hisBrowser));
        user.attemptsTo(
                Open.url(pages.getDefaultBaseUrl()),
                Login.withCredentials(username, password) // Use the imported Login class
        );
    }
}