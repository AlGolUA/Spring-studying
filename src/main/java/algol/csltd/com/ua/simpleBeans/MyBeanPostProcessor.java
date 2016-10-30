package algol.csltd.com.ua.simpleBeans;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by admin on 09.10.2016.
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    private static Log log = LogFactory.getLog(MyBeanPostProcessor.class);

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info("MyBeanPostProcessor.postProcessBeforeInitialization(" + beanName + " of " + bean.getClass().getCanonicalName() + ")");
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("MyBeanPostProcessor.postProcessAfterInitialization(" + beanName + " of " + bean.getClass().getCanonicalName() + ")");
        return bean;
    }
}
