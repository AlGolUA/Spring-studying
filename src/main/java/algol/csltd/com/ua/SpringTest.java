package algol.csltd.com.ua;

public class SpringTest {

    public static void main(String[] args) {
        // Set up JUL config file
        // System.setProperty("java.util.logging.config.file", "c:\\Users\\admin\\IdeaProjects\\Spring-studying\\src\\main\\resources\\logging.properties");
        // System property cab be defined also in call of java.exe like java.exe -Djava.util.logging.config.file=logging.properties
        try {
            Class<?> aClass = Class.forName("org.slf4j.impl.JDK14LoggerFactory");
        } catch (ClassNotFoundException e) {
            // Don't use the SLF4JBridgeHandler for case of JDK14 logging framework to prevent cycling code
            org.slf4j.bridge.SLF4JBridgeHandler.removeHandlersForRootLogger();
            org.slf4j.bridge.SLF4JBridgeHandler.install();
        }
        // ROOT level of JUL logging should be set to ALL
        java.util.logging.Logger.getLogger("").setLevel(java.util.logging.Level.ALL);

        java.util.logging.Logger julLogger = java.util.logging.Logger.getLogger(SpringTest.class.getName());
        julLogger.info("JUL logging...");
        julLogger.finest("JUL logging...");
        org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(SpringTest.class);
        logger.info("SLF4J logging...");
        logger.trace("SLF4J logging...");
        org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SpringTest.class);
        log.info("JCL logging...");
        log.trace("JCL logging...");
    }
}
