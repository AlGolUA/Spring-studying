package algol.csltd.com.ua.dependencies;

import algol.csltd.com.ua.simpleBeans.SampleParent;

/**
 * Created by alik on 17.08.2016.
 */

public class ExampleBean extends SampleParent {
    private AnotherBean beanOne;
    private YetAnotherBean beanTwo;
    private Integer integerProperty;

    public ExampleBean() {
        super();
    }

    public ExampleBean(AnotherBean beanOne, Integer integerProperty) {
        super();
        this.beanOne = beanOne;
        this.integerProperty = integerProperty;
    }

    public AnotherBean getBeanOne() {
        return beanOne;
    }

    public void setBeanOne(AnotherBean beanOne) {
        log.debug(String.format("setBeanOne(%s)", beanOne));
        this.beanOne = beanOne;
    }

    public YetAnotherBean getBeanTwo() {
        return beanTwo;
    }

    public void setBeanTwo(YetAnotherBean beanTwo) {
        log.debug(String.format("setBeanTwo(%s)", beanTwo));
        this.beanTwo = beanTwo;
    }

    public Integer getIntegerProperty() {
        return integerProperty;
    }

    public void setIntegerProperty(Integer integerProperty) {
        log.debug(String.format("setIntegerProperty(%s)", integerProperty));
        this.integerProperty = integerProperty;
    }

    public static ExampleBean createInstance (AnotherBean anotherBean, YetAnotherBean yetAnotherBean, int i) {
        log.debug("createInstance in ExampleBean with arguments: " + anotherBean + ", " + yetAnotherBean + ", " + i);
        ExampleBean eb = new ExampleBean(anotherBean, i);
        eb.setBeanTwo(yetAnotherBean);
        return eb;
    }
}
