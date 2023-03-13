public class Vestido extends Vestimenta {

	private boolean longo;

		public Vestido(String cor, String tecido, boolean longo){
			super(cor, tecido);
			this.longo = longo;
		}

		public String toString(String cor){
			if (this.longo == true){
				return "O vestido � longo.";
			} else {
				return "O vestido � longo e da cor: " + cor;
			}
		}
}