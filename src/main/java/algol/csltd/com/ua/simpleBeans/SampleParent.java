package algol.csltd.com.ua.simpleBeans;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by alik on 17.08.2016.
 */
public class SampleParent {
    protected static Log log = LogFactory.getLog(SampleParent.class);
    static {
        log.debug("static in SampleParent");
    }
    {
        log.debug("initialization in SampleParent for " + this.getClass().getSimpleName());
    }
    public SampleParent() {
        log.debug("constructor in SampleParent for " + this.getClass().getSimpleName());
    }

}
