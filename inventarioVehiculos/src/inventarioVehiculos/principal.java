package inventarioVehiculos;

public class principal {

	public static void main(String[] args) {
	Auto	auto1=new Auto("DAA2323","Fiat","uno","rojo",1994,4);
	moto	moto1=new moto("DAA232","Jumbo","Max","rojo",1994,125);
 Auto auto2=new Auto();
 auto2.setMarca("Ford");
 auto2.setModelo("Ranger");
 auto2.setMatricula("DAA 4943");
 auto2.setColor("Negro");
 System.out.println("Matricula"+auto1.getMatricula());
 System.out.println("Marca"+auto1.getMarca());
 System.out.println("Modelo"+auto1.getModelo());
 System.out.println("Color"+auto1.getColor());
 System.out.println("Matricula "+moto1.getMatricula());
 System.out.println("Marca "+moto1.getMarca());
 System.out.println("Modelo "+moto1.getModelo());
 System.out.println("Color "+moto1.getColor());
	}

}
