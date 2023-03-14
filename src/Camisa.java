public class Camisa extends Vestimenta {
    private String tipo;
    private int numero;

    public Camisa(String cor, String tecido, String tipo, int numero) {
    	//Herda os atributos e métodos da classe Vestimenta
        super(cor, tecido);
        this.tipo = tipo;
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Camisa: cor:" + getCor() + ", tecido:" + getTecido() + ", tipo:" + tipo + ", número:" + numero;
    }
}
