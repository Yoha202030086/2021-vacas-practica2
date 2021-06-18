package src.pelicula;

import src.tienda.ingresoDatos;

public class VectorPelicula {

    private pelicula[] peli = new pelicula[50];
    private int siguiente;

    public VectorPelicula() {
        siguiente = 1;
    }

    public void agregarPelicula(String nombre,String categoria, int año){
        if (siguiente > 50){
            System.out.println("Limite de peliculas alcanzado");
        }
        else{
            peli[(siguiente-1)] = new pelicula(siguiente, año,nombre,categoria);
        }
        siguiente++;
    }

    public void agregarPelicula(){
        String nombre = ingresoDatos.getTexto("Ingrese el nombre de la película");
        String categoria=ingresoDatos.getTexto("Ingrese a que categoría pertenece");
        int año = ingresoDatos.getEntero("Ingrese el número el año", false);

        agregarPelicula(nombre, categoria,año);

    }

    public void mostrarPelicula(){
        System.out.println("\n\n Peliculas de memorabilia");
        for (int i = 0; i < (siguiente-1); i++) {
            System.out.println("-"+i+") "+peli[i].mostrarDatos());
            //System.out.println("-"+i+") "+clientes[i].getId() + " nombre "+clientes[i].getNombre()+ " telefono "+clientes[i].getTelefono());
            
        }

        System.out.println("\n\n");
    }

    public void ordenarPelicula(boolean ascendente){
        boolean cambio = true;

        for (int i = 1; i < (siguiente-1); i++) {
            for (int j = 0; j < (siguiente-1-i); j++) {
                //  String.compareTo(String)
                //   [-oo , + oo]
                if (ascendente)
                    cambio= (peli[j].getNombre().compareTo(peli[j+1].getNombre()) > 0 );
                else 
                    cambio= (peli[j].getNombre().compareTo(peli[j+1].getNombre()) < 0 );

                if(cambio ){
                    //clientes i va antes que clientes j <0 descendente
                    pelicula aux = peli[j];
                    peli[j] = peli[j+1];
                    peli[j+1]= aux;
                }
            }
        }

    }



}

    

