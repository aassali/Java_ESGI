/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Antoine
 */
public class Ex3 {
    public void run(int exo) throws IOException
    {
        if(exo == 0)
        {
            //System.out.println(Paths.get(".").toAbsolutePath());
            System.out.println(System.getProperty("user.dir"));
        }
        if(exo > 0)
        {
            //System.out.println(System.getProperty("java.io.tmpdir"));
            String temporaryDirectory = System.getProperty("java.io.tmpdir");
            
            for (int i = 1; i <= exo; i++) 
            {
                Path path = Paths.get(temporaryDirectory, i + ".txt");
                FileWriter fileWriter = new FileWriter(path.toFile());
            }
        }
    }
}
