package one.digitalinnovation.gof.facade.treino.treino2;

public class Compra {
	
	private Compra() {
		
	}
	
	private static Compra instancia = new Compra();
	
	public static Compra getInstancia() {
		return instancia;
	}

	public String calcularTotal(double total) {
		return "Total: %.2f" + total ;
	}
	
	public void finalizarCompra() {
		System.out.println("Compras pagas!");
	}
}
