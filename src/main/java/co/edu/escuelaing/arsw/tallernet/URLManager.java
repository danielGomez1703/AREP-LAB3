/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.escuelaing.arsw.tallernet;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danip
 */
public class URLManager {
    
    public static void main (String[] args){
        String site = "http://ldbn.escuelaing.edu.co/index.html";
        try {
            URL personalSite = new URL("http://ldbn.escuelaing.edu.co:80/foto.png?name=user&color=red#name");
            System.out.println("Protocolo : "+ personalSite.getProtocol());
            System.out.println("Authority : "+ personalSite.getAuthority());
            System.out.println("Host : "+ personalSite.getHost());
            System.out.println("Port  : "+ personalSite.getPort());
            System.out.println("Path : "+ personalSite.getPath());
            System.out.println("Query : "+ personalSite.getFile());
            System.out.println("File : "+ personalSite.getFile());
            System.out.println("Ref : "+ personalSite.getRef());
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(URLManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
