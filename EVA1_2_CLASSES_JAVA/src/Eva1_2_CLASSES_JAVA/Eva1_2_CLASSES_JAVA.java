package Eva1_2_CLASSES_JAVA;

public class Eva1_2_CLASSES_JAVA {

	public Eva1_2_CLASSES_JAVA() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Crear un Objeto
		Instanciacion
		Instanciar --> Dar memoria Ram
		Nombre de la clase identificador = new constructor de la clase
	*/
		Persona perso1 = new Persona ();//Persona () es el constructor
	/*	perso1.nombre = "Elian";
		perso1.apellidos = "Vargas";
		System.out.println(perso1.nombre + " " + perso1.apellidos);*/
		perso1.setNombre("Elian");
	//	System.out.println(perso1.getNombre());
		
		perso1.setApellidos("Vargas");
	//	System.out.println(perso1.getApellidos());

		perso1.setEdad(18);
	//	System.out.println(perso1.getEdad());

		perso1.setGenero('H');
	//	System.out.println(perso1.getGenero());
		
		perso1.ImprimirDatos();
		
		Persona perso2 = new Persona ();
		perso2.setNombre("Rebeca");
		
		perso2.setApellidos("Soto");
		
		perso2.setEdad(18);
		
		perso2.setGenero('M');
		
		perso2.ImprimirDatos();
	}

}
