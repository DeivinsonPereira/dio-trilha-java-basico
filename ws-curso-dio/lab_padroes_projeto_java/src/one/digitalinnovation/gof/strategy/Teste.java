package one.digitalinnovation.gof.strategy;

public class Teste {

	public static void main(String[] args) {
		
		//Strategy
		
		Robo robo = new Robo();

		robo.setComportamento(new ComportamentoNormal());
		robo.mover();
		
		
		robo.setComportamento(new ComportamentoDefensivo());
		robo.mover();
		
		robo.setComportamento(new ComportamentoAgressivo());
		robo.mover();
		
		System.out.println();
		System.out.println();
		
		//ou pode-se fazer dessa outra forma
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo2 = new Robo();
		
		robo2.setComportamento(normal);
		robo2.mover();
		
		robo2.setComportamento(defensivo);
		robo2.mover();
		
		robo2.setComportamento(agressivo);
		robo2.mover();
	}
	
	
}
