/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tombbeolvasas;
import java.io.*;
/**
 *
 * @author jesch
 */
public class TombbeOlvasas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        
        try{
            raf = new RandomAccessFile("113C.txt", "r");
            raf.close();
        }
        catch(IOException e){
            System.err.println("HIBA");
        }
        
    }
    
}
