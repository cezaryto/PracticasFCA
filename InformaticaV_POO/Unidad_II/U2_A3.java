public class Persona {
	private String nombre;
	private Int edad;
	private Bool esMayorEdad;
	
	public Persona() {
		
	}
	
	public void establecerNombre(string Nombre) {
		this.nombre = Nombre;
	}
	
	public String obtenerNombre() {
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
	private Bool inscrito;
	
	public Alumno() {
		
	}
	
	public void Incribir(bool inscripcion) {
		this.inscrito = inscripcion;
	}
	
	public Bool EstaInscrito() {
		return this.inscrito;
	}
}

public class Profesor extends Persona {
	private String asignatura;
	
	public Profesor() {
		
	}
	
	public void AsignarMateria(string materia) {
		this.asignatura = materia;
	}
	
	public String ObtenerMateria() {
		return this.asignatura;
	}
}

public class public static void main(String[] args) {
    Alumno claseAlumno;
    Profesor claseProfesor;
    
    this.claseAlumno = new Alumno();
    this.claseProfesor = new Profesor();
    
    this.claseAlumno.establecerNombre("Cesar");
    this.claseAlumno.definirEdad(15);
    this.claseAlumno.definirEdad(false);
    this.claseAlumno.Inscribir(true);
    
    this.claseProfesor.establecerNombre("Gustavo");
    this.claseProfesor.definirEdad(31);
    this.claseProfesor.definirEdad(true);
	this.claseProfesor.AsignarMateria("Informatica");
	this.claseProfesor.ObtenerMateria();
}
