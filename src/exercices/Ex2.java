/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Antoine
 */
public class Ex2 {
    
    public void run() throws FileNotFoundException, IOException{
        
        FileInputStream reader = new FileInputStream("C:\\Users\\Antoine\\Documents\\ESGI\\3AL\\1SEM\\java\\GIT\\Exercices\\src\\exercices\\input.txt");
        FileOutputStream writer = new FileOutputStream("C:\\Users\\Antoine\\Documents\\ESGI\\3AL\\1SEM\\java\\GIT\\Exercices\\src\\exercices\\output.txt",true);
        
        copy(reader, writer);

        writer.close();
        reader.close();
    }
    private static void copy(FileInputStream fileReader, FileOutputStream fileWriter) 
        throws IOException {
        int character;
        while ((character = fileReader.read()) != -1) {
            fileWriter.write(character);
        }
    }
}
