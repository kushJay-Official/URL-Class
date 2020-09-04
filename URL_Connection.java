import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URL_Connection {
    public static void main(String[] args)throws Exception {
        try{
            URL url =new URL("https://www.java.com/en/download/installed.jsp");
            URLConnection urlConnection=url.openConnection();
            InputStream stream=urlConnection.getInputStream();
            int i;
            while((i=stream.read())!=-1)
                System.out.print((char)i);

        }
        catch (Exception e){
            System.out.print(e);
        }
    }
}
