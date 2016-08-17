package algol.csltd.com.ua.instantiation;

import algol.csltd.com.ua.simpleBeans.SampleParent;

import java.util.ArrayList;

/**
 * Created by alik on 17.08.2016.
 */
public class InstantiationWithStaticFactoryMethod extends SampleParent {
    static {
        log.debug("static in InstantiationWithStaticFactoryMethod");
    }
    private static InstantiationWithStaticFactoryMethod instance = new InstantiationWithStaticFactoryMethod();

    private InstantiationWithStaticFactoryMethod() {
        log.debug("constructor private in InstantiationWithStaticFactoryMethod");

    }

    public static InstantiationWithStaticFactoryMethod createInstance() {
        log.debug("createInstance in InstantiationWithStaticFactoryMethod");
        return instance;
    }

    public static ArrayList<String> createArrayList() {
        log.debug("createArrayList in InstantiationWithStaticFactoryMethod");
        return new ArrayList<String>();
    }
}
