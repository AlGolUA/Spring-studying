package algol.csltd.com.ua;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ReflectPermission;

public class SpringTest {

    public static void main(String[] args) {
//         Set up JUL config file
//         System.setProperty("java.util.logging.config.file", "c:\\Users\\admin\\IdeaProjects\\Spring-studying\\src\\main\\resources\\logging.properties");
//         System property cab be defined also in call of java.exe like java.exe -Djava.util.logging.config.file=logging.properties
        try {
            Class<?> aClass = Class.forName("org.slf4j.impl.JDK14LoggerFactory");
        } catch (ClassNotFoundException e) {
//            Use the SLF4JBridgeHandler only is JDK14 logging framework is not used
//            org.slf4j.bridge.SLF4JBridgeHandler.removeHandlersForRootLogger();
//            org.slf4j.bridge.SLF4JBridgeHandler.install();
            try {
                Class<?> bridgeHandler = Class.forName("org.slf4j.bridge.SLF4JBridgeHandler");
                Method removeHandlersForRootLogger = bridgeHandler.getMethod("removeHandlersForRootLogger");
                removeHandlersForRootLogger.invoke(null);
                Method install = bridgeHandler.getMethod("install");
                install.invoke(null);
            } catch (Exception ex) {
            }
        }
        // ROOT level of JUL logging should be set to ALL
        java.util.logging.Logger.getLogger("").setLevel(java.util.logging.Level.ALL);

        java.util.logging.Logger julLogger = java.util.logging.Logger.getLogger(SpringTest.class.getName());
        julLogger.info("JUL logging...");
        julLogger.finest("JUL logging...");
        org.apache.commons.logging.Log jclLog = org.apache.commons.logging.LogFactory.getLog(SpringTest.class);
        jclLog.info("JCL logging...");
        jclLog.trace("JCL logging...");
        org.apache.log4j.Logger log4jlogger = org.apache.log4j.Logger.getLogger(SpringTest.class);
        log4jlogger.info("Log4J logging...");
        log4jlogger.trace("Log4J logging...");
        org.slf4j.Logger slf4jLogger = org.slf4j.LoggerFactory.getLogger(SpringTest.class);
        slf4jLogger.info("SLF4J logging...");
        slf4jLogger.trace("SLF4J logging...");
    }
}
