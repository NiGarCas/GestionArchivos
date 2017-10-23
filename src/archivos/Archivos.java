/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.*;

/**
 *
 * @author Estudiante
 */
public class Archivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        File file = new File("raiz");
        if(file.exists()){
            if(file.isDirectory()){
                String archivos[] = file.list();
                for (String archivo : archivos){
                    System.out.println(archivo);
                }
            }
            System.out.println(file.getAbsolutePath());
        }else{
            try{
                file.createNewFile();
            }catch(IOException ex){
                ex.printStackTrace();
            }
            
        }
        // TODO code application logic here
    }
    
}
