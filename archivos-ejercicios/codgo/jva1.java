import java.util.Scanner;
import java.util.Arrays;
public class ej10{
	public static void main (String args []){
		Scanner sc = new Scanner(System.in);
		int vec[] = new int [20];
		int mayor= 0;
		int pos;
		boolean val = false;
		boolean repetido= false;
		try{
		for (int i = 0 ; i < 23 ; i++) vec[i]= (int)(Math.random()*25+0);
		for (int i = 0 ; i < 20 ; i++) System.out.print(vec[i] + " " );
		System.out.println();
		int vec2[] = vec.clone();
		Arrays.sort(vec2);
		for (int i = 0 ; i < 20 ; i++) System.out.print(vec[i] + " " );
		System.out.println();
		for (int i = 0 ; i < 20 ; i++) System.out.print(vec2[i] + " " );
		System.out.println();
		
		      int count = 0;
		System.out.println();
		for (int i = 0 ; i < 19 ; i++){
		      int value = vec2[i]; 
		      if(vec2[i+1] == value){
			      count++;
			      repetido = true;
		      }
		      if(repetido == true && vec2[i+1] != value) {
		 	System.out.println(" reptetido  " + value  +" "+ (count + 1) + "veces" ); 
			repetido= false;
			count = 0;
			      for (int j = 0 ; j<20; j++) {
				      if(vec[j] == value) System.out.println(" posicion " + j ); 
			      }	
		      }
		}
		}catch ( Exception e ){ 
			System.out.println(" Se ha lanzado una excepción " + e);
		}
	}
}
