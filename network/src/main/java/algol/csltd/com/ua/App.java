package algol.csltd.com.ua;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        try {
// Создается объект InetAddress, используя getLocalHost()
// статический метод класса InetAddress
            InetAddress address = InetAddress.getLocalHost();
// Получение IP адреса хоста
            String addressHost = address.getHostAddress();
// Вывод IP адреса хоста
            System.out.println("Вывод IP адреса хоста " + addressHost);
// Вывод имени хоста
            System.out.println("Вывод имени хоста " + address.getHostName());
        } catch (UnknownHostException e) {
            System.out.println("Error");
        }
    }
}