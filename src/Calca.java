public class Calca extends Vestimenta {
    private int numero;

    public Calca(String cor, String tecido, int numero) {
    	//Herda os atributos e m�todos da classe Vestimenta
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
        return "Cal�a: cor:" + getCor() + ", tecido:" + getTecido() + ", n�mero:" + numero;
    }
}
