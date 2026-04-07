/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pattinaggio;
import java.io.IOException;
import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author paolucci.sara
 */
public class Gestore implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private Pattinatore p, avversario;
    private String  musica, nickname;
    //private String filePath;
    //private int indiceFile;
    private int turno, valutazioni;
    private Random rand;
    
    public Gestore(Pattinatore p, String m, String nickname){
        this.turno = 0;
        this.rand = new Random();
        this.musica = m;
        this.p = p;
        this.nickname = nickname;
    }
    
    public Pattinatore getAvversario(){
        return this.avversario;
    }
    
    public Pattinatore getPersonaggio(){
        return this.p;
    }
    
    public String getMusica(){
        return this.musica;
    }
    
    public String getNickname(){
        return this.nickname;
    }
    
    public int getValutazioni(){
        return this.valutazioni;
    }
    
    public void setValutazioni(int v){
        this.valutazioni = v;
    }
    
    public void setTurno(int t){
        this.turno = t;
    }
    
    public int getTurno(){
        return this.turno;
    }
    
    public String Avanti(){
        String evento = "";
        int r = rand.nextInt(4);
        if(r==0 && !p.nome.equals("Alysa Liu")){
            evento = EventoCasuale.Quadrupli(p);
        }
        else if(r==1){
            evento = EventoCasuale.Figura("flip",2,5,p);
        }
        else if(r==2){
            evento = EventoCasuale.Figura("lutz",2,6,p);
        }
        else{
            evento = EventoCasuale.Figura("axel",3,8,p);
        }
        return evento;
    }
    
    public String interpretationOfMusicValutazione(){
        if(musica.equals("skyfall")){
            this.p.interpretationOfMusic = 7;
            if(p.nome.equals("Anna Shcherbakova")||p.nome.equals("Alexandra Trusova")){
                this.p.interpretationOfMusic = 10;
            }
        }
        else if(musica.equals("loveGame")){
            this.p.interpretationOfMusic = 8;
        }
        else if(musica.equals("prayForMe")){
            this.p.interpretationOfMusic = 9;
            if(p.nome.equals("Alysa Liu")){
                this.p.interpretationOfMusic = 7;
            }
        }
        else{
            this.p.interpretationOfMusic = 8;
            if(p.nome.equals("Kaori Sakamoto")){
                this.p.interpretationOfMusic = 10;
            }
        }
        p.punti+= p.interpretationOfMusic;
        return "Interpretation of the music: " + this.p.interpretationOfMusic +"\n";
    }
    //collegamenti figure
    public String transitionsValutazione(){
        if(p.transitions==0){
            if(p.punti < 22){
                p.transitions = 5;
            }
            else{
                if(musica.equals("prayForMe")){
                    p.transitions = 9;
                }
                p.transitions = 8;
            }
        }
        p.punti+= p.transitions;
        return "Transitions: " + p.transitions+"\n";
    }
    //presenza scenica
    public String performanceValutazione(){
        if(this.p.performance==0){
            if(this.p.nome.equals("Alysa Liu")){
                this.p.performance = 7;
            }
            else{
                this.p.performance = 9;
            }
        }
        p.punti+= p.performance;
        return "Performance: "+ this.p.performance+"\n"; 
    }
    //programma
    public String compositionValutazione(){
        if(this.p.puntiOlimpiade > 230){
            this.p.composition = 10;
        }
        else{
            this.p.composition = 7;
        }
        p.punti+= p.composition;
        return "Composition: " + this.p.composition+"\n";
    }
    
    public String skatingSkillsValutazione(){
        if(this.p.stato.equals("Russia")){
            this.p.skatingSkills = 10;
        }
        else if(this.p.stato.equals("Giappone")){
            this.p.skatingSkills = 9;
        }
        else{
            this.p.skatingSkills = 8;
        }
        p.punti+= p.skatingSkills;
        return "Skating skills: "+ this.p.skatingSkills+"\n";
    }
    
    public Pattinatore scegliAvversario() throws IOException{
        if(p.nome.equals("Alexandra Trusova")||p.nome.equals("Anna Shcherbakova")){
            return FileManager.ScegliAvversario("MilanoCortina2026.txt");
        }
        else if(p.nome.equals("Kaori Sakamoto")){
            Pattinatore a = FileManager.ScegliAvversario("MilanoCortina2026.txt");
            if(a.nome.equals(p.nome)){
               while(a.nome.equals(p.nome)){
                   a =FileManager.ScegliAvversario("MilanoCortina2026.txt");
               } 
            }
            return a;
        }
        else{
            return FileManager.ScegliAvversario("Pechino2022.txt");
        }
    }
    
    public String rischio(){
        return p.rischio();
    }
    
    public String abilitaSpeciale(){
        return p.abilitaSpeciale();
    }
    
    public String scontroDiretto() throws IOException{
        avversario = scegliAvversario();
        String output = "Lo scontro diretto è in base alle \nstatistiche dell'ultima olimpiade del \ntuo personaggio e dell'avversario \nche è "+ avversario.nome+"\n";
        int punti = 0;
        if(p.puntiOlimpiade > avversario.puntiOlimpiade){
            punti += 10;
            output += "+10 punti perchè il tuo punteggio \nera  maggiore\n";
        }
        else{
            punti -=3;
            output += "-3 punti perchè il tuo punteggio \nera minore\n";
        }
        if(p.posizione > avversario.posizione){
            punti +=5;
            output += "+5 punti perchè sei più in alto \nnel podio\n";
        }
        p.aumentaPunti(punti);
        return output;
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
