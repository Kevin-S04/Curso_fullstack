import java.util.Scanner;


public class calculadora{
	public static void main(String args[]){
		Scanner datos=new Scanner(System.in);

		//Variables
		float n1 , n2, resultS, resultM;
		float resultR, resultD;
		

		//Ingreso de datos
		System.out.println("Hola , A mi Calculadora");
		System.out.println("Ingrese el primer número:");
		n1=datos.nextInt();
		System.out.println("Ingreseel Segundo numero:");
		n2=datos.nextInt();
		
		//Operacion
		resultS= n1+n2;
		resultR= n1-n2;
		resultM= n1*n2;
		resultD= n1/n2;

		// Salida de mensaje
		System.out.println("La Suma  es:" + resultS);
		System.out.println("La Resta es:" + resultR);
		System.out.println("la Multiplicación  es:" + resultM);
		System.out.println("la División  es:" + resultD);
		
	}
}