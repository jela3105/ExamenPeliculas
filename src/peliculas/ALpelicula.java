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
        boolean salir = false;

        do {
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

            if (sn.next().toUpperCase().equals("NO")) {
                salir = true;
            }
        } while (salir == false);
    }

    public void bajas() {
        System.out.println("Ingrese la clave del objeto a eliminar");
        int clave = sn.nextInt();
        int posicion = -1;
        for (int i = 0; i < ALPeli.size(); i++) {
            if (ALPeli.get(i).getClave() == clave) {
                posicion = i;
            }
        }
        if (posicion != -1) {
            System.out.println("El titulo es: " + ALPeli.get(posicion).getTitulo());
            System.out.println("El costo es: $" + ALPeli.get(posicion).getCosto());
            System.out.println("¿DESEA ELIMINARLO?");
            System.out.println("SI O NO");
            if (sn.next().toUpperCase().equals("SI")) {
                ALPeli.remove(posicion);
                System.out.println("El objeto se elimino exitosamente");
            }
        } else {
            System.out.println("No se encontro el objeto");
        }
    }

    public void cambios() {
        boolean salir = false;
        System.out.println("Ingrese la clave de la pelicula a modificar");
        int clave = sn.nextInt();
        int posicion = -1;
        do {
            for (int i = 0; i < ALPeli.size(); i++) {
                if (ALPeli.get(i).getClave() == clave) {
                    posicion = i;
                }
            }
            if (posicion != -1) {
                boolean modificar = true;
                while (modificar) {
                    System.out.println("Clave: " + ALPeli.get(posicion).getClave());
                    System.out.println("¿Cuál desea modificar?");
                    System.out.println("1. Titulo: " + ALPeli.get(posicion).getTitulo());
                    System.out.println("2. Costo: " + ALPeli.get(posicion).getCosto());
                    int amodificar = sn.nextInt();

                    if (amodificar == 1) {
                        System.out.println("Ingrese el nuevo nombre");
                        ALPeli.get(posicion).setTitulo(sn.next());
                    } else if (amodificar == 2) {
                        System.out.println("Ingrese el nuevo costo");
                        ALPeli.get(posicion).setCosto(sn.nextInt());
                    }
                    System.out.println("Desea hacer otro cambio a la pelicula?");
                    System.out.println("SI O NO");

                    if (sn.next().toUpperCase().equals("NO")) {
                        modificar = false;
                    }
                }
            } else {
                System.out.println("No existe la pelicula tecleada");
            }
            System.out.println("DESEA SALIR DE CAMBIO?");
            if (sn.next().toUpperCase().equals("NO")) {
                        salir = false;
                    }
        } while (salir == true);
    }

    public void consultas() {
        for (int i = 0; i < ALPeli.size(); i++) {
            System.out.println("------------------------");
            System.out.println("Clave: " + ALPeli.get(i).getClave());
            System.out.println("Titulo: " + ALPeli.get(i).getTitulo());
            System.out.println("Costo: " + ALPeli.get(i).getCosto());

        }
    }
}
