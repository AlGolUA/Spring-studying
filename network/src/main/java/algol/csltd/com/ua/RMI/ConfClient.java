package algol.csltd.com.ua.RMI;

/**
 * Created by admin on 30.04.2017.
 */

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.rmi.*;
import java.awt.event.*;
import java.awt.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ConfClient {
    /* Объявляются переменные */
    static JFrame frame;
    static JPanel panel;
    JLabel lbLastName;
    JLabel lbFirstName;
    JLabel lbOrganization;
    JLabel lbReportTheme;
    JLabel lbEmail;
    JTextField txtLastName;
    JTextField txtFirstName;
    JTextField txtOrganization;
    JTextField txtReportTheme;
    JTextField txtEmail;
    JButton submit;

    /* Определяется конструктор по умолчанию */
    public ConfClient() {
/* Создается JFrame */
        frame = new JFrame("Регистрация участника конференции");
        panel = new JPanel();
/* Набор менеджеров разметки */
        panel.setLayout(new GridLayout(5, 2));
        frame.setBounds(100, 100, 400, 200);
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
/* Define the swing components on the JFrame */
        lbLastName = new JLabel("Фамилия");
        lbFirstName = new JLabel("Имя");
        lbReportTheme = new JLabel("Тема доклада");
        lbOrganization = new JLabel("Организация");
        lbEmail = new JLabel("Емайл");
        txtLastName = new JTextField(15);
        txtFirstName = new JTextField(15);
        txtOrganization = new JTextField(70);
        txtReportTheme = new JTextField(100);
        txtEmail = new JTextField(15);
        submit = new JButton("Отправить");
/* Добавление в панель компонентов swing */
        panel.add(lbLastName);
        panel.add(txtLastName);
        panel.add(lbFirstName);
        panel.add(txtFirstName);
        panel.add(lbOrganization);
        panel.add(txtOrganization);
        panel.add(lbReportTheme);
        panel.add(txtReportTheme);
        panel.add(lbEmail);
        panel.add(txtEmail);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.getContentPane().add(submit, BorderLayout.SOUTH);
        frame.setVisible(true);
        submit.addActionListener(new ButtonListener());
    }

    /* Создание класса ButtonListener */
    class ButtonListener implements ActionListener {
        /* Определение метода actionPerformed() */
        public void actionPerformed(ActionEvent evt) {
            try {
//                Registry registry = LocateRegistry.getRegistry("127.0.0.1:63245");
//                ConfServer server = (ConfServer) registry.lookup("ConfServer");
                ConfServer server = (ConfServer) Naming.lookup("//localhost/ConfServer");
// Получение удаленного объекта
// Если сервер размещен на удаленном компьютере,
// то вместо localhost указывается имя
// хоста сервера
//                ConfServer server = (ConfServer) Naming.lookup("rmi://localhost/ConfServer");
// Формирование сведений о регистрации для
// отправки на сервер
                RegistrationInfo registrationInfo = new RegistrationInfo(
                        txtFirstName.getText(), txtLastName.getText(),
                        txtOrganization.getText(), txtReportTheme.getText(),
                        txtEmail.getText());
// Вызов удаленного метода
                for (int i = 0; i < 10; i++) {
                    int count = server.registerConfParticipant(registrationInfo);
                }
                JOptionPane.showMessageDialog(
                        frame,
                        "Регистрация выполне-на успешно"
                                + "\nКоличество зарегистрированных участников - "
                                + 1 + "\nСпасибо за участие");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(frame, "Ошибка");
                System.out.println(e);
            }
        }
    }

    // Определение метода main()
    public static void main(String args[]) {
// Создание объекта класса Client
        new ConfClient();
    }
}