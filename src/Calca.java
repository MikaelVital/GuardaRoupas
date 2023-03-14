public class Calca extends Vestimenta {
    private int numero;

    public Calca(String cor, String tecido, int numero) {
    	//Herda os atributos e métodos da classe Vestimenta
        super(cor, tecido);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Calça: cor:" + getCor() + ", tecido:" + getTecido() + ", número:" + numero;
    }
}
