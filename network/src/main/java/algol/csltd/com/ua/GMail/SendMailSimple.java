package algol.csltd.com.ua.GMail;

import org.simplejavamail.email.Email;
import org.simplejavamail.mailer.Mailer;
import org.simplejavamail.mailer.config.TransportStrategy;

import javax.mail.Message;

/**
 * Created by admin on 01.05.2017.
 */
public class SendMailSimple {
    public static void main(String[] args) {
        final String username = "algolua7";
        final String password = "RzZxFZl0";
        Email mail = new Email();
        mail.setFromAddress("Alik", "algolua7@gmail.com");
        mail.addRecipient("Alexander", "alik@csltd.com.ua", Message.RecipientType.TO);
        mail.setSubject("Test");
        mail.setText("Проверка!");

        new Mailer("smtp.gmail.com", 25, username, password, TransportStrategy.SMTP_TLS).sendMail(mail);
        new Mailer("smtp.gmail.com", 587, username, password, TransportStrategy.SMTP_TLS).sendMail(mail);
        new Mailer("smtp.gmail.com", 465, username, password, TransportStrategy.SMTP_SSL).sendMail(mail);

    }
}
