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
    public void bajas(){
        System.out.println("Ingrese la clave del objeto a eliminar");
        int clave = sn.nextInt();
        int posicion=-1;
        for(int i=0; i< ALPeli.size() ;i++){
            if(ALPeli.get(i).getClave()==clave){
                posicion = i;
            }
        }
        if(posicion!=-1){
            System.out.println("El titulo es: " + ALPeli.get(posicion).getTitulo());
            System.out.println("El costo es: $"+ ALPeli.get(posicion).getCosto());
            System.out.println("¿DESEA ELIMINARLO?");
            System.out.println("SI O NO");
            if(sn.next().toUpperCase().equals("SI")){
                  ALPeli.remove(posicion);
                  System.out.println("El objeto se elimino exitosamente");
              }
        }else{
            System.out.println("No se encontro el objeto");
        }
    }

    void cambios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void consultas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
