/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;
import java.util.Scanner;
/**
 *
 * @author jesch
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner bemenet = new Scanner(System.in);
        
        int elemszam = 20;
        int valasz;
        int szamok[] = new int [elemszam];
        
        for (int i = 0; i < elemszam; i++) {
            szamok[i] = (int) (Math.random()*100)-50;         
        }
        
        System.out.println("A szamok tömb elemei: ");
        for (int i = 0; i < elemszam; i++) {
            System.out.print(String.format("%,3d", szamok[i])+" ");
        }
        
        System.out.println("\n\nMit szeretne tenni az adatokkal? ");
        System.out.println("1 - összeget számoltatni: tömbök összegét kiíratni");
        System.out.println("2 - szélsőértékeket kiíratni: legkisebb és legnagyobb értéket kiíratni");
        System.out.println("3 - van-e benne 40-50: megtudni, tartalmaz-e számot 40 és 50 között?");
        System.out.println("4 - 5-tel osztható páros számok db-száma: mennyi?");
        System.out.println("5 - adott számot tartalmazza-e: egy felhasználótól bekért számról mondja meg, h tartalmazza-e a tömb, s ha igen, mi az indexe.");
            
        System.out.print("\nA választott művelet száma: ");
            valasz = bemenet.nextInt();
        
        if (valasz == 1) {
            int osszeg = 0;
            
            for (int i = 0; i < elemszam; i++) {
                osszeg+=szamok[i];
            }
            System.out.println("\nA szamok tömb elemeinek összege: "+osszeg);         
        }
            
        else if (valasz == 2) {
            int legnagyobb = 0;
            int legkisebb = szamok[0];
            
            for (int i = 0; i < elemszam; i++) {
                if (szamok[i] > legnagyobb) {
                    legnagyobb = szamok[i];
                }
            }
            
            System.out.println("\nA legnagyobb szám: "+legnagyobb);
            
            for (int i = 0; i < elemszam; i++) {
                if (szamok[i] < legkisebb) {
                    legkisebb = szamok[i];
                }
            }
            
            System.out.println("A legkisebb szám: "+legkisebb);      
        }
            
        else if (valasz == 3) {
            int negyvenFolott [] = new int [elemszam];
            int negyvenFolottDb = 0;
            for (int i = 0; i < elemszam; i++) {
                if (szamok[i] > 40) {
                    negyvenFolott[negyvenFolottDb++] = szamok[i];
                }
            }
            
            if (negyvenFolottDb >= 1) {
                System.out.print("\nA számok 40 és 50 között: ");
                
                for (int i = 0; i < negyvenFolottDb; i++) {
                    System.out.print(String.format("%,3d", negyvenFolott[i])+" ");
                } 
            }
            else{
                System.out.println("\nNincs szám 40 és 50 között.");
            }
            
        }
        
        else if (valasz == 4) {
            int parosOttelDb = 0;
            
            for (int i = 0; i < elemszam; i++) {
                if (szamok[i] % 5 == 0 && szamok[i] % 2 == 0) {
                    parosOttelDb++;
                }
            }           
            System.out.println("\nAz öttel osztható páros számok darabszáma: "+parosOttelDb);          
        }
        
        else if (valasz == 5) {
            int valasztottSzam;
            
            System.out.print("\nAdja meg a kívánt számot: ");
                valasztottSzam = bemenet.nextInt();
            
            for (int i = 0; i < elemszam; i++) {
                if (valasztottSzam == szamok[i]) {
                    System.out.print("\nA választott szám szerepel a tömbben, az indexe: "+i);               
                }             
            }
        }
         System.out.println("");
        
        
        
        bemenet.close();    
    }        
    
}     
        
        
        
        
        
        
       
   

 