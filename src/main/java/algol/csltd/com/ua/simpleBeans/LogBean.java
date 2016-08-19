package algol.csltd.com.ua.simpleBeans;

/**
 * Created by alik on 18.08.2016.
 */
public class LogBean extends SampleParent {
    public String logMessage(String message) {
        log.debug(message);
        return null;
    }
    public static LogBean logMessage2(String message) {
        log.debug(message);
        return null;
    }
}
