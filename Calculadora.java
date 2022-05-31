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
		
		public int oper1(int a, int b) {
			int t = 1;
			for (int i = 0; i < b; i++) {
				t = t * a;
			}
			return t;
		}
		
		public boolean oper2(int a) {
			boolean r;
			if (a % 2 == 0) {
				r = true;
			}else {
				r = false;
			}
			return r;
			
		}
		
		public String oper3(int a) {
			String r = "";
			int v = a;
			int v1;
			while (v > 0) {
				v1 = v % 2;
				r = v1 + r;
				v = v / 2;
			}
			return r;
		}
		
		
}
