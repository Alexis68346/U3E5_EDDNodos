package cola2;

import java.util.Scanner;

public class Cola2 {
    public static void main(String[] args) {
    Cola cola =new Cola();
    int opc, elemento, opc2=0;
     
     Scanner leer = new Scanner(System.in);
       do{ 
           System.out.println("Menu de opciones"
                   + "\n\n ELIJA UNA OPCION: "
                   + "\n 1.- Agregar 10 numeros."
                   + "\n 2.- Eliminar el primer Numero."
                   + "\n 3.- Mostra lista"
                   + "\n 4.- Salir");
    
        opc=leer.nextInt();
        switch(opc){
            case 1:
            Scanner Leer = new Scanner(System.in);
                for (int i = 0; i < 10; i++) {
                    System.out.print("inserte el elemento "+(i+1)+":");
            elemento=Leer.nextInt();
            cola.empuja(elemento);
                }
                break;
            case 2:
                cola.eliminar();
                System.out.println();
                break;
            case 3:
                cola.mostrar();
                break;
            case 4: 
                System.exit(0);
                break;
            default:
                System.out.println("Esa opcion no existe, ingrese otro numero");
        }
        
          System.out.println("Desea realizar otros proceso:"
                  + "\n1.- Si"
                  + "\n2.- No");
        
       opc2=leer.nextInt();
       }while(opc2!=2);


    }
    
}
