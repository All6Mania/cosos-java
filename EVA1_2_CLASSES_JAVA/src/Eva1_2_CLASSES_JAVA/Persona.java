package Eva1_2_CLASSES_JAVA;

public class Persona {
	// Datos --> Atributos de la clase
	private String nombre;
	private String apellidos;
	private int edad;
	private char genero;
	//Métodos --> Comportamiento de la clase
	//Leer y escribir los atributos de la clase
	//Leer --> get
	//Escribir --> set
	//Modificador de acceso valor de retorno nombre del metodo(argumentos)(
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String N) {
		nombre = N;
			}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String A){
		apellidos = A;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int E){
		edad = E;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char G){
		genero = G;
	}
	
	public void ImprimirDatos() {
	System.out.println("Nombre: " + nombre + " " + apellidos);
	System.out.println("Edad: " + edad);
	if (genero == 'H') {
		System.out.println("Homrbe");
	}else if (genero == 'M') {
		System.out.println("Mujer");
	}else{
		System.out.println("Genero no registrado");
	}
	
	}

}