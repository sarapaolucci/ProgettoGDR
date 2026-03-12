/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pattinaggio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author paolucci.sara
 */
public class FileManager {
    
    //Scrittura su file ad accesso diretto
    public void scriviRAF() throws FileNotFoundException, IOException{
        String filePath = "pechino.dat";
        try (RandomAccessFile raf = new RandomAccessFile(filePath,"rw")){
            raf.writeUTF("Anna Shcherbakova");
            raf.writeDouble(255.95);
            raf.writeInt(1);
            raf.writeUTF("Russia");
            
            raf.writeUTF("Alexandra Trusova");
            raf.writeDouble(251.73);
            raf.writeInt(2);
            raf.writeUTF("Russia");
            
            raf.writeUTF("Kaori Sakamoto");
            raf.writeDouble(233.13);
            raf.writeInt(3);
            raf.writeUTF("Giappone");
        }
    }
    
    //Lettura file ad accesso diretto
    public String leggiRAF() throws FileNotFoundException, IOException{
        String filePath = "pechino.dat";
        try (RandomAccessFile raf = new RandomAccessFile(filePath,"r")){
            raf.seek(raf.getFilePointer());
            String name = raf.readUTF();
            double punti = raf.readDouble();
            int podio = raf.readInt();
            String stato = raf.readUTF();
            return name + " " + punti + " " + podio + " " + stato;
        }
    }
    
}
