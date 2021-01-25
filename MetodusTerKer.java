/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodusterker;

/**
 *
 * @author jesch
 */
public class MetodusTerKer {
    
    private static double szamitKerulet(double a, double b, double c){
        return a + b + c;
    }
    private static double szamitTerulet(double a, double m){
        return (a*m)/2;
    }
    private static double szamitTerulet2(double a, double b, double c){
        double s = (a + b + c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Háromszög terület, kerület számító program");
        
        System.out.printf("Kerulet: %.2f\n", szamitKerulet(30,35,40));
        System.out.printf("Terület: %.2f\n", szamitTerulet(30,35));
        System.out.printf("Terület: %.2f\n", szamitTerulet2(30,35,40));
    }
    
}
