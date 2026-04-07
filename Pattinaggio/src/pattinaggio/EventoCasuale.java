 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pattinaggio;

import java.util.Random;

/**
 *
 * @author paolucci.sara
 */
public class EventoCasuale {
    
    public static String Figura(String nome, int doppio, int triplo, Pattinatore p){
        Random rand = new Random();
        int punti[] = {doppio,triplo};
        int r = rand.nextInt(2);
        int pnt = punti[r];
        p.aumentaPunti(pnt);
        if(r ==0){
            return "Doppio " + nome + ": " + pnt + " punti\n";
        }
        else{
            return  "Triplo " + nome + ": " + pnt + " punti\n";
        }
    }
    
    public static String Quadrupli(Pattinatore p){
        Random rand = new Random();
        int punti[]= {13,12,11};
        String figura[]={"axel","lutz","flip"};
        int r = rand.nextInt(3);
        p.aumentaPunti(punti[r]);
        return "Quad " + figura[r]+ ": " + punti[r] + " punti\n";
    }

}
