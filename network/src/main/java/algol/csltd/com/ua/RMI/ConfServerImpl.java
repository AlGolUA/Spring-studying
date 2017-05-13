package algol.csltd.com.ua.RMI;

/**
 * Created by admin on 30.04.2017.
 */
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.security.Permission;
import java.sql.*;
public class ConfServerImpl extends UnicastRemoteObject implements ConfServer {
    private static final long serialVersionUID = 1L;
    /* Определяется конструктор по умолчанию */
    public ConfServerImpl() throws RemoteException {
        super();
    }
    /* Определение удаленного метода */
    public int registerConfParticipant(RegistrationInfo registrationInfo)
            throws RemoteException {
        System.out.println(registrationInfo);
        return 1;
//        try {
//// Регистрация драйвера БД Derby
//            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
//// Получение соединения с БД
//            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/myDB;create=true;user=me;password=mine");
//// Запись полученных данных в БД
//            PreparedStatement st = con
//                    .prepareStatement("insert into registra-tion_info "
//                            + "(first_name, last_name, organization, "
//                            + "report_theme, email) "
//                            + "values (?, ?, ?, ?, ?)");
//            st.setString(1, registrationInfo.getFirstName());
//            st.setString(2, registrationInfo.getLastName());
//            st.setString(3, registrationInfo.getOrganization());
//            st.setString(4, registrationInfo.getReportTheme());
//            st.setString(5, registrationInfo.getEmail());
//            st.executeUpdate();
//            st.close();
//// Получение количества зарегистрированных участников
//            Statement st1 = con.createStatement();
//            int count = 0;
//            ResultSet rs = st1.executeQuery("Select count(*) from reg-istration_info");
//            if (rs.next()) {
//                count = rs.getInt(1);
//            }
//            st1.close();
//            return count;
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new RemoteException(e.getMessage(), e);
//        }
    }
    /* Метод main() */
    public static void main(String args[]) {
        try {
// Указание расположения классов RMI
//            System.setProperty("java.rmi.server.codebase", "file:///c:/Users/admin/IdeaProjects/Spring-studying/classes/production/network/");
// Установка менеджера безопасности (если не установлен):
// Создается новый объект анонимного
// класса RMISecurityManager
// и переопределяется метод checkPermission.
// Метод не содержит кода, следовательно, не определяет
// никаких ограничений
//            if (System.getSecurityManager() == null) {
//                System.setSecurityManager(new SecurityManager() {
//                    public void checkConnect(String host, int port,
//                                             Object context) {
//                    }
//                    public void checkConnect(String host, int port) {
//                    }
//                    public void checkPermission(Permission perm) {
//                    }
//                });
//            }
//
// Создание экземпляра класса ConfServerImpl
            ConfServerImpl instance = new ConfServerImpl();
// Регистрация объекта RMI под именем ConfServer
//            ConfServer stub = (ConfServer) UnicastRemoteObject.exportObject(instance, 0);
            Naming.rebind("//localhost/ConfServer", instance);
            System.out.println("Сервис зарегистрирован");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}