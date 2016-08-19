package algol.csltd.com.ua.instantiation;

import algol.csltd.com.ua.simpleBeans.SampleParent;
import algol.csltd.com.ua.simpleBeans.SimpleBean;

/**
 * Created by alik on 17.08.2016.
 */
public class DefaultServiceLocator extends SampleParent {
    private static SimpleBean bean = new SimpleBean();
    private static SampleParent sampleParent = new SampleParent();

    private DefaultServiceLocator() {
        super();
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
