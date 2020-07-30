/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peliculas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jela3
 */
public class ALpelicula {

    private ArrayList<Pelicula> ALPeli = new ArrayList<Pelicula>();
    Scanner sn = new Scanner(System.in);

    public void altas() {
        boolean salir=false;
        
        do{
            System.out.println("Ingrese la clave");
            Pelicula pelicula = new Pelicula();
            pelicula.setClave(sn.nextInt());
            System.out.println("Ingrese el titulo");
            String titulo = sn.next();
            pelicula.setTitulo(titulo);
            System.out.println("Ingrese el costo");
            pelicula.setCosto(sn.nextInt());
            ALPeli.add(pelicula);
              System.out.println("Se ha agregado la pelicula correctamente");
              
              
              System.out.println("¿Desea ingresar otro objeto?");
              System.out.println("SI O NO");
              
              
              if(sn.next().toUpperCase().equals("NO")){
                  salir=true;
              }
        } while(salir == false);
    }
}
