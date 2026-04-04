/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pattinaggio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 *
 * @author paolucci.sara
 */
public class FileManager {
    
    public static ArrayList<String> leggiClassifica(String filePath) throws IOException{
        ArrayList<String> righe = new ArrayList();
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = reader.readLine()) != null){
                righe.add(line);
            }
        }
        return righe;
    }
    
    public static void scriviClassifica(String filePath, Gestore g) throws IOException{
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){
            writer.write(g.getNickname() + " " + g.getPersonaggio() + " " + g.getPersonaggio().punti);
            writer.newLine();
        }
    }
    
    /*
    //Scrittura su file ad accesso diretto
    public void scriviRAF() throws FileNotFoundException, IOException{
        String filePathPechino = "pechino.dat";
        String filePathCortina = "cortina.dat";
        try (RandomAccessFile raf = new RandomAccessFile(filePathPechino,"rw")){
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
        try (RandomAccessFile raf = new RandomAccessFile(filePathCortina,"rw")){
            raf.writeUTF("Alysa Liu");
            raf.writeDouble(226.79);
            raf.writeInt(1);
            raf.writeUTF("USA");
            
            raf.writeUTF("Kaori Sakamoto");
            raf.writeDouble(224.90);
            raf.writeInt(2);
            raf.writeUTF("Giappone");
            
            raf.writeUTF("Amo Nakai");
            raf.writeDouble(219.16);
            raf.writeInt(3);
            raf.writeUTF("Giappone");
        }
    }
    
    //Lettura file ad accesso diretto
    //primo posto n = 0
    //secondo posto pechino n = 39, cortina n = 28
    //terzo posto pechino n = 39+39, cortina 28+38
    public static String leggiRAF(int n, String filePath) throws FileNotFoundException, IOException{String filePathPechino = "pechino.dat";
        try (RandomAccessFile raf = new RandomAccessFile(filePath,"r")){
            raf.seek(raf.getFilePointer() + n);
            String name = raf.readUTF();
            double punti = raf.readDouble();
            int podio = raf.readInt();
            String stato = raf.readUTF();
            return name + " " + punti + " " + podio + " " + stato;
        }
    }
    
    */
    
}
