import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class Login implements Task {

    private final String username;
    private final String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static Performable withCredentials(String username, String password) {
        return Task.where("{0} logs in with username: " + username + " and password: " + password,
                new Login(username, password));
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(SauceDemoLoginPage.USERNAME_FIELD).thenHit(Keys.TAB),
                Enter.theValue(password).into(SauceDemoLoginPage.PASSWORD_FIELD).thenHit(Keys.ENTER)
                //Click.on(By.id("login-button"))/// no es necesario especificar el boton de login ya que el enter lo hace por nosotros
        );
    }
}