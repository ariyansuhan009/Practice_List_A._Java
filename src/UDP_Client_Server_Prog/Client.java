package UDP_Client_Server_Prog;


import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception{
        Socket s=new Socket("localhost",8080);
        PrintStream ps=new PrintStream(s.getOutputStream());
        ps.println("Hello World");
        InputStream is=s.getInputStream();
        BufferedReader br=new BufferedReader(new InputStreamReader(is));
        System.out.println(br.readLine());
        ps.close();
        s.close();
    }
}
