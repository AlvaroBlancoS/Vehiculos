package Vehiculos;

public class Motor {
	
	private String marca;
	private double potencia;
	private double precio;
	
	public Motor(String marca, double potencia, double precio) {
		this.marca=marca;
		this.potencia=potencia;
		this.precio=precio;
		
	}
	
	//Métodos de obtener 
	public String ObtenerMarca() {
		return this.marca;
	}
	
	public double ObtenerPotencia() {
		return this.potencia;
	}
	
	public double ObtenerPrecio() {
		return this.precio;
	}
	
	//Métodos de modificadores
	
	public void ModificarMarca(String marca) {
		this.marca=marca;
	}
	
	public void ModificarPotencia(double potencia) {
		this.potencia=potencia;
	}
	
	public void ModificarPrecio(double precio) {
		this.precio=precio;
	}
}
