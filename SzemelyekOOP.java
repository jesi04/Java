/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szemelyekoop;

/**
 *
 * @author jesch
 */
public class SzemelyekOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Szemelyek Balazs = new Szemelyek();
            
        Balazs.eletkor = 20;
        Balazs.hajszin = "barna";
        Balazs.hazasE = false;
        Balazs.iq = 200;
        Balazs.magassag = 192;
        Balazs.nem = "férfi";
        Balazs.testsuly = 75;
        
        Tanulok Elemer = new Tanulok();
        
        Elemer.eletkor = 20;
        Elemer.nem = "férfi";
        Elemer.osztondijasE = true;
        
        System.out.println(Balazs.eletkor);
        System.out.println(Elemer.osztondijasE);
    }
    
}
