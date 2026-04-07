/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pattinaggio;

/**
 *
 * @author paolucci.sara
 */
public class PattinatoreSenzaAbilita extends Pattinatore{
    
    public PattinatoreSenzaAbilita(String n, double pO, int p, String s){
        super(n,pO,p,s);
    }
    
    @Override
    public String abilitaSpeciale(){
        return "Non hai abilità speciali!! \nHai vinto l'ultimo oro olimpico solo \nperchè non c'erano le russe\n";
    }
    
    @Override
    public String rischio(){
        int r = rand.nextInt(101);
        if(r > 50){
            punti-=20;
            return "20 punti in meno per la tua \nmancata eleganza e per la caduta\n";
        }
        else{
            punti+=10;
            return "10 punti in più per il coraggio \ndi aver rischiato nel fare una figura \ncomplicata\n";
        }
    }
}
