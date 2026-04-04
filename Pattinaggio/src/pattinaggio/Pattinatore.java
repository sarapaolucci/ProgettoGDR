/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pattinaggio;

import java.util.Random;

/**
 *
 * @author paolucci.sara
 */
public abstract class Pattinatore {
   
    protected String nome, stato;
    protected int  posizione, scontriVinti, scontriPersi,punti, puntiPenalita;
    protected double puntiOlimpiade;
    protected Random rand;
    //valutazioni
    protected int skatingSkills, transitions, performance, composition, interpretationOfMusic;
    
    public Pattinatore(String n, double pO, int p, String s){
        this.nome = n;
        this.posizione = p;
        this.puntiOlimpiade = pO;
        this.stato = s;
        this.scontriVinti = 0;
        this.scontriPersi = 0;
        this.punti = 0;
        this.puntiPenalita = 0;
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
    
    public int getScontriVinti(){
        return this.scontriVinti;
    }
    
    public int getScontriPersi(){
        return this.scontriPersi;
    }
    
    public int getPuntiPenalita(){
        return this.puntiPenalita;
    }
    
    public abstract String abilitaSpeciale();
    
    public abstract String rischio();
    
}
