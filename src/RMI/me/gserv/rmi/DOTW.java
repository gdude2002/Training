package me.gserv.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;


interface DOTW extends Remote {
    String dayOfTheWeek() throws RemoteException;
}
