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
public class BarcodeBatalla implements Barcos{
    int[]posiciones= new int[4];
    
    
   public boolean verificarDisparo(Coordenadas m){
        return true;
    }

    public boolean verificarHundimiento(Coordenadas n){
        return true;
    }
}
