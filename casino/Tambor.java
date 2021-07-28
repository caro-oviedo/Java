package tragamonedas;

public class Tambor {
	
	private int posicion;
	
	public Tambor() {
		posicion = 1;
	}
	
	public int getPosicion() {
		return posicion;
	}

	public void girar() {
		double aleatorio = Math.random();
		posicion = (int) (aleatorio * 8) + 1;
	}
}
