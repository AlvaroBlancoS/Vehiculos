package Vehiculos;

public class Rueda {

	private String marca;
	private double altura;
	private double precio;

	public Rueda(String marca, double altura, double precio) {

		this.marca = marca;
		this.altura = altura;
		this.precio = precio;

	}

	public Rueda(double altura, double precio) {
		this.marca = "Sin marca";
		this.altura = altura;
		this.precio = precio;
	}

	public Rueda(String marca, double precio) {
		this.marca=marca;
		this.altura= 0.40 ;
		this.precio=precio;
		
	}
	
	//Accesores
	public String ObtenerMarca() {
		return this.marca;
	}
	
	public double ObtenerAltura() {
		return this.altura;
	}
	
	public double ObtenerPrecio() {
		return this.precio;
	}
	
	//Modificadores
	public void ModificarMarca(String marca) {
		this.marca=marca;
	}
	
	public void ModificarAltura(double altura) {
		this.altura=altura;
	}
	
	public void ModificarPrecio(double precio) {
		this.precio=precio;
	}

}
