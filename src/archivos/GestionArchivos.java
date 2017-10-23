/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Estudiante
 */
public class GestionArchivos {
    
    public void listar (File file){
        if(file.isDirectory()){
                String archivos[] = file.list();
                for (String archivo : archivos){
                    this.listar(new File(file.getAbsolutePath()+"/"+archivo));
                }
        }else{
            System.out.println(file.getName());
        }
    }
    
    public static void main(String[] args){
        File file = new File("raiz");
        File f1 = new File("raiz/C1/C4/a.txt");
        File f2 = new File("raiz/C1/C4/b.txt");
        File f3 = new File("raiz/C1/C4/c.txt");
        File f4 = new File("raiz/C2/C5/e.txt");
        File f5 = new File("raiz/C2/C5/f.txt");
        if(f1.exists()){
        }else{
            try{
                file.createNewFile();
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }
        if(f2.exists()){
        }else{
            try{
                file.createNewFile();
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }
        if(f3.exists()){
        }else{
            try{
                file.createNewFile();
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }
        if(f4.exists()){
        }else{
            try{
                file.createNewFile();
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }
        if(f5.exists()){
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
