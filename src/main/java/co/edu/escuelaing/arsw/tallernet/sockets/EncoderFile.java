/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.escuelaing.arsw.tallernet.sockets;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jairo Gomez
 */
public class EncoderFile {
    
   
    /**
     * este archivo retorna la iamgen para poder hacer el POST de la imagen
     * @param url path de donde se encunetra el archivo
     * @return  cadena del archivo en base64
     */
    
     public String EncodeImage2(String url){
        String encodedfile = null;
            try {
                File image = new File(url);
                FileInputStream fileInputStreamReader = new FileInputStream(image);
                byte[] bytes = new byte[(int)image.length()];
                fileInputStreamReader.read(bytes);           
                encodedfile = Base64.getEncoder().encodeToString(bytes).toString();
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            return encodedfile;
        }
     /**
      * apartir de un path dado tipo html lo pasaa una cadena o archivo de una linea
      * @param path archivo a transcribir
      * @return la cadena de la estructura html 
      */
     public String EncodeHtml(String path){
        BufferedReader file;
        String html="";
        try {
            FileReader fileread = new FileReader( new File (path));
            file = new BufferedReader(fileread);
            String line;
            while((line=file.readLine())!=null){    
                html=html.concat(line);
            }
            
        } catch (FileNotFoundException ex) {
           
        } catch (IOException ex) {
            Logger.getLogger(EncoderFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return html;
        
       
    }
    
    
}
