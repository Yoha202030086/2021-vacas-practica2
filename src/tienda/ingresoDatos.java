package src.tienda;

import java.util.Scanner;

public class ingresoDatos {
    
    static Scanner scanner = new Scanner(System.in);
    
    private static void imprimirMensaje(String mensaje){
        System.out.println(mensaje);
    }

    public static int getEntero(String mensaje, boolean negativo){

    
    imprimirMensaje(mensaje);
    int tmp = scanner.nextInt();
    scanner.nextLine();

     if( negativo ){
         
         return tmp; 
     }

     if(tmp<0){
       do{
           System.out.println("No se pueden ingresar numeros negativos");
        imprimirMensaje(mensaje);
         tmp = scanner.nextInt();
       } 
       while(tmp<0);
     }
     return tmp;
     }
public static String getTexto(String mensaje){
    imprimirMensaje(mensaje);
    String res = scanner.nextLine();
    return res;

}

}





