/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pattinaggio;

import java.io.IOException;

/**
 *
 * @author paolucci.sara
 */
public class Pattinaggio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        FileManager f = new FileManager();
        String filePathPechino = "pechino.dat";
        String filePathCortina = "cortina.dat";
        f.scriviRAF();
        System.out.println(f.leggiRAF(28 + 38, filePathCortina));
        
        //Form1 ff = new Form1();
        //ff.setVisible(true);
        
        FormPersonaggio fff = new FormPersonaggio();
        fff.setVisible(true);
    }
    
}
