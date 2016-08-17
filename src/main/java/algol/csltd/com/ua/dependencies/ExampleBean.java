package algol.csltd.com.ua.dependencies;

import algol.csltd.com.ua.simpleBeans.SampleParent;

/**
 * Created by alik on 17.08.2016.
 */
public class ExampleBean extends SampleParent {
    private AnotherBean beanOne;
    private YetAnotherBean beanTwo;
    private Integer integerProperty;

    static {
        log.debug("static in ExampleBean");
    }

    {
        log.debug("initialization in ExampleBean for " + this.getClass().getSimpleName());
    }

    public ExampleBean() {
        log.debug("constructor in ExampleBean for " + this.getClass().getSimpleName());
    }

    public ExampleBean(AnotherBean beanOne, Integer integerProperty) {
        log.debug("constructor in ExampleBean for " + this.getClass().getSimpleName() + " with arguments: " + beanOne + ", " + integerProperty);
        this.beanOne = beanOne;
        this.integerProperty = integerProperty;
    }

    public AnotherBean getBeanOne() {
        return beanOne;
    }

    public void setBeanOne(AnotherBean beanOne) {
        log.debug("setBeanOne " + beanOne);
        this.beanOne = beanOne;
    }

    public YetAnotherBean getBeanTwo() {
        return beanTwo;
    }

    public void setBeanTwo(YetAnotherBean beanTwo) {
        log.debug("setBeanTwo " + beanTwo);
        this.beanTwo = beanTwo;
    }

    public Integer getIntegerProperty() {
        return integerProperty;
    }

    public void setIntegerProperty(Integer integerProperty) {
        log.debug("setIntegerProperty");
        this.integerProperty = integerProperty;
    }

    public static ExampleBean createInstance (AnotherBean anotherBean, YetAnotherBean yetAnotherBean, int i) {
        log.debug("createInstance in ExampleBean with arguments: " + anotherBean + ", " + yetAnotherBean + ", " + i);
        ExampleBean eb = new ExampleBean(anotherBean, i);
        eb.setBeanTwo(yetAnotherBean);
        return eb;
    }
}
