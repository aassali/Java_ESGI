/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices;

import java.io.IOException;

/**
 *
 * @author Antoine
 */

public class Exercices {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        /*ARGUMENTS
        *args[0]:10 
        *args[1]:C:\\Users\\Antoine\\Documents\\ESGI\\3AL\\1SEM\\java\\GIT\\Exercices\\src\\exercices 
        *args[2]:C:\Users\Antoine\AppData\Local\Temp
        */
        
        // Initialisation des exercices
        Ex1 exo1 = new Ex1();//correspond au 2. Flux de caractere
        Ex2 exo2 = new Ex2();//correspond au 3. Flux d'octet
        Ex3 exo3 = new Ex3();//correspond au 4. File et Path
        Ex4 exo4 = new Ex4();//correspond au 5. Flux orienté ligne
        
        //FLUX DE CARACTERE
        exo1.run(1);//sans append /2.3
        //exo1.run(2);//avec append /2.4
        //bÃ©po résultat obtenu après la modification de l'encodage. /2.5
        
        //FLUX D'OCTET
        //exo2.run();//Résultat similaire, avec utilisation des classes FileInputStream & FileOutputStream
        
        //FILE ET PATH
        //exo3.run(0);//le chemin absolu du répertoire courant => C:\Users\Antoine\Documents\ESGI\3AL\1SEM\java\GIT\Exercices\.
        //exo3.run(Integer.parseInt(args[0]));//correspond a l'exercice 4.4 avec EditConfiguration args[0] à parametrer
        
        //FLUX ORIENTE LIGNE
        //exo4.run(1);//affiche dans la sortie console le contenu de doublons.txt sans les doublons
        //exo4.run(2);//resultat similaire mais ecrit dans un fichier sansDoublon.txt
        //exo4.run(3,args[1], args[2]);//copie le contenu d'un repertoire se trouvant a l'emplacement args[1] à une l'emplacement args[2] 
        //exo4.run(4,args[1], args[2]);//resultat analogue à l'exercice précedent, en séparant le process en deux fonctions distinctes
        //exo4.run(5,args[1], args[2]);//!NE FONCTIONNE PAS! il y a visiblement un probleme au niveau de contentWritter2
    }
    
}
