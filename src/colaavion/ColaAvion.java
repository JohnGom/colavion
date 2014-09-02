/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package colaavion;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class ColaAvion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
       
        
        
        String opc ;
        int elem=0;
        int ret =0;
        
        Scanner num = new Scanner(System.in);
        ColaLinealFrente q = new ColaLinealFrente(4);
        
        
        do{
        System.out.println("esbriba la obcion que desee que realize el avion");
        System.out.println(" E - llegada");
        System.out.println(" S - salida");   
        System.out.println(" T - retirar");
        System.out.println(" X - salir");
       
        opc = num.next();
        opc.toUpperCase();
        
        if (opc.equals("E")){
            if(!q.colaLlena()){
             System.out.println("ingrese el dato del avion");
             elem = num.nextInt();
             q.insertar(elem);
            }else{
                 System.out.println("");
                System.out.println("la cola ya esta llena");
                System.out.println("");
            }
        }else if (opc.equals("S")){
            
            q.quitar();
             q.mostrar();
            
        }else if(opc.equals("T")){
             
            System.out.println("ingrese la pocision del avion q desea retirar");
            ret = num.nextInt();
            q.moverAlFrente(ret);                     
            q.mostrar();
        }
        
        
        
                
         }while(!opc.equals("x"));
    }
    
}






