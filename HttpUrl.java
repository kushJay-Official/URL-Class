package urlclass;

import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUrl {
    public static void main(String[] args)throws Exception {
        try{
            URL url =new URL("https://www.jetbrains.com/idea/");
            HttpURLConnection httpURLConnection=(HttpURLConnection)url.openConnection();
                    for(int i=1;i<9;i++)
                        System.out.println(httpURLConnection.getHeaderFieldKey(i)+"="+httpURLConnection.getHeaderField(i));
            httpURLConnection.disconnect();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
