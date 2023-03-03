/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paquete2;

import Paquete1.ClaseA;

/**
 *
 * @author invitado
 */
public class ClaseE {
    public int publicE;
    int defaultE;
    private int privateE;
}

class claseF{
    public int publicF;
    int defaultF;
    private int privateF;
    
    public void prueba(){
        ClaseA objA = new ClaseA();
        //objA.publicA
        
        //ClaseD es default, en otro paquete es invisible
        //ClaseD objD = new ClaseD();
    }
}
