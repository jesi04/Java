/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orai;

/**
 *
 * @author jesch
 */
public class Orai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int tomb1[]= new int [5];
       
       tomb1[0] = 11;
       tomb1[1] = 22;
       tomb1[2] = 33;
       tomb1[3] = 44;
       tomb1[4] = 55;
       
       int tomb2[] = new int [5];
        for (int i = 0; i < 5; i++) {
            tomb2[i] = (int) (Math.random()*99)+1;
        }
        
        System.out.println("Készítette JB 1/13C");
        
        //tomb1 
        int osszeg1 = 0;
        System.out.print("\nA tömb1 elemei: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(String.format("%,2d",tomb1[i])+" ");
            osszeg1=osszeg1+tomb1[i];
        }
        
        //tomb2
        int osszeg2 = 0;
        System.out.print("\nA tomb2 elemei: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(String.format("%,2d",tomb2[i])+" ");
            osszeg2=osszeg2+tomb2[i];
        }
        
        System.out.println("\n\nA tomb1 elemeinek összege: "+osszeg1);
        System.out.println("A tomb2 elemeinek összege: "+osszeg2);
        System.out.println("\n\nA tomb1 elemeinek átlaga: "+osszeg1/tomb1.length);
        System.out.println("A tomb2 elemeinek átlaga: "+osszeg2/tomb2.length);
        
        
        
    }
    
}
