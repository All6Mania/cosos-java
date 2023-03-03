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
public class ClaseA {
    public int publicA;
    int defaultA;
    private int privateA;
    
    public void prueba(){
        //todas estas clases estabn en el paquete1
        //mismo paquete, public y default son
        //visibles
        ClaseB objB = new ClaseB();
        //objB.publicB;
        //objB.defaultB;
        
        ClaseC objC = new ClaseC();
        //objC.publicC;
        //objC.defaultC;
        
        ClaseD objD = new ClaseD();
        //objD.publicD;
        //objD.defaultD;
        
        //clases del paquete2
        //todo lo que sea default es invisible
        ClaseE objE = new ClaseE();
        //objE.publicE;
        
        //ClaseF --> es default, y no es visible en otro paquete
        //ClaseF objF = new ClaseF();
    }
}

class ClaseB{
    public int publicB;
    int defaultB;
    private int privateB;
    
     public void prueba(){
        //todas estas clases estabn en el paquete1
        //mismo paquete, public y default son
        //visibles
        ClaseB objB = new ClaseB();
        //objB.publicB;
        //objB.defaultB;
        
        ClaseC objC = new ClaseC();
        //objC.publicC;
        //objC.defaultC;
        
        ClaseD objD = new ClaseD();
        //objD.publicD;
        //objD.defaultD;
        
        //clases del paquete2
        //todo lo que sea default es invisible
        ClaseE objE = new ClaseE();
        //objE.publicE;
        
        //ClaseF --> es default, y no es visible en otro paquete
        //ClaseF objF = new ClaseF();
    }
}