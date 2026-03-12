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
        f.scriviRAF();
        System.out.println(f.leggiRAF());
    }
    
}
