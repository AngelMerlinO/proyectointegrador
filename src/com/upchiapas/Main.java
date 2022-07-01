package com.upchiapas;
import com.upchiapas.models.Casa;
import com.upchiapas.models.Departamento;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        byte op, i;


        ArrayList<Casa> casas = new ArrayList<Casa>();
        ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
        ///////////////////////////////////////////////
        do {
            System.out.println("HOME BY DAMO");
            System.out.println("Menu de opciones");
            System.out.println("1.- Registrar inmueble ");
            System.out.println("2.- Mostrar inmueble");
            System.out.println("3.salir del programa");
            System.out.println("ingrese su opcion");
            op = entrada.nextByte();

            switch (op) {
                case 1:
                    System.out.println("selecione una opcion");
                    System.out.println("1. regitro de casa");
                    System.out.println("2.registro de un departamento");
                    System.out.println("3. volver al menu anterior");
                    i = entrada.nextByte();
                    do {
                        if (i == 1) {

                            System.out.println("Registro de casa");
                            System.out.println("Ingresa dimensiones de la casa");
                            double dimesiones = entrada.nextDouble();
                            System.out.println("Cuantos pisos tiene la casa?");
                            int pisos = entrada.nextInt();
                            System.out.println("Cantidad de cuartos de la casa?");
                            int cuartos = entrada.nextInt();
                            System.out.println("Cantidad de baños de la casa");
                            int baños = entrada.nextInt();
                            System.out.println("Cuenta con area de lavado ?");
                            String areaDeLavado = entrada.nextLine();
                            areaDeLavado = entrada.nextLine();
                            System.out.println("Cuenta con cochera?");
                            String cochera = entrada.nextLine();
                            System.out.println("Ingresa la ubicacion de la casa ");
                            String ubicacion = entrada.nextLine();
                            System.out.println("Nota extra: ");
                            String notaExtra = entrada.nextLine();
                            System.out.println("ingresa el numero de contacto ");
                            String numeroDeContacto = entrada.nextLine();
                            Casa casa = new Casa(dimesiones, pisos, cuartos, baños, areaDeLavado, cochera, ubicacion, notaExtra, numeroDeContacto);
                            casas.add(casa);
                            i+=2;

                        } else if (i==2){

                            System.out.println("Registro de departamento");
                            System.out.println("Ingrese las dimensiones del departamento");
                            double dimesiones = entrada.nextDouble();
                            System.out.println("Cuentas con baño?");
                            String bañoIndividual = entrada.nextLine();
                            bañoIndividual = entrada.nextLine();
                            System.out.println("Cuenta con internet?");
                            String internet = entrada.nextLine();
                            System.out.println("Esta semi amueblado el departamento?");
                            String semiAmueblado = entrada.nextLine();
                            System.out.println("Capacidad maxima de personas?");
                            int capacidadDePersonas = entrada.nextInt();
                            System.out.println("Cuenta con clima el departamento?");
                            String clima = entrada.nextLine();
                            System.out.println("Ingresa la ubicacion del departamento");
                            String ubicacion = entrada.nextLine();
                            System.out.println("Nota extra: ");
                            String notaExtra = entrada.nextLine();
                            System.out.println("ingresa el numero de contacto ");
                            String numeroDeContacto = entrada.nextLine();
                            Departamento departamento = new Departamento(dimesiones, bañoIndividual, internet, semiAmueblado, capacidadDePersonas, clima, ubicacion, notaExtra, numeroDeContacto);
                            departamentos.add(departamento);
                            i++;
                        }
                    }while(i!=3);
                    System.out.println("xxxx");
                    break;
                case 2:
                    System.out.println("que desea visualisar  1=casa|2=departamento");
                    i = entrada.nextByte();
                    if (i == 1) {
                        for (int y = 0; y < casas.size(); y++) {
                            System.out.println(casas.get(y).toString());
                        }
                    } else {
                        for (int y = 0; y <departamentos.size(); y++) {
                            System.out.println(departamentos.get(y).toString());
                        }
                    }
                        break;
                case 3:
                    System.exit(0);
                    break;

            }
        }while (op!=3);
        System.out.println("regrese pronto");
    }
}
