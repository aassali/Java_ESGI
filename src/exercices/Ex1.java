/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Antoine
 */
public class Ex1 {
    public void run(int exo) throws FileNotFoundException, IOException
    {
        //System.out.println("reponse Ã  l'exercice 1");
        //Ne fonctionne pas si le chemin n'est pas renseigné intégralement
        FileReader reader = new FileReader("C:\\Users\\Antoine\\Documents\\ESGI\\3AL\\1SEM\\java\\GIT\\Exercices\\src\\exercices\\input.txt");
        FileWriter writer;
        if(exo==1)
        {
            writer = new FileWriter("C:\\Users\\Antoine\\Documents\\ESGI\\3AL\\1SEM\\java\\GIT\\Exercices\\src\\exercices\\output.txt");
            copy(reader, writer);
            writer.close();
            reader.close();
        }
        if(exo==2) // pour exercice 2 avec append mis à true
        {
            writer = new FileWriter("C:\\Users\\Antoine\\Documents\\ESGI\\3AL\\1SEM\\java\\GIT\\Exercices\\src\\exercices\\output.txt",true);
            copy(reader, writer);
            writer.close();
            reader.close();
        }
        
        
        
    }

    public static void copy(FileReader reader, FileWriter writer) throws IOException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int character;
    while ((character = reader.read()) != -1) {
        writer.write(character);
    }
    }
}
