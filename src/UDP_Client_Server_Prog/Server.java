package UDP_Client_Server_Prog;

import java.net.*;
import java.io.*;


public class Server {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(8080);
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String str=br.readLine();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb=sb.reverse();
        PrintStream ps = new PrintStream(s.getOutputStream());
        ps.println(sb);
        ps.close();
        ss.close();
        s.close();

    }
}
