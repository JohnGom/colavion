/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package colaavion;

import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrador
 */
public class ColaAvion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
       
        
        
        String opc ;
        String min ;
        Object elem=0;
        int ret =0;
        
        Scanner num = new Scanner(System.in);
        ColaLinealFrente q = new ColaLinealFrente(4);
        
        
        do{
        System.out.println("esbriba la obcion que desee que se realize ");
        System.out.println(" E - llegada");
        System.out.println(" S - salida");   
        System.out.println(" T - retirar");
        System.out.println(" X - salir");
       
        min = num.next();
        
        opc = min.toUpperCase();
        
        if (opc.equals("E")){
            
             System.out.println("ingrese el dato del avion");
             elem = num.next();
                try {
                    q.insertar(elem);
                } catch (Exception ex) {
                    System.out.println("................................");
                    System.out.println("  la cola se encuentra llena");
                    System.out.println("................................");
                }
            
            
        }else if (opc.equals("S")){
            
            try {
                q.quitar();
            } catch (Exception ex) {
                System.out.println("");
            }
             q.mostrar();
            
        }else if(opc.equals("T")){
             
            System.out.println("ingrese la pocision del avion q desea retirar");
            ret = num.nextInt();
            q.moverAlFrente(ret);                     
            q.mostrar();
            
        }else{
            System.out.println("...........................................");
            System.out.println("por escriba una de las opciones estipuladas");
            System.out.println("...........................................");
        }
        
        
        
                
         }while(!opc.equals("X"));
    }
    
}






