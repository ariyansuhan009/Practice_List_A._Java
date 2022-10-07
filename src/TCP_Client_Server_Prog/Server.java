package TCP_Client_Server_Prog;

import java.io.*;
import java.net.*;
import java.util.*;

public class Server{
   public static void main(String[] args) throws IOException{
       ServerSocket s = new ServerSocket(8080);

       while(true){
           System.out.println("Waiting for Connection....");
           Socket soc = s.accept();
           PrintWriter out = new PrintWriter(soc.getOutputStream(),true);

           out.println("Server Date: "+(new Date()).toString()+"\n");
           out.close();
           soc.close();
       }
   }
}
