package src.tienda;

import src.pelicula.VectorPelicula;

public class principal {

    public static void main(String[] args) {
        
    principal p = new principal();
    }
    
    public VectorPelicula getVectorpelicula() {
        return vectorpelicula;
    }

    public void setVectorpelicula(VectorPelicula vectorpelicula) {
        this.vectorpelicula = vectorpelicula;
    }

    private VectorPelicula vectorpelicula = new VectorPelicula();
    
    public principal(){

    
    int menu = 0;
    while(menu >= 0 ){
        System.out.println("Bienvenido a memorabilia \n\n");
        System.out.println("1. Ingreso de peliculas");
        System.out.println("-1. Salir");
        System.out.println("\n");
        menu = ingresoDatos.getEntero("ingresar opcion", true);
        






    }

    }
}

