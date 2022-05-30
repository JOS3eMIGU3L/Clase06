package Tarea;

import java.util.Scanner;

public class SalarioAnual {
    static Scanner lt=new Scanner(System.in);

    public static void SalarioAnual() {
        double salario=1500;
        int contador=1;

        while(contador<=6){ 
        System.out.println("El salario del año :" +(contador-1)+ "es:" + salario); 
        salario=salario+(salario*0.10);
        contador++;
     }
     System.out.println("El salario del año :" +(contador-1)+ "es:" + salario);
    }
    
    }

