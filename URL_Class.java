package urlclass;

import java.net.URL;

public class URL_Class {
    public static void main(String[] args)throws Exception {
        try{
            URL url= new URL("https://chrome.google.com/webstore/category/extensions");
            System.out.println("Protocol: "+url.getProtocol());
            System.out.println("Host Name: "+url.getHost());
            System.out.println("Port Name: "+url.getPort());
            System.out.println("Default Port Name: "+url.getDefaultPort());
            System.out.println("Query String: "+url.getQuery());
            System.out.println("Path: "+url.getPath());
            System.out.println("File: "+url.getFile());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
