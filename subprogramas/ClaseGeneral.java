
package subprogramas;

import java.util.Scanner;

public class ClaseGeneral {


        static Scanner leerT=new Scanner(System.in);
        static Aritmetica obj=new Aritmetica();
        static Persona objP=new Persona();
        static LeerTeclado objLT=new LeerTeclado();

    public static void main(String[] args) {
        /*System.out.println("Ingrese el Primer valor");
        int aX=leerT.nextInt();
        System.out.println("Ingrese el Segundo Valor:");
        int bX=leerT.nextInt();
        int result=obj.sumar(aX, bX);
        System.out.println("La Suma es:"+result);*/
        System.out.println("Ingrese su Nombre:");
        objP.nombre=leerT.next();
    System.out.println("Ingrese su de DNI:");
        objP.dni=leerT.next(); 
        System.out.println("Ingrese una comida");
        
        objP.comer(leerT.next());;
    }

}