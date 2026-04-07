/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pattinaggio;

/**
 *
 * @author paolucci.sara
 */
public class PattinatorePluripremiato extends Pattinatore{
    private int podioOlimpiadi;
    
    public PattinatorePluripremiato(String n, double pO, int p, String s){
        super(n,pO,p,s);
        this.podioOlimpiadi = 2;
    }
    
    @Override
    public String abilitaSpeciale(){
        punti+=15;
        return "Grazie alle tue due medaglie \nolimpiche hai un bonus di 15 punti\n";
    }
    
    @Override
    public String rischio(){
        int r = rand.nextInt(101);
        if(r > 50){
            punti-=10;
            return "Stavi per cadere! \nHai una penalità di 10 punti\n";
        }
        else{
            punti+=15;
            composition = 10;
            return "Hai eseguito la tua figura perfettamente! \nHai un bonus di 15 punti. Se ne terrà \nconto nella valutazione composition\n";
        }
    }
}
