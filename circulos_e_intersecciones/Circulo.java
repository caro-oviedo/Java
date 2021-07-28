package circulos;

public class Circulo {
	private Punto punto;
	private double radio;

	public Circulo(Punto punto, double radio) {
		this.punto = punto;
		this.setValorRadio(radio);
	}

	public boolean intersectaCon(Circulo c2) {
		double distancia = this.punto.calcularDistancia(c2.punto);
		double sumaRadios = this.radio + c2.radio;
		return distancia < sumaRadios;
	}
	
	private boolean esRadioCorrecto(double r) {
		return (r > 0 );
	}
	
	private void setValorRadio(double r) {
		if (!esRadioCorrecto(r)) {
			Error radioInvalido = new Error("Ingrese un radio positivo");
			throw radioInvalido;
		}
		this.radio = r;	
	}

}
