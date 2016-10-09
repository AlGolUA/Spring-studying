package algol.csltd.com.ua.simpleBeans;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * Created by admin on 09.10.2016.
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    private static Log log = LogFactory.getLog(MyBeanFactoryPostProcessor.class);

    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        log.info("MyBeanFactoryPostProcessor.postProcessBeanFactory");
    }
}
