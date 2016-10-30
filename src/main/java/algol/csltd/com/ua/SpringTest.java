package algol.csltd.com.ua;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    private static Log log = LogFactory.getLog(SpringTest.class);

    public static void main(String[] args) {
        log.info("initializing context");
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        ((AbstractApplicationContext)context).registerShutdownHook();
        //((ConfigurableApplicationContext)context).close(); // Другой способ закрыть ApplicationContext
    }
}
