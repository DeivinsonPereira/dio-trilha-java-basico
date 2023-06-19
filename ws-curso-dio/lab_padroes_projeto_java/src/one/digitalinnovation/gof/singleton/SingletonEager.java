package one.digitalinnovation.gof.singleton;

/*
 * Singleton "apressado".
 * 
 * @Autor deivinson pereira
 */
public class SingletonEager {

		private static SingletonEager instancia = new SingletonEager();

		private SingletonEager() {
			super();
		}

		public static SingletonEager getInstancia() {
			return instancia;
		}

}
