package inventarioVehiculos;

public class Auto extends Vehiculo
{




private int cantidadPuertas;

public Auto(String matricula, String marca, String modelo, String color, int anio, int cantidadPuertas) {
	super(matricula, marca, modelo, color, anio);
	this.cantidadPuertas = cantidadPuertas;
}
public Auto() {
	super();
	// TODO Esbozo de constructor generado automáticamente
}
public int getCantidadPuertas() {
	return cantidadPuertas;
}
public void setCantidadPuertas(int cantidadPuertas) {
	this.cantidadPuertas = cantidadPuertas;
}

}
