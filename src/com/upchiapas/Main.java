package com.upchiapas;
import com.upchiapas.models.Casa;
import com.upchiapas.models.Departamento;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        byte op, i;
        int pisos, cuartos, baños, capacidadDePersonas = 0;
        double dimesiones = 0.0;
        String areaDeLavado, cochera, ubicacion, notaExtra, numeroDeContacto, bañoIndividual, internet, semiAmueblado, clima;

        ArrayList<Casa> casas = new ArrayList<Casa>();
        ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
        ///////////////////////////////////////////////
        System.out.println("HOME BY DAMO");
        System.out.println("Menu de opciones");
        System.out.println("1.- Registrar inmueble ");
        System.out.println("2.- Mostrar inmueble");
        System.out.println("ingrese su opcion");
        op = entrada.nextByte();

        switch (op) {
            case 1:
                System.out.println("que desea registar 1=casa|2=departamento");
                i = entrada.nextByte();
                if (i == 1) {

                    System.out.println("Registro de casa");
                    System.out.println("Ingresa dimensiones de la casa");
                    dimesiones = entrada.nextDouble();
                    System.out.println("Cuantos pisos tiene la casa?");
                    pisos = entrada.nextInt();
                    System.out.println("Cantidad de cuartos de la casa?");
                    cuartos = entrada.nextInt();
                    System.out.println("Cantidad de baños de la casa");
                    baños = entrada.nextInt();
                    System.out.println("Cuenta con area de lavado ?");
                    areaDeLavado = entrada.nextLine();
                    areaDeLavado = entrada.nextLine();
                    System.out.println("Cuenta con cochera?");
                    cochera = entrada.nextLine();
                    System.out.println("Ingresa la ubicacion de la casa ");
                    ubicacion = entrada.nextLine();
                    System.out.println("Nota extra: ");
                    notaExtra = entrada.nextLine();
                    System.out.println("ingresa el numero de contacto ");
                    numeroDeContacto = entrada.nextLine();
                    Casa casa = new Casa(dimesiones, pisos, cuartos, baños, areaDeLavado, cochera, ubicacion, notaExtra, numeroDeContacto);
                    casas.add(casa);

                } else {

                    System.out.println("Registro de departamento");
                    System.out.println("Ingrese las dimensiones del departamento");
                    dimesiones = entrada.nextDouble();
                    System.out.println("Cuentas con baño?");
                    bañoIndividual = entrada.nextLine();
                    System.out.println("Cuenta con internet?");
                    internet = entrada.nextLine();
                    System.out.println("Esta semi amueblado el departamento?");
                    semiAmueblado = entrada.nextLine();
                    System.out.println("Capacidad maxima de personas?");
                    capacidadDePersonas = entrada.nextInt();
                    System.out.println("Cuenta con clima el departamento?");
                    clima = entrada.nextLine();
                    System.out.println("Ingresa la ubicacion del departamento");
                    ubicacion = entrada.nextLine();
                    System.out.println("Nota extra: ");
                    notaExtra = entrada.nextLine();
                    System.out.println("ingresa el numero de contacto ");
                    numeroDeContacto = entrada.nextLine();
                    Departamento departamento = new Departamento(dimesiones, bañoIndividual, internet, semiAmueblado, capacidadDePersonas, clima, ubicacion, notaExtra, numeroDeContacto);
                    departamentos.add(departamento);
                }

                System.out.println("");
                break;
            case 2:
                System.out.println("que desea visualisar  1=casa|2=departamento");
                i = entrada.nextByte();
                if (i == 1) {
                    for (int y = 0; y < casas.size(); y++) {
                        System.out.println(casas.get(y));
                    }
                } else {
                    for (int y = 0; y < departamentos.size(); y++) {
                        System.out.println(departamentos.get(y));

                    }
                    break;
                }
        }
    }
}
