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
    public void abilitaSpeciale(){
        System.out.println("Non hai abilità speciali!!!");
    }
    
    @Override
    public void rischio(){
        int r = rand.nextInt(101);
        if(r > 50){
            puntiPenalita+=20;
        }
        else{
            punti+=10;
        }
    }
}
