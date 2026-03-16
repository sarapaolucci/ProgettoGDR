/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pattinaggio;
import java.io.IOException;

/**
 *
 * @author paolucci.sara
 */
public class Gestore {
    Pattinatore p;
    String filePathPechino = "pechino.dat";
    String filePathCortina = "cortina.dat";
    int turno;
    
    public Gestore(int n, String filePath) throws IOException{
        this.p = sceltaPersonaggio(n,filePath);
        this.turno = 0;
    }
    
    public Pattinatore sceltaPersonaggio(int n, String filePath) throws IOException{
        Pattinatore pp;
        String personaggio = FileManager.leggiRAF(n, filePath);
        String dati[] = personaggio.split(" ");
        if(filePath.equals(filePathPechino)){
            switch (n) {
                case 0:
                    pp = new AnnaShcherbakova(dati[0],Double.parseDouble(dati[1]),Integer.parseInt(dati[2]),dati[3]);
                    break;
                case 39:
                    pp = new AlexandraTrusova(dati[0],Double.parseDouble(dati[1]),Integer.parseInt(dati[2]),dati[3]);
                    break;
                default:
                    pp = new KaoriSakamoto(dati[0],Double.parseDouble(dati[1]),Integer.parseInt(dati[2]),dati[3]);
                    break;
            }
        }
        else{
            if(n == 0){
                pp = new AlysaLiu(dati[0],Double.parseDouble(dati[1]),Integer.parseInt(dati[2]),dati[3]);
            }
            else{
                pp = new KaoriSakamoto(dati[0],Double.parseDouble(dati[1]),Integer.parseInt(dati[2]),dati[3]);
            }
        }
        return pp;
    }
    
    public void scontroDiretto(){
        //va nell'altra olimpiade e te ne prende uno a caso
        EventoCasuale.scontroDiretto(p, p);
    }
    
}
