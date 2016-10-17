/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_ficha;

/**
 *
 * @author otorradomiguez
 */
public class Proyecto_Ficha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tiradas t1=new Tiradas();
        System.out.println(" list 10d8 "+t1.roll_list(10,8));
        System.out.println(" suma 4d6 "+t1.roll_suma(4,6));
        System.out.println(" list 3d10 "+t1.roll_list(3, 10));
        System.out.println(" mbaja 3d6 "+t1.roll_media_baja(3,6));
        System.out.println(" mmedia 3d6 "+t1.roll_media_media(3,6));
        System.out.println(" malta 3d6 "+t1.roll_media_alta(3,6));
        System.out.println(" alta "+t1.roll_alto(10, 10, 3));
      
        
    }
    
}
