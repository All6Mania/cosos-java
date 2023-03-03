/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_4_television;

/**
 *
 * @author invitado
 */
public class Tv {
    //atributos: estado
    private boolean power;
    private int volumen;
    private int canal;
    //metodos: comportamiento
    //construcor:
    public Tv(){//constructor default
        power = false; //apagado
        volumen = 10;
        canal = 3;
    }
    public void cambiarPower(){
        if(power == false){//apagado
            power = true; //encendemos la Tv
            System.out.println("TELEVISION ENCENDIDA");
        }else{
            power = false;
            System.out.println("TELEVISION APAGADA");
        }
    }
    public void subirVolumen(){
    if(power == true){
        if (volumen < 100){
        volumen = volumen + 5;
        System.out.println("Volumen: " + volumen);
        }
    }
    }
        public void bajarVolumen(){
              if(power == true){
                  if (volumen > 0){
        volumen = volumen -5;
        System.out.println("Volumen: " + volumen);
        }
        }
        }
    public void subirCanal(){
        canal = canal + 1;
             if (power == true){
                 if (canal <= 100){
                 }else{
                     canal = 0;
                 }
        System.out.println("canal: " + canal);             
    }
    }
    public void bajarcanal(){
        canal = canal - 1;
            if (power == true){
                if (canal >= 0){
        }else{
                     canal = 100;
    }
                  System.out.println("canal: " + canal);
            }
    }
}
