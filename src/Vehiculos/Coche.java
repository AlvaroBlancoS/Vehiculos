package Vehiculos;

import java.util.ArrayList;

public class Coche {
	
	private ArrayList<Rueda> ruedas;
	private String marca;
	private String modelo;
	private int anyo;
	private double velocidad;
	private boolean arrancado; //Si true es verdadero o si False es falso en arrancado
	//Estas dos atributos son las clases.
	private Motor motor;
	private TipoCombustible tipoCombustible;
	
	public Coche(
			ArrayList<Rueda> ruedas,
			String marca,
			String modelo,
			int anyo,
			double velocidad,
			boolean arrancado,
			Motor motor,
			TipoCombustible tipoCombustible) {
		
		this.ruedas=ruedas;
		this.marca=marca;
		this.modelo=modelo;
		this.anyo=anyo;
		this.velocidad=velocidad;
		this.arrancado=arrancado;
		this.motor=motor;
		this.tipoCombustible=tipoCombustible;
		
	}
	
	//Constructor sin velocidad y sin arrancado
	public Coche(
			ArrayList<Rueda> ruedas,
			String marca,
			String modelo,
			int anyo,
			Motor motor,
			TipoCombustible tipoCombustible) {
		
		this.ruedas=ruedas;
		this.marca=marca;
		this.modelo=modelo;
		this.anyo=anyo;
		this.velocidad=0;
		this.arrancado=false;
		this.motor=motor;
		this.tipoCombustible=tipoCombustible;
		
	}
	
	//Constructor que no recibe ruedas
	public Coche(
			String marca,
			String modelo,
			int anyo,
			double velocidad,
			boolean arrancado,
			Motor motor,
			TipoCombustible tipoCombustible) {
		
		this.ruedas = new ArrayList<Rueda>();
		this.marca=marca;
		this.modelo=modelo;
		this.anyo=anyo;
		this.velocidad=velocidad;
		this.arrancado=arrancado;
		this.motor=motor;
		this.tipoCombustible=tipoCombustible;
		
	}

}
