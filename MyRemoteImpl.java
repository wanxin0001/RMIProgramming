import java.rmi.*;
import java.rmi.server.*;


public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
	private int i = 0;
	public String sayHello(String words) {
		System.out.println("[client] " + words);
		System.out.println("This is the " + i + " time;");
		i++;
		return "Server says, 'Hey'";
	}

	public MyRemoteImpl() throws RemoteException {}

	public static void main(String[] args) {
		int i = 0;
		try {
			MyRemote service = new MyRemoteImpl();
			Naming.rebind("RemoteHello", service);
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}