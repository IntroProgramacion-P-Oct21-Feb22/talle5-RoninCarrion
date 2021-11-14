/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 * 
 */
package proyecto1;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author ronni
 */
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // Declarar las variables
        double costo_kilovatio;
        double kilovatios_consumidos;
        int edad;
        double descuento;
        double porcentaje;
        double valorTotal = 0;
        double subtotal;
        porcentaje = 10;
        
        // Datos por teclado
        System.out.println("Ingresar el Costo Kilovatio/hora");
        costo_kilovatio = entrada.nextDouble();
        
        System.out.println("Ingresar el número de Kilovatios consumidos");
        kilovatios_consumidos = entrada.nextDouble();
        
        System.out.println("Ingresar edad del Usuario");
        edad = entrada.nextInt();
        
        
        subtotal = costo_kilovatio * kilovatios_consumidos;
        
        if (edad > 65) {
            descuento = (porcentaje * subtotal) / 100;
            valorTotal = valorTotal - descuento ;
        }
        System.out.printf("El valor a pagar de la planilla de luz es: %.2f",
                subtotal);
        }
        
        
        
    }
    

