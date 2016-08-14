package algol.csltd.com.ua;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
public class SpringTest {

    @Bean
    MessageService mockMessageService() {
        return new MessageService() {
            public String getMessage() {
                return "Hello World!";
            }
        };
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringTest.class);
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();
    }
}
