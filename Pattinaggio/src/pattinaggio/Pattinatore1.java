/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pattinaggio;

/**
 *
 * @author paolucci.sara
 */
public class Pattinatore1 extends Personaggio{
    private boolean quad;
    private boolean cantilever;
    
    public Pattinatore1(String n, double pO, int p, String s){
        super(n,pO,p,s);
        this.cantilever = true;
        this.quad = true;
    }
    
    public void setQuad(boolean q){
        this.quad = q;
    }
    
    public void setCantilever(boolean c){
        this.cantilever = c;
    }
    
}
