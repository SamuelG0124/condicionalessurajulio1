package org.example;

import java.text.DecimalFormatSymbols;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DateFormatSymbols;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {


        Scanner entradaTeclado=new Scanner(System.in);

        int anioNacimientoCliente;
        int anioActual;
        String nombresCompletosCliente;
        double salarioCliente;
        String licorFavoritoCLiente;
        String cantanteFavoritoCliente;
        double valorIva;
        byte numeroMesa;
        double valorDescuento;



       //ASIGNANDO VARIABLES
        System.out.print("Digita tus nombres y apellidos");
        nombresCompletosCliente=entradaTeclado.nextLine();

        System.out.print("Digita tu licor favorito: ");
        licorFavoritoCLiente=entradaTeclado.nextLine();

        System.out.print("Digita tu cantante favorito: ");
        cantanteFavoritoCliente=entradaTeclado.nextLine();


        System.out.print("Digite su año de nacimiento: ");
        anioNacimientoCliente=entradaTeclado.nextInt();

        System.out.print("Digite el año actual: ");
        anioActual=entradaTeclado.nextInt();

        System.out.print("Digita el salario del cliente: ");
        salarioCliente=entradaTeclado.nextInt();



        System.out.print("Valor del IVA: ");
        valorIva=entradaTeclado.nextDouble();

        System.out.print("valor del descuento: ");
        valorDescuento=entradaTeclado.nextDouble();

        System.out.print("Numero de la mesa del cliente: ");
        numeroMesa=entradaTeclado.nextByte();






        //PROCESO DEL ALGORITMO
        //1. Calcular la edad del usuario

        int edadUsuario= anioActual -anioNacimientoCliente;

        System.out.println("Apreciado "+nombresCompletosCliente+ " usted tiene "+edadUsuario+ " años");

        //2. Compara y decidir sobre el salario
        final double valorSalarioMinimo=1300000;

        double numeroSalarios=salarioCliente/valorSalarioMinimo;
        System.out.println("Usted gana "+numeroSalarios+ " SMLV");

        String formatoDos = String.format("%.2f",numeroSalarios);
        System.out.println("Usted gana " + formatoDos+ " SMLV");
                //Codigo para poner la cantidad de DECIMALES

        //Condición logica para validar si tiene platica
        if (numeroSalarios >= 3.0){
            //Camino de verdad
            System.out.println("Bienvenido Patron");

        }else {
            //Camino de negación
            System.out.println("Chao arrastrado");
        }







    }
}