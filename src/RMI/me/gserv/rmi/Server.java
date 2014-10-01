package me.gserv.rmi;

import java.rmi.RemoteException;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Server implements DOTW {
    @Override
    public String dayOfTheWeek() throws RemoteException {
        Date d = new Date();
        SimpleDateFormat f = new SimpleDateFormat("EEEE");

        return String.format("%s, biatch", f.format(d));
    }

    public static void main(String args[]) {

        try {
            Server obj = new Server();
            DOTW stub = (DOTW) UnicastRemoteObject.exportObject(obj, 0);

            // Bind the remote object's stub in the registry
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("DOTW", stub);

            System.err.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
