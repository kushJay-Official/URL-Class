package urlclass;

import java.net.InetAddress;

public class GetIP_Address {
    public static void main(String[] args) {
        try{
            InetAddress ip=InetAddress.getByName("www.google.com");

            System.out.println("Host Name:"+ip.getHostName()+"\n"+"IP Address:"+ip.getHostAddress());
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
