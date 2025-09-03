package logica;

public class Persona {
	// Atributos
	private String nombre;
	private String genero;
	private double peso;
	private double altura;
	private int edad;
	
	// Getters y setters de los atributos
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	// Método constructor
	public Persona(String nombre, String genero, double peso, double altura, int edad) {
		this.nombre = nombre;
		this.genero = genero;
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
	}
	
}
