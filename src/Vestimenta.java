public class Vestimenta {
    private String cor;
    private String tecido;
    private static int cont;

    public Vestimenta(String cor, String tecido) {
        this.cor = cor;
        this.tecido = tecido;
        cont++;
        //Classe pai que possui os três tipos de vestimenta como dependentes
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTecido() {
        return tecido;
    }

    public void setTecido(String tecido) {
        this.tecido = tecido;
    }

    public static int getCont() {
        return cont;
    }

    public static void resetCont() {
        cont = 0;
    }

    @Override
    public String toString() {
        return "Vestimenta: cor: " + cor + ", tecido: " + tecido;
    }
}
