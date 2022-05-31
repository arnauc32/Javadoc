package arnau;
/**
 * suma, resta, multiplica o divideix els valors donats
 * @author arnau
 * @version 2.5
 * @since 06/2015
 */
public class Calculadora {
		/**
		 * suma els dos enters que es pasen com a parametres i torna el resultat
		 * @param a enter
		 * @param b enter
		 * @return a + b int
		 */
		public int suma(int a, int b) {
			return a + b;
		}
		/**
		 * resta els dos enters que es pasen com a parametres i torna el resultat
		 * @param a enter
		 * @param b enter
		 * @return a - b int
		 */
		public int resta(int a, int b) {
			return a - b;
		}
		/**
		 * multiplica els dos enters que es pasen com a parametres i torna el resultat
		 * @param a enter
		 * @param b enter
		 * @return a * b int
		 */
		public int multiplica(int a, int b) {
			return a * b;
		}
		/**
		 * divideix els dos enters que es pasen com a parametres i torna el resultat
		 * @param a enter
		 * @param b enter
		 * @throws java.lang.ArithmeticException no es pot dividir entre 0
		 * @return a / b int
		 */
		public int divideix(int a, int b) {
			return a / b;
		}
		
		
}
