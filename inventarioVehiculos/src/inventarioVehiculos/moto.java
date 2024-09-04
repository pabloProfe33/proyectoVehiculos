package inventarioVehiculos;

public class moto extends Vehiculo {

	

	

	private int cilindrada ;
	
	public moto(String matricula, String marca, String modelo, String color, int anio, int cilindrada) {
		super(matricula, marca, modelo, color, anio);
		this.cilindrada = cilindrada;
	}
	public moto() {
		super();
		// TODO Esbozo de constructor generado automáticamente
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	
}
