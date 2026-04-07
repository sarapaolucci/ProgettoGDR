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
    public String abilitaSpeciale(){
        if(cantilever==true && quad == true){
            punti += 30;
            return "Hai eseguito perfettamente un \ncantilever e un quad flip!!! \nPer questo hai ottenuto 30 punti\n";
        }
        else if(quad==true){
            punti+=15;
            return "Hai eseguito un quad lutz, \nper questo hai ottenuto 15 punti\n";
        }
        else{
            transitions = 10;
            return "Hai eseguito un cantilever che \nnon da punti in più, però porta al massimo \nla valutazione transitions\n";
        }
    }
    
    @Override
    public String rischio(){
       int r = rand.nextInt(101);
       if(r > 80){
           cantilever=false;
           punti-=15;
           return "Sei caduta mentre provavi a \nfare un cantilever, 15 punti in meno\n";
       }
       else if(r > 60){
           quad=false;
           punti-=10;
           return "Hai sbagliato a fare un quad \nflip, 10 punti in meno\n";
       }
       else{
           punti-=7;
           return "Sei scivolata perdendo così \n7 punti\n";
       }
    }
}
