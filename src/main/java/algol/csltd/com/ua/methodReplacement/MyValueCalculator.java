package algol.csltd.com.ua.methodReplacement;

/**
 * Created by admin on 21.08.2016.
 */
public class MyValueCalculator {

    public String getValue() {
        return "Original result of method MyValueCalculator.getValue()";
    }

    @Override
    public String toString() {
        return getValue();
    }
}
