/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pattinaggio;

/**
 *
 * @author paolucci.sara
 */
public class PattinatoreRecord extends Pattinatore{
    private boolean raccomandata;
    private boolean record;
    
    public PattinatoreRecord(String n, double pO, int p, String s){
        super(n,pO,p,s);
        this.raccomandata = true;
        this.record =true;
    }
    
    public void setRaccomandata(boolean r){
        this.raccomandata = r;
    }
    
    @Override
    public String abilitaSpeciale(){
        if(raccomandata ==true){
            punti+=20;
            return "";
        }
        return "";
    }
    
    @Override
    public String rischio(){
        int r = rand.nextInt(101);
        if(r > 80){
            raccomandata = false;
            puntiPenalita+=15;
            return "";
        }
        else{
            punti+=10;
            return "";
        }
    }
}
