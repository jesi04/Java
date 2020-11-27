/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package megszamlalas;

/**
 *
 * @author jesch
 */
public class Megszamlalas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int tomb2[] = new int [5];
        int db=0;
        int parosDb = 0;
        int paratlanDb = 0;
        
        System.out.println("A megszámlálás tétele. \nKészítette: Jescheta Balázs.");
        for (int i = 0; i < 5; i++){
            tomb2[i] = (int) (Math.random()*99)+1;
            db++;
            if (tomb2[i] % 2 == 0){
                parosDb++;
            }
            else if (tomb2[i]%2==1) {
                paratlanDb++;
            }
            
        }
        int i = 0;
        System.out.println("\nA tömbök elemei: ");
        for (; i < 5; i++) {  
            
            if (tomb2[i]>=10){
                System.out.print((i+1)+". ");
                if (tomb2[i]%2 != 0) {
                System.out.println("páratlan ");
                }
                else{
                    System.out.println(tomb2[i]+" ");
                }
                
                
            }
            else{
                System.out.print((i+1)+". ");
                if (tomb2[i]%2 != 0) {
                System.out.println("páratlan ");
                }
                else{
                    System.out.println(" "+tomb2[i]+" "); 
                }
                                
            }
            
        }
        System.out.println("");
        System.out.println(db);
        System.out.println(i);
        System.out.println("Ebből a tömbből "+parosDb+" szám páros.");
    }  
}
