package co.edu.escuelaing.arsw.tallernet.sockets;

import com.sun.corba.se.impl.naming.cosnaming.NamingUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MathServer {
    public static void main(String[] args) throws IOException {
        String op = "cos";
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(35000);
        } catch (IOException e) {
            System.err.println("Could not listen on port: 35000.");
            System.exit(1);
        }
        Socket clientSocket = null;
        try {
            clientSocket = serverSocket.accept();
        } catch (IOException e) {
            System.err.println("Accept failed.");
            System.exit(1);
        }
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String inputLine, outputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.println("Mensaje:" + inputLine);
            try {
                Long numero = Long.parseLong(inputLine);
                if (op.equals("cos")){
                    outputLine = "Respuesta: " + op + Math.cos(numero);
                }else if (op.equals("sin")){
                    outputLine = "Respuesta: " + op + Math.sin(numero);
                }else if (op.equals("tan")){
                    outputLine = "Respuesta: " + op + " "+ Math.tan(numero);
                }else{
                    outputLine = "Respuesta:  Sin resultado ";
                }
                out.println(outputLine);
                if (outputLine.equals("Respuesta: Bye."))
                    break;
            }catch (NumberFormatException e){
                op=inputLine;
                outputLine= "Respuesta: " + "funcion "+op;
                out.println(outputLine);
            }
        }
        out.close();
        in.close();
        clientSocket.close();
        serverSocket.close();
    }
}
