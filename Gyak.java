

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyak;

/**
 *
 * @author 20g_jeschetab
 */
public class Gyak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tomb1[] = {42,8,56,6,75};
        int tomb2[] = new int [5];
        int osszeg1 = 0;
        int osszeg2 = 0;
        
        for (int i = 0; i < 5; i++){
            tomb2[i] = (int) (Math.random()*99);
            //System.out.print(tomb2[i]+" ");
        }
        
        for (int i = 0; i < 5; i++) {  
            System.out.print("A tömbök "+(i+1)+". elemei: ");
            if (tomb1[i]>=10){
                System.out.print(tomb1[i]+" ");
                osszeg1=osszeg1+tomb1[i];
            }
            else{
                System.out.print(" "+tomb1[i]+" ");  
                osszeg1=osszeg1+tomb1[i];
            }
            if (tomb2[i]>=10){
                System.out.print(tomb2[i]+" ");
                osszeg2=osszeg2+tomb2[i];
            }
            else {
                System.out.print(" "+tomb2[i]+" ");
                osszeg2=osszeg2+tomb2[i];
            }
            if (tomb1[i]>tomb2[i]){
                System.out.println(" Első tömb eleme nagyobb, ennyivel: "+(tomb1[i]-tomb2[i]));
            }
            else if (tomb2[i]>tomb1[i]){
                System.out.println(" Második tömb eleme nagyobb, ennyivel: "+(tomb2[i]-tomb1[i]));
            }
            else
                System.out.println(" Egyenlőek.");
        }
        System.out.println("\n\nA tomb1 elemeinek összege: "+osszeg1);
        System.out.println("A tomb2 elemeinek összege: "+osszeg2);
        System.out.println("\n\nA tomb1 elemeinek átlaga: "+osszeg1/tomb1.length);
        System.out.println("A tomb2 elemeinek átlaga: "+osszeg2/tomb2.length);
        
        
        
    }
    
}