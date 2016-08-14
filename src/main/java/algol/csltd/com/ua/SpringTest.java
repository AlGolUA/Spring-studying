package algol.csltd.com.ua;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;

public class SpringTest {

    public static void main(String[] args) {

        Log log = LogFactory.getLog(SpringTest.class);
        log.info("JCL logging...");
        Logger l = Logger.getLogger(SpringTest.class);
        l.info("Log4j logging...");
        org.slf4j.Logger ll = LoggerFactory.getLogger(SpringTest.class);
        ll.info("SLF4J logging...");
    }
}
