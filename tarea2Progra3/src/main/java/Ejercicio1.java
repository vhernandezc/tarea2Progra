
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vh367
 */
public class Ejercicio1 {
     public static void main(String[]args){

     Scanner leer=new Scanner (System.in);
     System.out.println("Ingrese el limite de la secuencia \n"); 
          int strLimite =leer.nextInt();

        int limite = strLimite;

          System.out.println("\n");
        for(int ind=1; ind<=limite; ind++){
          
            
            ArrayList<String> matriz = new ArrayList<String>();

// Añadimos 10 Elementos en el ArrayList

           matriz.add(""+(funcionTribonacci(ind))); 
            // System.out.println(ind);
           Iterator<String> nombreIterator = matriz.iterator();
           while(nombreIterator.hasNext()){
	String elemento = nombreIterator.next();
	System.out.print(elemento+" | ");
          
             
         // System.out.println(funcionTribonacci(ind) + "\t");
     if(ind%4==0){
            }
    
          
           
            }
              
        }}

	private static int funcionTribonacci(int num){
		if(num == 0 || num == 1 || num == 2){
			return 0;
		}
		if (num == 3) {
			return 1;
		} else {
			return funcionTribonacci(num-1) + funcionTribonacci(num-2) + funcionTribonacci(num-3);
		}
	}      

    }

