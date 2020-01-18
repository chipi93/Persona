package codigo;
/*La clase debe incluir un método principal (main) que solicite un valor al usuario 
 * y lo introduzca en el atributo nombre, para posteriormente mostrar por pantalla 
 * el nuevo valor del atributo.*/
public class Persona {
	private String nombre;
	private int edad;
	private char sexo;
	private String DNI;
	private float altura,peso;
public Persona() {

}

public Persona(String nombre,int edad,String DNI,char sexo) {
	this.nombre=nombre;
	this.edad=edad;
	this.DNI=DNI;
	this.sexo=sexo;
}
public Persona(String nombre,int edad,String DNI,char sexo,float altura,float peso) {
	this.nombre=nombre;
	this.edad=edad;
	this.DNI=DNI;
	this.sexo=sexo;
	this.altura=altura;
	this.peso=peso;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public char getSexo() {
	return sexo;
}
public void setSexo(char sexo) {
	this.sexo = sexo;
}
public String getDNI() {
	return DNI;
}
public void setDNI(String dNI) {
	DNI = dNI;
}
public float getAltura() {
	return altura;
}
public void setAltura(float altura) {
	this.altura = altura;
}
public float getPeso() {
	return peso;
}
public void setPeso(float peso) {
	this.peso = peso;
}
public float masa_Corporal() {
	float masa_Corporal=peso/(altura*altura);
	return masa_Corporal;
}
public String valoracion(double masa) {
	String valoracion="";
	float IMC=masa_Corporal();
	if(IMC<20) {
		valoracion="Peso por debajo de lo normal";
	}else if(IMC>=25){
		valoracion="Peso por encima de lo normal";
	}else {
		valoracion="Peso considerado normal";
	}
	return valoracion;
}

public boolean mayorEdad() {
	return edad>=18?true:false;
	
}
public void comprobarSexo(char sexo) {
	if(sexo=='H'| sexo=='M') {
		this.sexo=sexo;
	}else {
		this.sexo='H';
	}
}

public String toString() {
	return "Nombre: "+nombre+"\n"+
			"Edad: "+edad+"\n"+
			"DNI :"+DNI+"\n"+
			"Sexo: "+sexo+"\n"+
			"IMC: "+ masa_Corporal()+"\n"+
			"Valoración: "+valoracion(masa_Corporal())+"\n";
}

}

