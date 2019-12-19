import java.net.*;
import java.io.*;
import java.lang.*;

public class client
{
   public static void main(String args[]) throws IOException
   {
       Socket s=null;
       BufferedReader b=null;

       try
       {
           s=new Socket(InetAddress.getLocalHost(),98);
           b=new BufferedReader(new InputStreamReader(s.getInputStream()));
       }

       catch(UnknownHostException u)
       {
           System.err.println("I don't know host");
           System.exit(0);
       }
       String str1;
       while((str1=b.readLine())!=null)
       {
           System.out.println(str1.toUpperCase());
       }
       b.close();
       s.close();
   }
}