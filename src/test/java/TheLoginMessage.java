import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class TheLoginMessage implements Question<String> {

    private Target target;

    public TheLoginMessage(Target target) {
        this.target = target;
    }

    @Override
    public String answeredBy(Actor actor) {
        return target.resolveFor(actor).getText();
    }

    public static TheLoginMessage displayedOn(Target target) {
        return new TheLoginMessage(target);
    }
}