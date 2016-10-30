package algol.csltd.com.ua.simpleBeans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by alik on 17.08.2016.
 */
public class SimpleBean extends SampleParent implements InitializingBean, DisposableBean {
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

    public void initMethod() {
        log.debug("init-method");
    }

    @PostConstruct
    public void postConstruct() {
        log.debug("postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        log.debug("preDestroy");
    }

    public void afterPropertiesSet() throws Exception {
        log.debug("InitializingBean.afterPropertiesSet");
    }

    public void destroy() throws Exception {
        log.debug("DisposableBean.destroy");
    }

    public void destroyMethod() throws Exception {
        log.debug("destroyMethod");
    }

}
