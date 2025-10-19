import java.util.Scanner;

public class Ejercicio_SCondicional{
	public static void main(String args[]){

		Scanner sc= new Scanner(System.in);

		//Variables

		double  nota1=0, nota2=0, nota3=0, prom=0;
		String nombres=" ", fNacimiento=" ", cid=" ";

		//Solicitud de Usuario
		
		System.out.println();
		System.out.println("---------------Ingrese los Datos del Estudiante----------------\n");
		System.out.println("Nombres:");
		nombres=sc.nextLine();
		System.out.println("Fecha de Nacimiento:");
		fNacimiento=sc.nextLine();
		System.out.println("Número de Indentificación:");
		cid=sc.nextLine();
		System.out.println();

		//Ingreso de Calificaciones

		System.out.println("---------------Ingreso de Calificaciones----------------------\n");
		System.out.println("Ingrese la primera nota:");
		nota1=sc.nextDouble();

		//Validacio 0-10

		if(nota1>0){
			if(nota1<=10){
				
				System.out.println("Ingrese la segunda nota:");
				nota2=sc.nextDouble();
				
				if(nota2>=0){
					if(nota2<=10){

						System.out.println("Ingrese la Segunda nota:");
						nota3=sc.nextDouble();
						
						if(nota3>0){
							if(nota3<=10){
								
								prom=(nota1+nota2+nota3)/3;
								
								if(prom>0){
									if(prom<=4.99){
										System.out.println("Pierde el Año");
										System.out.println(nombres+" tiene el promedio de: "+prom);
										
									}else{
										if(prom<=7){
											System.out.println("Esta en Suspenso");
											System.out.println(nombres+" tiene el promedio de: "+prom);	
										}else{
											if(prom<=9){
												System.out.println("Sobresaliente");
												System.out.println(nombres+" tiene el promedio de: "+prom);
											}else{

												if(prom<=10){
													System.out.println("Exonerado");
													System.out.println(nombres+" tiene el promedio de: "+prom);
												}else{
													
												}	System.out.println("Error");
											}
										}
									
									}
										
								}else{
									System.out.println("Error");	
								}
								
							}else{
								System.out.println("Nota no valida");
							}
						}else{
							System.out.println("Nota no valida");
						}
						
					}else{
						System.out.println("Nota no valida");
					}
				}else{
					System.out.println("Nota no valida");
				}
				

			}else{
				System.out.println("Nota no valida");	
			}
		}else{
			System.out.println("Nota no valida");
		}
	}
}