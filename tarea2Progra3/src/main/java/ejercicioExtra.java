
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
public class ejercicioExtra {
    
     public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  System.out.println("ingresa la palabra:");
  String str=in.next();
  
  char[] a=str.toCharArray();
  char[] ch=new char[str.length()];

  for(int i=0,j=str.length()-1;i<=str.length()-1;i++,j--) {
   ch[j]=a[i];
  }
  
  String str1=new String(ch);
  
  if(str.equals(str1)==true) 
     System.out.println ("La palabra " +str+" es un palíndromo");
  else  System.out.println ("La palabra "+str+ " no es un palíndromo");
  in.close();
 }
}
