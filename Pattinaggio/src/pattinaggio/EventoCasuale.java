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
    
    public static void scontroDiretto(Pattinatore personaggio, Pattinatore avversario){
        int punti = 0;
        if(personaggio.puntiOlimpiade > avversario.puntiOlimpiade){
            punti += 10;
        }
        else{
            punti -=3;
        }
        if(personaggio.posizione > avversario.posizione){
            punti +=5;
        }
        personaggio.aumentaPunti(punti);
    }
    
    public static int Axel(){
        Random rand = new Random();
        int axel[] = {3,8,13};
        int r = rand.nextInt(3);
        return axel[3];
    }
    
    public static int Lutz(){
        Random rand = new Random();
        int lutz[] = {2,6,12};
        int r = rand.nextInt(3);
        return lutz[r];
    }
    
    public static int Flip(){
        Random rand = new Random();
        int flip[]={2,5,11};
        int r = rand.nextInt(3);
        return flip[r];
    }
    
    public static String Quadrupli(){
        Random rand = new Random();
        int punti[]= {13,12,1};
        String figura[]={"axel","lutz","flip"};
        int r = rand.nextInt(3);
        return punti[r]+ ","+figura[r];
    }

}
