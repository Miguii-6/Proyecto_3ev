
package Model;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


public class Logica {
        
    private final ArrayList<Integer>numsUsados = new ArrayList<>();
    
    /**
     * Método que genera un numero aleatorio nuevo sin repetirse
     * @param bound
     * @return numero aleatorio
     */
    public int numero_random(int bound){
        
        int numRandom;       
        int stop = 0;
        
        // Genera numeros aleatorios hasta no haya ninguno que coincida con los del array
        do{
                        
            // Numero aleatorio entre 0 y x
            numRandom = ThreadLocalRandom.current().nextInt(0, bound);
                        
            for(Integer i: numsUsados){
                if (i == numRandom) {
                    stop = 1;
                }
            }
            
        }while(stop==0);
        
        // Añadir el número al ArrayList para que no se use más
        numsUsados.add(numRandom);
        
        return numRandom;
        
    }
    
    /**
     * 
     */
    public void comprobarTrue(){
    
        
        
    }
    
}