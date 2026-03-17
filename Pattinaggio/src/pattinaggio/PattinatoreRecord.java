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
    
    public PattinatoreRecord(String n, double pO, int p, String s){
        super(n,pO,p,s);
        this.raccomandata = true;
    }
    
    public void setRaccomandata(boolean r){
        this.raccomandata = r;
    }
    
}
