import java.rmi.*;
public interface MyRemote extends Remote {
	public String sayHello(String words) throws RemoteException;
}