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

        do {
            System.out.println("+------------------------+");
            System.out.println("|     HOME BY DAMO       |");
            System.out.println("|                        |");
            System.out.println("|    Menú de opciones    |");
            System.out.println("|                        |");
            System.out.println("| 1.- Registrar Inmueble |");
            System.out.println("| 2.- Visualizar Inmueble|");
            System.out.println("| 3.- Salir Del Programa |");
            System.out.println("|                        |");
            System.out.println("|   Ingrese Su Opción    |");
            System.out.println("+------------------------+");
                op = entrada.nextByte();

            switch (op) {
                case 1:
                    System.out.println("+----------------------------------+");
                    System.out.println("|       Selecione Una Opción       |");
                    System.out.println("|                                  |");
                    System.out.println("| 1.- Regitro De Casa              |");
                    System.out.println("| 2.- Registro De Un Departamento  |");
                    System.out.println("| 3.- Volver Al Menú Anterior      |");
                    System.out.println("|                                  |");
                    System.out.println("|         Ingrese Su Opción        |");
                    System.out.println("+----------------------------------+");
                        i = entrada.nextByte();

                    do {
                        if (i == 1) {
                            System.out.println("+-----------------------------------+");
                            System.out.println("|       Registro De Casa                             |");
                            System.out.println("| Ingresa Dimensiones De La Casa En Metros Cuadrados |");
                                double dimesiones = entrada.nextDouble();
                            System.out.println("| ¿Cuantos Pisos Tiene La Casa?                      |");
                                int pisos = entrada.nextInt();
                            System.out.println("| ¿Cantidad De Cuartos De La Casa?                   |");
                                int cuartos = entrada.nextInt();
                            System.out.println("| ¿Cantidad De Baños De La Casa?                     |");
                                int baños = entrada.nextInt();
                            System.out.println("| ¿Cuenta Con Area De Lavado?                        |");
                                String areaDeLavado = entrada.nextLine();
                            areaDeLavado = entrada.nextLine();
                            System.out.println("| ¿Cuenta Con Cochera?                               |");
                                String cochera = entrada.nextLine();
                            System.out.println("| Ingresa La Ubicacion De La Casa                    |");
                                String ubicacion = entrada.nextLine();
                            System.out.println("| Nota Extra:                                        |");
                                String notaExtra = entrada.nextLine();
                            System.out.println("| Ingresa El Numero De Contacto                      |");
                            String numeroDeContacto = entrada.nextLine();
                            System.out.println("+----------------------------------------------------+");

                            Casa casa = new Casa(dimesiones, pisos, cuartos, baños, areaDeLavado, cochera, ubicacion, notaExtra, numeroDeContacto);
                            casas.add(casa);
                            i+=2;

                        } else if (i==2){
                            System.out.println("+--------------------------------------------+");
                            System.out.println("|          Registro De Departamento          |");
                            System.out.println("| Ingrese Las Dimensiones Del Departamento En Metros Cuadrados |");
                                double dimesiones = entrada.nextDouble();
                            System.out.println("| ¿Cuentas Con Baño?                                           |");
                            String bañoIndividual = entrada.nextLine();
                                bañoIndividual = entrada.nextLine();
                            System.out.println("| Cuenta Con Internet?                                         |");
                                String internet = entrada.nextLine();
                            System.out.println("| ¿Esta Semi Amueblado El Departamento?                        |");
                                String semiAmueblado = entrada.nextLine();
                            System.out.println("| ¿Capacidad Máxima De Personas?                               |");
                                int capacidadDePersonas = entrada.nextInt();
                            System.out.println("| ¿Cuenta Con Clima El Departamento?                           |");
                                String clima = entrada.nextLine();
                                clima = entrada.nextLine();
                            System.out.println("| Ingresa La Ubicación Del Departamento                        |");
                                String ubicacion = entrada.nextLine();
                            System.out.println("| Nota Extra:                                                  |");
                                String notaExtra = entrada.nextLine();
                            System.out.println("| Ingresa El Número De Contacto                                |");
                                String numeroDeContacto = entrada.nextLine();
                            System.out.println("+--------------------------------------------------------------+");

                            Departamento departamento = new Departamento(dimesiones, bañoIndividual, internet, semiAmueblado, capacidadDePersonas, clima, ubicacion, notaExtra, numeroDeContacto);
                            departamentos.add(departamento);
                            i++;
                        }
                    }while(i!=3);
                    System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                    break;
                case 2:
                    System.out.println("+-----------------------------------------------------+");
                    System.out.println("| ¿Qué Desea Visualisar?  1 = casa | 2 = departamento |");
                    System.out.println("+-----------------------------------------------------+");
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
        System.out.println("+----------------+");
        System.out.println("| Regrese Pronto |");
        System.out.println("+----------------+");
    }
}
