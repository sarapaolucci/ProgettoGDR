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
    
}
