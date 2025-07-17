package java0717;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {
    public static void main(String[] args) {
        InetAddress inetaddr = null;
        try {
            inetaddr = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        System.out.println(inetaddr.getHostName());
        System.out.println(inetaddr.getHostAddress());
    }
}
