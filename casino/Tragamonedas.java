package tragamonedas;

public class Tragamonedas {
	 
	private Tambor tambor1;
	private Tambor tambor2;
	private Tambor tambor3;
	
	public Tragamonedas() {
		 tambor1 = new Tambor();
		 tambor2 = new Tambor();
		 tambor3 = new Tambor();
	}
	
	public void activar() {
		tambor1.girar();
		tambor2.girar();
		tambor3.girar();
		
	}
	
	public boolean entregaPremio() {
		 return (tambor1.getPosicion() == tambor2.getPosicion() && tambor2.getPosicion() == tambor3.getPosicion());
				
	}
	
	public String toString() {
		return 	"[ " + tambor1.getPosicion() + " ]" + 
				"[ " + tambor2.getPosicion() + " ]" +
				"[ " + tambor3.getPosicion() + " ]";
	}
	

	
	public int simularHastaQueSalgaPremio() {
		int cantidadDeIntentos = 0;
		this.activar();
		
		while (!this.entregaPremio()) {
			cantidadDeIntentos++;
			this.activar();
		}
		System.out.println(this);
		return cantidadDeIntentos;
	}
	
	public int cuantosPremiosEntregaEnNgiros(int n) {
		int cantidadDeAciertos = 0;
		for (int i = 1; i <= n; i++) {
			this.activar();
			if (this.entregaPremio()) {
				System.out.println(this);
				cantidadDeAciertos++;
			};
		}
		return cantidadDeAciertos;
	}

	
}
