/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author ronni
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
                
        double costo_articulo;
        String descripcion_articulo;
        int cantidad_requerida;
        double precio_unitario;
        double porcentaje = 15;
        double descuento;
        double valorTotal;
        
        System.out.println("Ingresar descripción del artículo deseado");
        descripcion_articulo = entrada.nextLine();
        
        System.out.println("Ingresar Cantidad requerida del artículo");
        cantidad_requerida = entrada.nextInt();
        
        if(cantidad_requerida < 0){
           System.out.println("Cantidad requerida inválida");
        } else {
        
            System.out.println("Ingresar costo del artículo");
            precio_unitario = entrada.nextDouble();

           valorTotal = precio_unitario * cantidad_requerida;


            if(cantidad_requerida < 50 ) {
                System.out.printf("El valor total es: %.2f\n", valorTotal);
            }
                if (cantidad_requerida > 50){
                descuento = (porcentaje * valorTotal)/100;
                valorTotal = valorTotal - descuento;
                   System.out.printf("El valor total es: %.2f\n", valorTotal);
                } else {

                     } 
        }
    }
} 
                   

        
                
        
    
    

