public class Persona {
	private string nombre;
	private int edad;
	private bool esMayorEdad;
	
	public Persona() {
		
	}
	
	public void establecerNombre(string Nombre) {
		this.nombre = Nombre;
	}
	
	public string obtenerNombre() {
		return this.nombre;
	}
	
	public void definirEdad(int Edad) {
		this.edad = Edad;
	} 
	
	public void definirEdad(bool mayorEdad) {
		this.esMayorEdad = mayorEdad;
	}
	
	public int obtenerEdad() {
		return this.edad;
	}
}

public class Alumno extends Persona {				
	private bool inscrito;
	
	public Alumno() {
		
	}
	
	public void Incribir(bool inscripcion) {
		this.inscrito = inscripcion;
	}
	
	public bool EstaInscrito() {
		return this.inscrito;
	}
}

public class Profesor extends Persona {
	private string asignatura;
	
	public Profesor() {
		
	}
	
	public void AsignarMateria(string materia) {
		this.asignatura = materia;
	}
	
	public string ObtenerMateria() {
		return this.asignatura;
	}
}

public class Principal {
	Alumno claseAlumno;
	Profesor claseProfesor;
	
	public Principal() {
		this.claseAlumno = new Alumno();
		this.claseProfesor = new Profesor();
		
		this.claseAlumno.establecerNombre("Cesar");
		this.claseAlumno.definirEdad(15);
		this.claseAlumno.definirEdad(false);
		this.claseAlumno.EstaInscrito(true);
		
		this.claseProfesor.establecerNombre("Gustavo");
		this.claseProfesor.definirEdad(31);
		this.claseProfesor.definirEdad(true);
		this.claseProfesor.AsignarMateria("Informatica");
	}
}

