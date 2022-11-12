package contarcaracteres;

import java.util.Scanner;

public class ContarCaracteres {

	public static void main(String[] args) {
	
	//Creado por @Andres Ramirez C.I 30442653
		
		//Variables:
		 String cadena = "";
		 char [] Arraycadena;
		 char caracter;
		 int contador=0;
		 
		 //Leer una palabra
		     System.out.println ("Escriba una palabra: ");
		     Scanner Leer=new Scanner(System.in);
			 cadena = Leer.nextLine();
			 
		//Guardar en las variables el valor del texto y sus caracteres	 
			 Arraycadena = cadena.toCharArray();
			 
		//Ciclo de obtencion del caracter
			 for (int i = 0; i < Arraycadena.length; i++){
			     caracter = Arraycadena [i];
			     
       //Ciclo de comparacion
			     for (int j = 0; j < Arraycadena.length; j++){
			         if (Arraycadena[j] == caracter) {
			             contador++;
			         }
			     }
	   //Imprimir resultado en pantalla
                     if(contador == 1) {
			     System.out.println("La letra "+Arraycadena[i]+ " se ha repetido "+ contador+" vez");
			     contador = 0;}
                     else { 
                 System.out.println("La letra "+Arraycadena[i]+ " se ha repetido "+ contador+" veces");
    			 contador = 0;}

			 }
      }

	}