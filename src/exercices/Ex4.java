/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import static java.lang.System.out;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Antoine
 */
public class Ex4 {
    public void run(int exo) throws FileNotFoundException, IOException{
        if(exo == 1)
        {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Antoine\\Documents\\ESGI\\3AL\\1SEM\\java\\GIT\\Exercices\\src\\exercices\\doublons.txt"));
            Set<String> uniqueLines = new HashSet<>();
            String line;

            while ((line = bufferedReader.readLine()) != null) 
            {
                if (!uniqueLines.contains(line)) 
                {
                    System.out.println(line);
                }
                uniqueLines.add(line);
            }

            bufferedReader.close();
        }
        
        if(exo == 2)
        {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Antoine\\Documents\\ESGI\\3AL\\1SEM\\java\\GIT\\Exercices\\src\\exercices\\doublons.txt"));
            PrintStream out = new PrintStream("C:\\Users\\Antoine\\Documents\\ESGI\\3AL\\1SEM\\java\\GIT\\Exercices\\src\\exercices\\sansDoublon.txt");
            Set<String> uniqueLines = new HashSet<>();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (!uniqueLines.contains(line)) {
                    out.println(line);
                }
                uniqueLines.add(line);
            }
            bufferedReader.close();
            out.close();
        }
    }
    
    public void run(int exo, String source,String destination) throws IOException{
        if(exo == 3){
            Path destinationDirectory = Paths.get(destination);
            //System.out.println(destinationDirectory);
            DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(source));

            for (Path toCopy : stream) 
            {
                Path toCreate = destinationDirectory.resolve(toCopy.getFileName());
                System.out.println("Create: " + toCreate + "...");

                if (Files.isDirectory(toCopy)) Files.createDirectory(toCreate);
                else 
                {
                    if (Files.isRegularFile(toCopy)) Files.createFile(toCreate);
                    else System.err.println("Cannot process " + toCopy); 
                }
            }

            stream.close();
            out.close();
        }
        if(exo == 4)
        {
            contentReader(source);
            contentWriter(destination);
        }
        if(exo == 5)
        {
            contentReader2(source);
            contentWriter2(destination);
        }
    }

    private void contentReader(String source) throws IOException {
        
        DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(source));
        PrintStream out = new PrintStream("list.csv");
        for (Path toCopy : stream) {
            Path fileName = toCopy.getFileName();
            if (Files.isDirectory(toCopy)) {
                out.println(fileName + ";" + "directory");
            } else if (Files.isRegularFile(toCopy)) {
                out.println(fileName + ";" + "file");
            } else {
                out.println(fileName + ";" + "unknown");
            }
        }
        
        stream.close();
        out.close();
    }
    

    private void contentWriter(String destination) throws FileNotFoundException, IOException {
        
        Path destinationDirectory = Paths.get(destination);
        BufferedReader listing = new BufferedReader(new FileReader("list.csv"));
        String line;
        while ((line = listing.readLine()) != null) {
            String[] columns = line.split(";");
            String filename = columns[0];
            String type = columns[1];
            Path toCreate = destinationDirectory.resolve(filename);
            System.out.println("Create: " + toCreate + "...");
            switch (type) {
                case "directory":
                    Files.createDirectory(toCreate);
                    break;
                case "file":
                    Files.createFile(toCreate);
                    break;
                default:
                    System.err.println("Cannot process " + toCreate + " (unknown type)");
                    break;
            }
        }
        
        listing.close();
    }

    private void contentReader2(String source) throws IOException {
        DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(source));
        
        for (Path toCopy : stream) {
            Path fileName = toCopy.getFileName();
            if (Files.isDirectory(toCopy)) {
                System.out.println(fileName + ";" + "directory");
            } else if (Files.isRegularFile(toCopy)) {
                System.out.println(fileName + ";" + "file");
            } else {
                System.out.println(fileName + ";" + "unknown");
            }
        }
        
        stream.close();
    }

    private void contentWriter2(String destination) throws IOException {
        
        Path destinationDirectory = Paths.get(destination);
        BufferedReader listing = new BufferedReader(new InputStreamReader(System.in));
        String line;
        
        while ((line = listing.readLine()) != null) {
            String[] columns = line.split(";");
            String filename = columns[0];
            String type = columns[1];
            Path toCreate = destinationDirectory.resolve(filename);
            System.out.println("Create: " + toCreate + "...");
            switch (type) {
                case "directory":
                    Files.createDirectory(toCreate);
                    break;
                case "file":
                    Files.createFile(toCreate);
                    break;
                default:
                    System.err.println("Cannot process " + toCreate + " (unknown type)");
                    break;
            }
        }
        
        listing.close();
    }
}

