package algol.csltd.com.ua.simpleBeans;

/**
 * Created by alik on 17.08.2016.
 */
public class SimpleBean extends SampleParent {
    static {
        log.debug("static in SimpleBean");
    }
    {
        log.debug("initialization in SimpleBean for " + this.getClass().getSimpleName());
    }
    public SimpleBean() {
        log.debug("constructor in SimpleBean for " + this.getClass().getSimpleName());
    }

    public void setAdminEmails(java.util.Properties properties) {
        log.debug("setAdminEmails: " + properties);
    }

    public void setSomeList(java.util.List list) {
        log.debug("setSomeList: " + list);
    }

    public void setSomeMap(java.util.Map map) {
        log.debug("setSomeMap: " + map);
    }

    public void setSomeSet(java.util.Set set) {
        log.debug("setSomeSet: " + set);
    }
}
