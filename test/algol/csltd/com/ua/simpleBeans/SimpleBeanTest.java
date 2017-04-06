package algol.csltd.com.ua.simpleBeans;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

/**
 * Created by admin on 25.11.2016.
 */
public class SimpleBeanTest {
    private static Log log = LogFactory.getLog(SimpleBeanTest.class);

    @org.junit.Before
    public void setUp() throws Exception {
        System.out.println("@org.junit.Before");
    }

    @org.junit.After
    public void tearDown() throws Exception {
        System.out.println("@org.junit.After");
    }

    @org.junit.Test
    public void test() throws Exception {
        log.info("initializing context");
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        ((AbstractApplicationContext)context).registerShutdownHook();
//        SimpleBean simpleBean = new SimpleBean();
//        simpleBean.setSomeList(new ArrayList(10));
//        simpleBean.setAdminEmails(System.getProperties());
//        simpleBean.setSomeMap(new HashMap());
//        simpleBean.setSomeSet(System.getProperties().entrySet());
//        simpleBean.afterPropertiesSet();
    }

}