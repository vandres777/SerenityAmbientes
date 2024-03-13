import net.serenitybdd.screenplay.targets.Target;

public class SauceDemoLoginPage {
    public static final Target USERNAME_FIELD = Target.the("username field").locatedBy("#user-name");
    public static final Target PASSWORD_FIELD = Target.the("password field").locatedBy("#password");
}