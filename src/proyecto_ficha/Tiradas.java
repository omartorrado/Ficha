/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_ficha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author otorradomiguez
 */
public class Tiradas {

    Random rnd = new Random();
           

    public ArrayList roll_list(int dados, int caras) {
        ArrayList tirada= new ArrayList();
        int resultado;
        for (int i=1; i<dados+1; i++){
            resultado = rnd.nextInt(caras)+1;
            tirada.add(resultado);
            }
        tirada.sort(null);
        Collections.reverse(tirada);
        return tirada;
    }
    
    public int roll_suma(int dados, int caras){
        int resultado=0;
        for (int i=1;i<dados+1;i++){
            resultado=resultado+rnd.nextInt(caras)+1;
        }
        return resultado;
    }
    
        public int roll_media_baja(int dados, int caras){
        int resultado=0;
        for (int i=1;i<dados+1;i++){
            resultado=resultado+rnd.nextInt(caras)+1;
        }
        //System.out.println(resultado);
        resultado=resultado/dados;
        return resultado;
        }
        
        public int roll_media_alta(int dados, int caras){
        int resultado=0;
        float result=0;
        for (int i=1;i<dados+1;i++){
            resultado=resultado+rnd.nextInt(caras)+1;
        }
        //System.out.println(resultado);
        resultado=(int) Math.round((float)resultado/(float)dados);
        return resultado;
        }
}
