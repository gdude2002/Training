package me.gserv.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

class Client {

    public static void main(String[] args) {
        String host = (args.length < 1) ? null : args[0];

        try {
            Registry registry = LocateRegistry.getRegistry(host);
            DOTW stub = (DOTW) registry.lookup("DOTW");
            String response = stub.dayOfTheWeek();
            System.out.println("Response: " + response);
        } catch (Exception e) {
            System.out.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
