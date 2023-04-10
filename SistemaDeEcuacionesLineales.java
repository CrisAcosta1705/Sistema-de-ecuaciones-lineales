package SistemaDeEcuacionesLineales;
import java.util.Scanner;
public class SistemaDeEcuacionesLineales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner(System.in);
		
		double a; // Reemplazar con el valor de a
		double b; // Reemplazar con el valor de b
		double c; // Reemplazar con el valor de c
		double d; // Reemplazar con el valor de d
		double e; // Reemplazar con el valor de e
		double f; // Reemplazar con el valor de f
		
		System.out.println("Ingrese el valor A");
		a = tc.nextInt();
		
		System.out.println("Ingrese el valor B");
		b = tc.nextInt();
		
		System.out.println("Ingrese el valor C");
		c = tc.nextInt();
		
		System.out.println("Ingrese el valor D");
		d = tc.nextInt();
		
		System.out.println("Ingrese el valor E");
		e = tc.nextInt();
		
		System.out.println("Ingrese el valor F");
		f = tc.nextInt();

		double D = a*e - b*d;
		double Dx = c*e - b*f;
		double Dy = a*f - c*d;

		double x = Dx/D;
		double y = Dy/D;

		System.out.println("La solución del sistema de ecuaciones es:");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

}
