package circulos;

public class Punto {
	private double x;
	private double y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double calcularDistancia(Punto punto) {
		double cateto1 = x - punto.x;
		double cateto2 = y - punto.y;
		return Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
	}

}
