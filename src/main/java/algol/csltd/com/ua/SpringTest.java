package algol.csltd.com.ua;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    private static Log log = LogFactory.getLog(SpringTest.class);

    public static void main(String[] args) {
        log.info("initializing context");
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        log.info("getting bean");
        Object obj = context.getBean("petStore");
        log.info("Object created by bean petStore");
    }
}
