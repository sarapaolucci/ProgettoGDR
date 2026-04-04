/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pattinaggio;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author paolucci.sara
 */
public class Gestore {
    private Pattinatore p;
    private String  musica, nickname;
    //private String filePath;
    //private int indiceFile;
    private int turno;
    private Random rand;
    
    public Gestore(Pattinatore p, String m, String nickname){
        this.turno = 0;
        this.rand = new Random();
        this.musica = m;
        this.p = p;
        this.nickname = nickname;
    }
    
    public Pattinatore getPersonaggio(){
        return this.p;
    }
    
    public String getNickname(){
        return this.nickname;
    }
    
    public void setTurno(int t){
        this.turno = t;
    }
    
    public int getTurno(){
        return this.turno;
    }
    
    public void Gioca(){
        int pnt;
        int r = rand.nextInt(4);
        if(r==0){
            System.out.println("Axel");
            pnt = EventoCasuale.Axel();
        }
        else if(r==1){
            System.out.println("Flip");
            pnt = EventoCasuale.Flip();
        }
        else if(r==2){
            System.out.println("Lutz");
            pnt = EventoCasuale.Lutz();
        }
        else{
            String quadruplo = EventoCasuale.Quadrupli();
            String colonne[] = quadruplo.split(",");
            System.out.println(colonne[1]);
            pnt = Integer.parseInt(colonne[0]);
        }
        p.aumentaPunti(pnt);
    }
    
    public void valutazioni(){
        
    }
    
    public String rischio(){
        return p.rischio();
    }
    
    public String abilitaSpeciale(){
        return p.abilitaSpeciale();
    }
    
    public void scontroDiretto(Pattinatore personaggio, Pattinatore avversario){
        int punti = 0;
        if(personaggio.puntiOlimpiade > avversario.puntiOlimpiade){
            punti += 10;
        }
        else{
            punti -=3;
        }
        if(personaggio.posizione > avversario.posizione){
            punti +=5;
        }
        personaggio.aumentaPunti(punti);
    }
    
    /*
    public void assegnaPersonaggio(int n, String f) throws IOException{
        this.indiceFile = n;
        this.filePath = f;
        sceltaPersonaggio(indiceFile, filePath);
    }
    
    public Pattinatore sceltaPersonaggio(int indiceFile,String filePath) throws IOException{
        Pattinatore pp;
        String personaggio = FileManager.leggiRAF(indiceFile, filePath);
        String dati[] = personaggio.split(" ");
        if(filePath.equals("pechino.dat")){
            switch (indiceFile) {
                case 0:
                    pp = new PattinatoreRecord(dati[0],Double.parseDouble(dati[1]),Integer.parseInt(dati[2]),dati[3]);
                    break;
                case 39:
                    pp = new PattinatoreFigureSkating(dati[0],Double.parseDouble(dati[1]),Integer.parseInt(dati[2]),dati[3]);
                    break;
                default:
                    pp = new PattinatorePluripremiato(dati[0],Double.parseDouble(dati[1]),Integer.parseInt(dati[2]),dati[3]);
                    break;
            }
        }
        else{
            switch (indiceFile) {
                case 0:
                    pp = new PattinatoreSenzaAbilita(dati[0],Double.parseDouble(dati[1]),Integer.parseInt(dati[2]),dati[3]);
                    break;
                case 28:
                    pp = new PattinatorePluripremiato(dati[0],Double.parseDouble(dati[1]),Integer.parseInt(dati[2]),dati[3]);
                    break;
                default:
                    pp = new PattinatoreSenzaAbilita(dati[0],Double.parseDouble(dati[1]),Integer.parseInt(dati[2]),dati[3]);
                    break;
            }
        }
        return pp;
    }

    //primo posto n = 0
    //secondo posto pechino n = 39, cortina n = 28
    //terzo posto pechino n = 39+39, cortina 28+38
    public void scontroDiretto() throws IOException{
        Pattinatore avversario;
        int i = rand.nextInt(5);
        String file;
        if(filePath.equals("cortina.dat")){
            file = filePath;
            int[] indici = {0,28,66};
            avversario = sceltaPersonaggio(indici[i],file);
        }
        else{
            file = "pechino.dat";
            int[] indici = {0,39,78};
            avversario = sceltaPersonaggio(indici[i],file);
        }
        EventoCasuale.scontroDiretto(p, avversario);
    }
    */
    
    
}
