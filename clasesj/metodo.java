package clasesj;

import java.util.Scanner;

public class metodo {
	Scanner lector=new Scanner(System.in);
	//atributos
	int n1;
	int n2;
	int suma;
	int resta;
	int multiplicasion;
	int division;
	
	//metodos
	
	//leer los numeros
	public void leerNumeros() {
		System.out.println("digita un numero para relaizar distintas operaciones. ");
		n1=lector.nextInt();
		System.out.println("digita un nuemro mas");
		n2=lector.nextInt();
		
	}//fin de leer los numeros
	
	//primer metodo
	 public void dividir() {
		 System.out.println("el numero se esta dividiendo...");
		 division=n1/n2;
	 }
	 
	 //segundo medoto ->>>
	 public void multiplicar() {
		 System.out.println("multiplicando...");
		 multiplicasion=n1*n2;
	 }
	 
	 //tercer metodo ->>>
	 public void restar() {
		 System.out.println("restando...");
		 resta=n1-n2;
	 }
	 
	//cuarto metodo ->>>
	 public void sumar() {
		 System.out.println("sumando...");
		 suma=n1+n2;
	 }
	 
	 //quinto metodo ->>>
	 public void mostrarR() {
		 System.out.println("la suma de los numeros es: "+ suma);
		System.out.println("la resta de los numeros es: "+ resta);
		System.out.println("la multiplicasion de los numeros es: "+ multiplicasion );
		System.out.println("la division de los numeros es:" + division);
	}
	

}
