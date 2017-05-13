package algol.csltd.com.ua.TCPIP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;

/**
 * Created by admin on 30.04.2017.
 */
public class TCPIPServer extends Thread {
    // Объявляется ссылка
// на объект - сокет сервера
    ServerSocket serverSocket = null;
    /**
     * Конструктор по умолчанию
     */
    public TCPIPServer() {
        try {
// Создается объект ServerSocket, который получает
// запросы клиента на порт 1500
            serverSocket = new ServerSocket(1500);
            System.out.println("Starting the server ");
// Запускаем процесс
            start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /** 41
     * Запуск процесса
     */
    public void run() {
        try {
            while (true) {
// Ожидание запросов соединения от клиентов
                Socket clientSocket = serverSocket.accept();
                System.out.println("Connection accepted from " + clientSocket.getInetAddress().getHostAddress());
// Получение выходного потока,
// связанного с объектом Socket
                ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());
// Создание объекта для передачи клиентам
                DateMessage dateMessage = new DateMessage(Calendar.getInstance().getTime(), "Текущая дата/время на сервере");
// Запись объекта в выходной поток
                out.writeObject(dateMessage);
                out.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String args[]) {
// Запуск сервера
        new TCPIPServer();
    }
}