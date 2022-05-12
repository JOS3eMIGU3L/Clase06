package EstRepetitivas;

import java.util.Scanner;

public class EjerciciosRepetitivas {

static Scanner lt=new Scanner(System.in);

public static void ejer41While() {

    
}

 
public static void pregunta2JMP() {
    System.out.println("Ingrese el operaor");
    char operador=lt.next().charAt(0); 
    switch (operador) {
        case '+': System.out.println("debes sumar");break;
        case '%': System.out.println("debes sacar el modulo");break;
        default:break;
    }     
    }

    

    public static void main(String[] args) {
        pregunta2JMP();
    }
}
