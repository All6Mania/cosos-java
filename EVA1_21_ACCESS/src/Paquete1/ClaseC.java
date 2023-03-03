/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Paquete1;

import paquete2.ClaseE;

/**
 *
 * @author invitado
 */
public class ClaseC {
    public int publicC;
    int defaultC;
    private int privateC;
}

class ClaseD{
    public int publicD;
    int defaultD;
    private int privateD;
    
    public void prueba(){
        ClaseB objB = new ClaseB();
        //objB.publicB;
        //objB.defaultB;
        
        ClaseE objE = new ClaseE();
        //objE.publicE;
        
        //ClaseF esta en otro paquete y es default
        //ClaseF objF = new ClaseF();
    }
}