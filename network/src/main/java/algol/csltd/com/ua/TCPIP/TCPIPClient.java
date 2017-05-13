package algol.csltd.com.ua.TCPIP;

import java.io.*;
import java.net.Socket;

/**
 * Created by admin on 30.04.2017.
 */
public class TCPIPClient {
    public static void main(String args[]) {
        try {
// Создается объект Socket
// для соединения с сервером
            Socket clientSocket = new Socket("localhost", 1500);
// Получаем ссылку на поток, связанный с сокетом
            ObjectInputStream in = new ObjectInputStream(clientSocket.getInputStream());
// Извлекаем объект из входного потока
            DateMessage dateMessage = (DateMessage) in.readObject();
// Выводим полученные данные на консоль
            System.out.println(dateMessage.getMessage());
            System.out.println(dateMessage.getDate());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}