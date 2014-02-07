/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bn;

/**
 *
 * @author Alumnos
 */
public class Interceptor implements Barcos{
    int[]posiciones= new int[2];
    
    
   public boolean verificarDisparo(Coordenadas m){
        return true;
    }

    public boolean verificarHundimiento(Coordenadas n){
        return true;
    }
}
