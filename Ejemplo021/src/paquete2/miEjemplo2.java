/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author Salas
 */
public class miEjemplo2 {
    public static void main(String[] args) {
        // este es el metodo principal 
        String nombre_persona;// variable para almacenar un nombre
        String apelllido_persona;
        int edad;
        nombre_persona = "Rene Rolando";
        apelllido_persona = "Elizalde Solano";
        edad =36;
        /*
        System.out.println("Mi nombre es: "+nombre_persona+"\n\tMi apellido es: "
                +apelllido_persona);
        */
        System.out.printf("Minombre es: %s\nMi apellido es: %s\nMi edad es: ",
                nombre_persona,apelllido_persona,edad);
    }
    }
