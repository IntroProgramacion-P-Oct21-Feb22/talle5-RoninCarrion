/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ronni
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // Declaración de variables
        String marca_auto;
        String origen_auto;
        double costo_auto;
        double porcentaje_japon = 30;
        double porcentaje_alemania = 20;
        double porcentaje_italia = 15;
        double porcentaje_usa = 8;
        double impuesto_japon;
        double impuesto_alemania;
        double impuesto_italia;
        double impuesto_usa;
        double precio_Venta;
        
        // Ingresar datos por teclado 
        
        System.out.println("Ingresar marca de Auto");
        marca_auto = entrada.nextLine();

        System.out.println("Ingresar origen del Auto");
        origen_auto = entrada.nextLine();

        System.out.println("Ingresar costo del Auto");
        costo_auto = entrada.nextDouble();
        
        // Condicionales 
        
        if (costo_auto < 0) {
            System.out.println("Valor fuera del rango permitido");
        } else {
            if (origen_auto.equals("Alemania")|| 
                    origen_auto.equals("alemania")) {
                impuesto_alemania = (costo_auto * porcentaje_alemania)/100;
                precio_Venta = impuesto_alemania + costo_auto;
                System.out.printf("El impuesto por pagar es: %.2f\n"
                        + "El precio de venta total es: %.2f\n"
                        ,impuesto_alemania
                        ,precio_Venta);
            } else {
                if (origen_auto.equals("Japón")|| origen_auto.equals("japon")||
                        origen_auto.equals("japón")) {
                    impuesto_japon = (costo_auto * porcentaje_japon)/100;
                    precio_Venta = impuesto_japon + costo_auto;
                    System.out.printf("El impuesto por pagar es: %.2f\n"
                            + "El precio de venta total es: %.2f\n"
                            , impuesto_japon
                            , precio_Venta);
                } else {
                    if (origen_auto.equals("Italia")||
                            origen_auto.equals("italia")) {
                        impuesto_italia = (costo_auto * porcentaje_italia)/100;
                        precio_Venta = impuesto_italia + costo_auto;
                        System.out.printf("El impuesto por pagar es: %.2f\n"
                                + "El precio de venta total es: %.2f\n"
                                ,impuesto_italia
                                ,precio_Venta);
                    } else {
                        if (origen_auto.equals("USA")|| 
                                origen_auto.equals("usa")) {
                            impuesto_usa = (costo_auto * porcentaje_usa)/100;
                            precio_Venta = impuesto_usa + costo_auto;
                            System.out.printf("El impuesto por pagar es: %.2f\n"
                                    + "El precio de venta total es: %.2f\n"
                                    ,impuesto_usa
                                    ,precio_Venta);
                        } else {
                            System.out.printf("Exonerado de impuestos\n"
                                    + "El precio de venta total es: %.2f\n"
                                    , costo_auto);
                        }
                    }
                }
            }
        }
    }

}