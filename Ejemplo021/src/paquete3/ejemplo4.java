/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;
import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class ejemplo4 {
   public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        String nombre_persona, ciudad;
        int edad, n1, n2;
        double prom;

        System.out.println("Ingrese su nombre porfavor:");
        nombre_persona = e.nextLine();
        
        System.out.println("Ingrese su edad porfavor:");
        edad = e.nextInt();
        
        System.out.println("nota 1:");
        n1 = e.nextInt();
        
        System.out.println("nota 2:");
        n2 = e.nextInt();
        e.nextLine();  // limpiador
        
        System.out.println("Ingrese su ciudad :");
        ciudad = e.nextLine();
        
        
        //calculo de el promedio 
        prom = (n1 + n2) / 2;

        System.out.printf("Me llamo: %s\nMi ciudad es: %s\nMi edades es: %d"
                + "\nMis notas son: %d y %d\nMi promedio es: %.2f ",
                 nombre_persona, ciudad, edad, n1, n2, prom);
    }
    }
