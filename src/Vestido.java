public class Vestido extends Vestimenta {
    private boolean longo;

    public Vestido(String cor, String tecido, boolean longo) {
    	//Herda os atributos e métodos da classe Vestimenta
        super(cor, tecido);
        this.longo = longo;
    }

    public boolean isLongo() {
        return longo;
    }

    public void setLongo(boolean longo) {
        this.longo = longo;
    }

    @Override
    public String toString() {
        return "Vestido: cor:" + getCor() + ", tecido:" + getTecido() + ", longo:" + longo;
    }
}
