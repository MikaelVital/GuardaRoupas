public class Calca extends Vestimenta{

	private int numero;
		
		public Calca(String cor, String tecido, int numero){
			super(cor, tecido);
			this.numero = numero;
		}

		public String toString(){
			return "A numeração dessa calça é: " + this.numero;
		}

}