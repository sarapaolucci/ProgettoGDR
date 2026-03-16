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
    Personaggio p;
    String filePathPechino = "pechino.dat";
    String filePathCortina = "cortina.dat";
    int turno;
    
    public Gestore(int n, String filePath) throws IOException{
        sceltaPersonaggio(n,filePath);
        this.turno = 0;
    }
    
    public void sceltaPersonaggio(int n, String filePath) throws IOException{
        String personaggio = FileManager.leggiRAF(n, filePath);
        String dati[] = personaggio.split(" ");
        if(filePath.equals(filePathPechino)){
            switch (n) {
                case 0:
                    this.p = new AnnaShcherbakova(dati[0],Double.parseDouble(dati[1]),Integer.parseInt(dati[2]),dati[3]);
                    break;
                case 39:
                    this.p = new AlexandraTrusova(dati[0],Double.parseDouble(dati[1]),Integer.parseInt(dati[2]),dati[3]);
                    break;
                default:
                    this.p = new KaoriSakamoto(dati[0],Double.parseDouble(dati[1]),Integer.parseInt(dati[2]),dati[3]);
                    break;
            }
        }
        else{
            if(n == 0){
                this.p = new AlysaLiu(dati[0],Double.parseDouble(dati[1]),Integer.parseInt(dati[2]),dati[3]);
            }
            else{
                this.p = new KaoriSakamoto(dati[0],Double.parseDouble(dati[1]),Integer.parseInt(dati[2]),dati[3]);
            }
        }
    }
    
}
