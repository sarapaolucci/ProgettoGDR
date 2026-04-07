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
            return "Detieni il record olimpico! \nQuesto ti aggiunge 20 punti!\n";
        }
        return "Hai rischiato troppo ed è andata male! \nDa te non ci si aspettano questi errori!\n";
    }
    
    @Override
    public String rischio(){
        int r = rand.nextInt(101);
        if(r > 80){
            raccomandata = false;
            punti-=15;
            return "Penalità di 15 punti! \nSei stata scordinata\n";
        }
        else{
            punti+=15;
            performance = 10;
            return "15 punti in più per la performance ottima. \nSe ne terrà conto nella valutazione\n";
        }
    }
}
