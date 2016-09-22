package algol.csltd.com.ua.simpleBeans;

/**
 * Created by alik on 18.08.2016.
 */
public class LogBean extends SampleParent {
    public String logMessage(String message) {
        log.debug(message);
        return null;
    }
    public static String staticLogMessage(String message) {
        log.debug(message);
        return null;
    }

    public String logObject(String message, Object object) {
        log.debug(message + " " + object.toString());
        return null;
    }
}