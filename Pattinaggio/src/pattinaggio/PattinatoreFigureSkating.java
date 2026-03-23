/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pattinaggio;

/**
 *
 * @author paolucci.sara
 */
public class PattinatoreFigureSkating extends Pattinatore{
    private boolean quad;
    private boolean cantilever;
    
    public PattinatoreFigureSkating(String n, double pO, int p, String s){
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
    
    @Override
    public void abilitaSpeciale(){
        if(cantilever==true){
            if(quad==true){
                punti+=20;
            }
            else{
                punti+=10;
            }
        }
        if(quad==true){
            punti+=10;
        }
    }
    
    @Override
    public void rischio(){
       int r = rand.nextInt(101);
       if(r > 70){
           quad=false;
           puntiPenalita+=10;
       }
       else if(r > 90){
           cantilever=false;
           puntiPenalita+=15;
       }
       else{
           punti+=30;
       }
    }
}
