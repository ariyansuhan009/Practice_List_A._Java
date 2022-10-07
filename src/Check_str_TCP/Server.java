package Check_str_TCP;

import java.io.*;
import java.net.*;
import java.util.*;

public class Server {
    public static void main(String[] args) throws Exception{
        ServerSocket ss=new ServerSocket(8080);
        Socket s=ss.accept();
        InputStream is=s.getInputStream();
        PrintStream ps=new PrintStream(s.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(is));
        String str=br.readLine();
        String b="";
        int n=str.length();
        for(int i=n-1;i>=0;i--)
        {
            b=b+str.charAt(i);
        }
        if(str.equalsIgnoreCase(b))
        {
            ps.println(str);

            ps.println("The string is palindrome.");
        }
        else
        {

            ps.println(str);

            ps.println("The string is not palindrome.");
        }
        ps.close();
        ss.close();
        s.close();

    }
}
