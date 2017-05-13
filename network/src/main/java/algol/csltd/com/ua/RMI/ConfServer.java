package algol.csltd.com.ua.RMI;

/**
 * Created by admin on 30.04.2017.
 */
import java.rmi.*;
public interface ConfServer extends Remote {
    int registerConfParticipant(RegistrationInfo registrationInfo)
            throws RemoteException;
}