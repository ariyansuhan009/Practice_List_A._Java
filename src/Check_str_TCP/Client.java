package Check_str_TCP;


import java.io.*;
import java.net.*;
import java.util.*;

public class Client {
    public static void main(String[] args) throws Exception{
        Socket s=new Socket("localhost",8080);
        PrintStream ps=new PrintStream(s.getOutputStream());
        ps.println("wow");
        InputStream is=s.getInputStream();
        BufferedReader br=new BufferedReader(new InputStreamReader(is));
        String str;
        while((str=br.readLine())!=null)
        {
            System.out.println(str);
        }
        ps.close();
        s.close();
    }
}
