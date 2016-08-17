package algol.csltd.com.ua.instantiation;

import algol.csltd.com.ua.simpleBeans.SampleParent;
import algol.csltd.com.ua.simpleBeans.SimpleBean;

/**
 * Created by alik on 17.08.2016.
 */
public class DefaultServiceLocator extends SampleParent {
    static {
        log.debug("static in DefaultServiceLocator");
    }
    private static SimpleBean bean = new SimpleBean();
    private static SampleParent sampleParent = new SampleParent();

    {
        log.debug("initialization if DefaultServiceLocator for " + this.getClass().getSimpleName());
    }

    private DefaultServiceLocator() {
        log.debug("constructor private in DefaultServiceLocator for " + this.getClass().getSimpleName());
    }

    public SimpleBean createSimpleBeanInstance() {
        log.debug("createSimpleBeanInstance in DefaultServiceLocator");
        return bean;
    }

    public SampleParent createSampleParentBean() {
        log.debug("createSampleParent in DefaultServiceLocator");
        return sampleParent;
    }

    public String createSampleString() {
        log.debug("createSampleString in DefaultServiceLocator");
        return "Hello World!";
    }
}
