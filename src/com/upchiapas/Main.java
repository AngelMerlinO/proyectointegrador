package com.upchiapas;
import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        byte op,i;
        //////////////////////////
        int ;






       //////////////////////////////////
        System.out.println("HOME BY DAMO");
        System.out.println("Menu de opciones");
        System.out.println("1. Registrar inmueble ");
        System.out.println("2. Mostrar inmueble");
        op = entrada.nextByte();

        switch (op){
            case 1:
                System.out.println("que desea registar 1=casa|2=departamento");
                i = entrada.nextByte();
                if (i==1){

                    System.out.println("Registro de casa");
                    System.out.println("Ingresa dimensiones de la casa");
                    System.out.println("Cuantos pisos tiene la casa?");
                    System.out.println("Cantidad de cuartos de la casa?");
                    System.out.println("Cantidad de baños de la casa");
                    System.out.println("Cuenta con area de lavado ?");
                    System.out.println("Cuenta con cochera?");
                    System.out.println("Ingresa la ubicacion de la casa ");
                    System.out.println("Nota extra: ");

                }else{

                    System.out.println("Registro de departamento");
                    System.out.println("Ingrese las dimensiones del departamento");
                    System.out.println("Cuentas con baño?");
                    System.out.println("Cuenta con internet?");
                    System.out.println("Esta semi amueblado el departamento?");
                    System.out.println("Capacidad maxima de personas?");
                    System.out.println("Cuenta con clima el departamento?");
                    System.out.println("Ingresa la ubicacion del departamento");
                    System.out.println("Nota extra: ");

                }

                System.out.println("");
                break;
            case 2:
                break;
            default:

        }
    }
}
