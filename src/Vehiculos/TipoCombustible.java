package Vehiculos;

public class TipoCombustible {
	
	private boolean gasolina;
	private boolean gasoleo;
	private boolean electricidad;
	private boolean gas;
	
	
	public TipoCombustible(boolean gasolina, boolean gasoleo, boolean electricidad, boolean gas) {
		this.gasolina = gasolina;
		this.gasoleo = gasoleo;
		this.electricidad = electricidad;
		this.gas = gas;
	}
	
	
	public boolean esGasolina() {
		return gasolina;
	}
	//modificadores por setters
	public void modificarGasolina(boolean gasolina) {
		this.gasolina = gasolina;
	}
	
	public boolean esGasoleo() {
		return gasoleo;
	}
	public void modificarGasoleo(boolean gasoleo) {
		this.gasoleo = gasoleo;
	}
	public boolean esElectricidad() {
		return electricidad;
	}
	public void modificarElectricidad(boolean electricidad) {
		this.electricidad = electricidad;
	}
	public boolean esGas() {
		return gas;
	}
	public void modificarGas(boolean gas) {
		this.gas = gas;
	}
	
	public boolean esHibrido() {
		int cantidadCombustibles=0;
		
		if (this.electricidad== true) {
			cantidadCombustibles=cantidadCombustibles+1;
		}if (this.gas) {
			cantidadCombustibles=cantidadCombustibles+1;
		}if (this.gasoleo) {
			cantidadCombustibles=cantidadCombustibles+1;
		}if (this.gasolina) {
			cantidadCombustibles=cantidadCombustibles+1;
		}
		
		if (cantidadCombustibles>1) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean esAlgoConElectricidad() {
		int cantidadCombustibles=0;
		
		if (this.electricidad== true) {
			if (this.gas) {
				cantidadCombustibles=cantidadCombustibles+1;
			}
			if (this.gasoleo) {
				cantidadCombustibles=cantidadCombustibles+1;
			}
			if (this.gasolina) {
				cantidadCombustibles=cantidadCombustibles+1;
			}
			
			if (cantidadCombustibles>0) {
				return true;
			} else {
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	
}
