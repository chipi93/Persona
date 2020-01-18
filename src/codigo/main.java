package codigo;
import java.util.*;

public class main {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		int edad;
		String nombre,DNI;
		float peso,altura;
		char sexo;
		Scanner tec=new Scanner(System.in);
		System.out.print("Introduce el nombre de la Persona");
		nombre=tec.next();
		System.out.print("\nIntroduce la edad");
		edad=tec.nextInt();
		System.out.print("\nIntroduce el DNI");
		DNI=tec.next();
		System.out.print("\nIntroduce el sexo(H=Hombre / M=Mujer): ");
		sexo=tec.next().charAt(0);
		System.out.print("\nIntroduce la altura en metros: ");
		altura=tec.nextFloat();
		System.out.print("\nIntroduce el peso en kilogramos: ");
		peso=tec.nextFloat();
		
		Persona p1= new Persona(nombre,edad,DNI,sexo,altura,peso);
		Persona p2=new Persona(nombre,edad,DNI,sexo);
		Persona p3=new Persona();
		p3.setNombre(nombre);
		p3.setEdad(edad);
		p3.setDNI(DNI);
		p3.setSexo(sexo);
		p3.setAltura(altura);
		p3.setPeso(peso);
		
		esMayorEdad(p1);
		esMayorEdad(p2);
		esMayorEdad(p3);
		System.out.println("Persona 1: \n"+p1.toString());
		System.out.println("Persona 2: \n"+p2.toString());
		System.out.println("Persona 3: \n"+p3.toString());
		tec.close();

	}
	private static void esMayorEdad(Persona p1) {
	if(p1.mayorEdad()==true) {
		System.out.println("Es mayor");
	}else {
		System.out.println("Es menor");
	}
	}
}
