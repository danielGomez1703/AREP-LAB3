/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.escuelaing.arep.tallernet;
import co.edu.escuelaing.arep.tallernet.sockets.HTTPServer;
import java.io.IOException;
import java.net.ServerSocket;

/**
 *
 * @author danip
 */
public class HTTPServerMain {
    
   public static void main(String[] args) throws IOException {
        
       int port =getPort();
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            HTTPServer server  = new HTTPServer(serverSocket);
            server.start();
        } catch (IOException e) {
            System.err.println("Could not listen on port "+ port );
            System.exit(1);
        } 
   }
   /**
    * retorna el puerto de eleccion en caso dado que este disponible
    * @return  puerto para servidor web
    */
   public static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 35000; //returns default port if heroku-port isn't set(i.e. on localhost)
    }
}