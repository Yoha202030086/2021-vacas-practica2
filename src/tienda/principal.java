package src.tienda;

import src.pelicula.VectorPelicula;

public class principal {

    public static void main(String[] args) {
        
    principal p = new principal();
    }
    

    private VectorPelicula tablapelicula = new VectorPelicula();
    
    public principal(){

    
    int menu = 0;
    while(menu >= 0 ){
        System.out.println("Bienvenido a memorabilia \n\n");

        System.out.println("1. Ingreso de peliculas");
        System.out.println("1. mostrar peliculas");
        System.out.println("-1. Salir");
        System.out.println("\n");
        menu = ingresoDatos.getEntero("ingresar opcion", true);

        if(menu==1);
        //ingreso datos
        tablapelicula.agregarPelicula();
    }

    }
}

