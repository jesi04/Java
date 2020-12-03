/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osszetettfeladat2;
import java.util.Scanner;
/**
 *
 * @author jesch
 */
public class OsszetettFeladat2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\tÖSSZETETT FELADAT \n\tKészítette: JB 1/13C");
        Scanner bemenet = new Scanner(System.in);
        char valasz = 0;
        do{
         
        //2. A tömbök elemszámát is véletlenszám generátorral állítsd elő 10 és 30 között.
        int elemszam = (int) (Math.random()*10)+20;
        
        // 1. Hozz létre két tömböt: szamok1, szamok2 néven!
        int[] szamok1 = new int [elemszam];
        int[] szamok2 = new int [elemszam];
        
        //3. Az elemek a -50 és +50 értéktartományba essenek.
        for (int i = 0; i < elemszam; i++) {
            szamok1[i] = (int) (Math.random()*100)-50;
            szamok2[i] = (int) (Math.random()*100)-50;
        }
        
        //4. Írasd ki a két tömböt egy-egy sorban ügyelve, hogy az elemek helyiérték szerint egymás alá kerüljenek.
        System.out.println("\n\nA tömb1 elemei: ");
        for (int i = 0; i < elemszam; i++) {
            System.out.print(String.format("%,3d",szamok1[i])+" ");
        }
        
        System.out.println("\nA tömb2 elemei: ");
        for (int i = 0; i < elemszam; i++) {
            System.out.print(String.format("%,3d",szamok2[i])+" ");
        }
        
        //5. Helyezd át a két tömb öttel osztható páros számait egy ujTomb nevű tömbbe,....  (kiválogatás)
        int ujTomb []= new int [elemszam];
        int ujTombDb = 0;
        for (int i = 0; i < elemszam; i++) {
            if (szamok1[i] % 5 == 0 && szamok1[i] % 2 == 0 && szamok1[i]!=0){
                ujTomb[ujTombDb++]=szamok1[i];
            }
        }
        for (int i = 0; i < elemszam; i++) {
            if (szamok2[i] % 5 == 0 && szamok2[i] % 2 == 0 && szamok2[i]!=0){
                ujTomb[ujTombDb++] = szamok2[i];
            }
        }
        
        for (int i = 0; i < ujTombDb-1; i++) {
            for (int j = 0; j <ujTombDb-i-1; j++) {
                if (ujTomb[j]>ujTomb[j+1]){
                    int temp=ujTomb[j];
                    ujTomb[j]=ujTomb[j+1];
                    ujTomb[j+1]=temp;
                }
            }
        }
        
        //....majd írasd ki sorbarendezve.(sorba rendezés
        System.out.println("\nAz ujTomb elemei sorba rendezve:");
        for (int i = 0; i < ujTombDb; i++) {
            System.out.print(String.format("%,3d",ujTomb[i])+" ");
        }
        
        //6. Írasd ki a legkisebb és legnagyobb számot az ujTomb-ből.
        int legkisebb = ujTomb[0];
        int legnagyobb = ujTomb[ujTombDb-1];
        
        System.out.println("\n\nAz ujTomb legkisebb eleme: "+legkisebb);
        System.out.println("Az ujTomb legnagyobb eleme: "+legnagyobb);
        
        //7. Írasd ki, többszöröse-e a legnagyobb szám a legkisebbnek?
        if (legnagyobb % legkisebb == 0){
            System.out.println("\nA legnagyobb szám többszorese a legkisebbnek.");
        }
        else if (legnagyobb == legkisebb) {
            System.out.println("\nA legnagyobb és a legkisebb szám ugyan az.");
        }
        else {
            System.out.println("\nA legnagyobb szám nem többszöröse a legkisebbnek.");
        }
        
        //9. Kérdezd meg, szeretné-e újrafuttatni a felhasználó a programot (i/n)! Ha igen, hajrá...
        System.out.print("\nÚjra lefuttatja a programot? i/n: ");
            valasz = bemenet.next().charAt(0);
            
        } while ((valasz == 'i') || (valasz == 'I'));
    }   
}
