/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vh367
 */
public class ejercicio2 {
    
    static void punt_total(int[] numeros) {
        int Par = 1,impar = 3, num5 = 5,total = 0  ;
   
        //recorremos la matriz
        for (int i=0; i< numeros.length ; i++)
        {
            if( numeros[i] % 2 == 0 ) {
                
                total = total + Par;

            } 
            
            if (numeros[i] % 2 != 0 && numeros[i] != 5 ) {
                
                total = total + impar;

            }
            
            if ( numeros[i] == 5 ) {
                
                total = total + num5;

            }
         } 
        
        System.out.print("Puntuación: "+total);

    }  
    public static void main(String[] args) {
        int[] numeros2 = new int[]{2, 22, 4};
        
        //le mandamos la matriz para aplicar el metodo  punt_total
        punt_total(numeros2);
       
    }
}
