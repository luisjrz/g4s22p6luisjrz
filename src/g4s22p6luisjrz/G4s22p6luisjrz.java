/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4s22p6luisjrz;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author DELL
 */
public class G4s22p6luisjrz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code app<lication logic here
        ArrayList<String> Lista = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
        Lista.forEach(contenido -> {
            System.out.println("el valor contenido es " + contenido);
           
        });
        Lista.add("G");
        Lista.add("H");
        
        System.out.println("\n segunda forma de trabajar recorridos de listas\n");
        
        for(String contenido1 : Lista){
           System.out.println("El valor contenido es " + contenido1);
           
        }
        Lista.add("Victor");
        Lista.add("esta es una linea muy larga");
        Lista.add("hugo"); 
        Lista.add("esta es la segunda linea muy larga sin problemas de almacenamiento");
         
        System.out.println("\n tercer forma de trabajar recorridos de listas\n");
        
        Lista.stream().forEach(contenido2 ->{
            System.out.println("el valor contenido es " + contenido2);
            
         });
        
        
        
    }
    
}
