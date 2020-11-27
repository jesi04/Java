package kivalogatas;
import  java.util.Scanner;

public class Kivalogatas {

    public static void main(String[] args) {
        Scanner bemenet;
        bemenet = new Scanner(System.in);
        
        System.out.println("\t KIVÁLOGATÁS TÉTELE\n");
        
        int mennyi;
        
        System.out.print("Hány jegyet írjon ki?  ");
            mennyi = bemenet.nextInt();
            
        int erdemjegyek[]= new int [mennyi]; 
        int egyesek [] = new int [mennyi];
        int kettesek [] = new int [mennyi];
        int harmasok [] = new int [mennyi];
        int negyesek [] = new int [mennyi];
        int otosok [] = new int [mennyi];
        
        for (int i = 0; i < mennyi; i++) {
            erdemjegyek[i]= (int)(Math.random()*5)+1;
        }
        System.out.print("\nA jegyek: ");
        for (int i = 0; i < mennyi; i++) {
            System.out.print(erdemjegyek[i]+" ");
        }
        
        System.out.println("\n");
        //Egyesek
        int egyesekDb=0;
        for (int i = 0; i < mennyi; i++) {
            if (erdemjegyek[i]==1) {
                egyesek[egyesekDb++]=erdemjegyek[i];
            }
        }
        System.out.print("Egyesek tömb elemei: ");
        
            if (egyesekDb > 0){
                for (int i = 0; i < egyesekDb; i++) {
                    System.out.print(egyesek[i]+" ");               
                }
            }
            else {
                System.out.print("nincs 1-es");
            }
        
        System.out.println("");
        //Kettesek
        int kettesekDb=0;
        for (int i = 0; i < mennyi; i++) {
            if (erdemjegyek[i]==2) {
                kettesek[kettesekDb++]=erdemjegyek[i];
            }
        }
        System.out.print("Kettesek tömb elemei: ");
        
            if (kettesekDb > 0){
                for (int i = 0; i < kettesekDb; i++) {
                    System.out.print(kettesek[i]+" ");               
                }
            }
            else {
                System.out.print("nincs 2-es");
            }
            
        System.out.println("");
        
        //Hármasok
        int harmasokDb=0;
        for (int i = 0; i < mennyi; i++) {
            if (erdemjegyek[i]==3) {
                harmasok[harmasokDb++]=erdemjegyek[i];
            }
        }
        System.out.print("Hármasok tömb elemei: ");
        
            if (harmasokDb > 0){
                for (int i = 0; i < harmasokDb; i++) {
                    System.out.print(harmasok[i]+" ");               
                }
            }
            else {
                System.out.print("nincs 3-as");
            }
        
        System.out.println("");
        
        //Négyesek
        int negyesekDb=0;
        for (int i = 0; i < mennyi; i++) {
            if (erdemjegyek[i]==4) {
                negyesek[negyesekDb++]=erdemjegyek[i];
            }
        }
        System.out.print("Négyesek tömb elemei: ");
        
            if (kettesekDb > 0){
                for (int i = 0; i < negyesekDb; i++) {
                    System.out.print(negyesek[i]+" ");               
                }
            }
            else {
                System.out.print("nincs 4-es");
            }
        
        System.out.println("");
        
        //Ötösök
        int otosokDb=0;
        for (int i = 0; i < mennyi; i++) {
            if (erdemjegyek[i]==5) {
                otosok[otosokDb++]=erdemjegyek[i];
            }
        }
        System.out.print("Ötösök tömb elemei: ");
        
            if (otosokDb > 0){
                for (int i = 0; i < otosokDb; i++) {
                    System.out.print(otosok[i]+" ");               
                }
            }
            else {
                System.out.print("nincs 5-ös");
            }
        
        System.out.println("\n\nEgyesek száma: "+egyesekDb);
        System.out.println("Kettesek száma: "+kettesekDb);
        System.out.println("Hátmasok száma: "+harmasokDb);
        System.out.println("Négyesek száma: "+negyesekDb);
        System.out.println("Ötösök száma: "+otosokDb);
        
        
        
        bemenet.close();
    }
    
}
