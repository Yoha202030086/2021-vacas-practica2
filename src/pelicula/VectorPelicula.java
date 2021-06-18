package src.pelicula;

import src.tienda.ingresoDatos;

public class VectorPelicula {

    private pelicula[] pe = new pelicula[50];
    private int siguiente;

    public VectorPelicula() {
        siguiente = 1;
    }

    public void agregarPelicula(String nombre,String categoria, int año){
        if (siguiente > 50){
            System.out.println("Limite de peliculas");
        }
        else{
            pe[(siguiente-1)] = new pelicula(siguiente, año,nombre,categoria);
        }
        siguiente++;
    }

    public void agregarPelicula(){
        String nombre = ingresoDatos.getTexto("Ingrese nombre de la película");
        String categoria=ingresoDatos.getTexto("Ingrese a que categoría pertenece");
        int año = ingresoDatos.getEntero("Ingrese el número el año", false);

        agregarPelicula(nombre, categoria,año);

    }

    public void mostrarPelicula(){
        System.out.println("\n\n Peliculas de memorabilia");
        for (int i = 0; i < (siguiente-1); i++) {
            System.out.println("-"+i+") "+pe[i].mostrarDatos());
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
                    cambio= (pe[j].getNombre().compareTo(pe[j+1].getNombre()) > 0 );
                else 
                    cambio= (pe[j].getNombre().compareTo(pe[j+1].getNombre()) < 0 );

                if(cambio ){
                    //clientes i va antes que clientes j <0 descendente
                    pelicula aux = pe[j];
                    pe[j] = pe[j+1];
                    pe[j+1]= aux;
                }
            }
        }

    }



}

    

