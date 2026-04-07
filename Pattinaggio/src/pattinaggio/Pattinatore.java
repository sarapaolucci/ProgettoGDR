/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pattinaggio;

import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author paolucci.sara
 */
public abstract class Pattinatore implements Serializable {
   private static final long serialVersionUID = 1L;
    
    protected String nome, stato;
    protected int posizione,punti;
    protected double puntiOlimpiade;
    protected Random rand;
    //valutazioni
    protected int skatingSkills, transitions, performance, composition, interpretationOfMusic;
    
    public Pattinatore(String n, double pO, int p, String s){
        this.nome = n;
        this.posizione = p;
        this.puntiOlimpiade = pO;
        this.stato = s;
        this.punti = 0;
        this.rand = new Random();
        this.skatingSkills = 0;
        this.composition = 0;
        this.interpretationOfMusic=0;
        this.performance = 0;
        this.transitions = 0;
    }
    
    public void setSkatingSkills(int i){
        this.skatingSkills = i;
    }
    
    public void setInterpretationOfMusic(int i){
        this.interpretationOfMusic = i;
    }
    
    public void setComposition(int i){
        this.composition = i;
    }
    
    public void setTransitions(int i){
        this.transitions = i;
    }
    
    public void setPerformance(int i){
        this.performance = i;
    }
    
    public void aumentaPunti(int p){
        this.punti += p;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public double getPunti(){
        return this.punti;
    }
    
    
    public abstract String abilitaSpeciale();
    
    public abstract String rischio();
    
}
