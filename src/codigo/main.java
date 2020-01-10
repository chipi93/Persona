package codigo;
import java.util.*;

public class main {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner tec=new Scanner(System.in);
		System.out.println("Introduce el nombre de la Persona");
		Persona p1= new Persona();
		String cad=tec.nextLine();
		p1.cambia_Nombre(cad);
		System.out.println(p1.consulta_Nombre());
		System.out.println("Cambiogit");
		System.out.println("Cambio 2");
		System.out.println("CAmbio3");
	}

}
