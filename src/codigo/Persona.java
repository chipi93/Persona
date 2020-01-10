package codigo;
/*La clase debe incluir un método principal (main) que solicite un valor al usuario 
 * y lo introduzca en el atributo nombre, para posteriormente mostrar por pantalla 
 * el nuevo valor del atributo.*/
public class Persona {
	String nombre;
	int edad;
	float altura;
public Persona() {
	
}
public Persona(String nombre,int edad,float altura) {
	this.nombre=nombre;
	this.edad=edad;
	this.altura=altura;
	
}
	String consulta_Nombre() {
		return nombre;

	}

	void cambia_Nombre(String nom) {
		nombre = nom;

	}
}
