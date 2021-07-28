package tragamonedas;

public class Casino {
	
	private static final int PREMIO = 50;
	
	private Tragamonedas[] tragamonedas;
	
	public Casino (int cantidadDeTragamonedas) {
		tragamonedas =  new Tragamonedas[cantidadDeTragamonedas];
		
		for (int i=0; i< cantidadDeTragamonedas; i++)
			tragamonedas[i] = new Tragamonedas();
	}
	
	public void simularHastaQueSalgaPremioEnTodos() {
		for(Tragamonedas cT: tragamonedas) {
			int cantidadDeJugadas = cT.simularHastaQueSalgaPremio();
			System.out.println("El jugador recibe " + PREMIO + " Monedas");
			System.out.println("Jugo " + cantidadDeJugadas + " Monedas");
			System.out.println();
		}
	}
	
	public void cuantosPremiosEntregaEnNgirosEnTodos(int n) {
		for (Tragamonedas cT: tragamonedas) {
			int cantidadDePremios = cT.cuantosPremiosEntregaEnNgiros(n);
			System.out.println("El jugador obtiene: " + cantidadDePremios + " premio y recibe " + cantidadDePremios * PREMIO + " Monedas"); 
			System.out.println("Jugo " + n + " Monedas");
			System.out.println();
		}
	}
	
	public static void  main(String[] args) {
		Casino royal = new Casino(5);
		royal.cuantosPremiosEntregaEnNgirosEnTodos(50);
		
		System.out.println("----------------------------------------");
		royal.simularHastaQueSalgaPremioEnTodos();
	}
	

}
