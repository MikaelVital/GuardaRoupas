public class Camisa extends Vestimenta {
	
	private String tipo;
	private int numero;
	
		public Camisa(String cor, String tecido, String tipo, int numero){
			super(cor, tecido);
			this.tipo = tipo;
			this.numero = numero;
		}

		public String toString(){
			return "A camisa pe de: " + this.tipo + " e seu tamanho é: " + this.numero;
		}

}