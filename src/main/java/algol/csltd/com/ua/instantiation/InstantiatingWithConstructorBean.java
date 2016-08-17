package algol.csltd.com.ua.instantiation;

import algol.csltd.com.ua.simpleBeans.SampleParent;

/**
 * Created by alik on 17.08.2016.
 */
public class InstantiatingWithConstructorBean extends SampleParent {
    public InstantiatingWithConstructorBean(String s) {
        super();
        log.debug("constructor in InstantiatingWithConstructorBean for " + this.getClass().getSimpleName() + " with argument: " + s);
    }
}
