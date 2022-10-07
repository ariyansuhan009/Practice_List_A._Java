package TCP_Client_Server_Prog;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws Exception{
        try{
            //Socket soc = new Socket("127.0.0.1",8080);
            Socket soc = new Socket(InetAddress.getLocalHost(),8080);
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream() ));
            System.out.println(in.readLine());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
