/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peliculas;

import java.util.Scanner;


public class MPelicula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcionSeleccionada;
        ALpelicula ALp = new ALpelicula();
        while(!salir){
            System.out.println("----------BIENVENIDO----------");
            System.out.println("       Elige una opción        ");
            System.out.println("1. Altas");
            System.out.println("2. Bajas");
            System.out.println("3. Cambios");
            System.out.println("4. Consultas");
            System.out.println("5. Salir");
            opcionSeleccionada= sn.nextInt();
            if(opcionSeleccionada==1){
                ALp.altas();
            }else if(opcionSeleccionada==2){
                ALp.bajas();
            }else if(opcionSeleccionada==3){
                ALp.cambios();
            }else if(opcionSeleccionada==4){
                ALp.consultas();
            }else if(opcionSeleccionada==5){
                salir=true;
            }
        }
    }
    
}
