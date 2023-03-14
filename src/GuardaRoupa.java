import java.util.Scanner;

public class GuardaRoupa {
	//Espaço dos vetores para guardar os tipos de vestimentas
    private Calca[] calcas;
    private Camisa[] camisas;
    private Vestido[] vestidos;
    
    //Quantidade das vestimentas presentes
    private int numCalcas;
    private int numCamisas;
    private int numVestidos;

    public GuardaRoupa(int maxCalcas, int maxCamisas, int maxVestidos) {
    	//Definir quantos tipos de vestimenta cabem no guarda roupa e valores iniciais dos tipos das vestimentas
        calcas = new Calca[maxCalcas];
        camisas = new Camisa[maxCamisas];
        vestidos = new Vestido[maxVestidos];
        numCalcas = 0;
        numCamisas = 0;
        numVestidos = 0;
    }
    
    //Adicionam uma vestimenta no vetor, com parâmetros de um objeto do tipo daquela vestimenta

    public void guardarCalca(String cor, String tecido, int numero) {
        calcas[numCalcas++] = new Calca(cor, tecido, numero);
    }

    public void guardarCamisa(String cor, String tecido, String tipo, int numeroManga) {
        camisas[numCamisas++] = new Camisa(cor, tecido, tipo, numeroManga);
    }

    public void guardarVestido(String cor, String tecido, boolean longo) {
        vestidos[numVestidos++] = new Vestido(cor, tecido, longo);
    }

    //Mostram as vestimentas armazenadas no vetor
    public void listarCalcas() {
        System.out.println("Calças:");
        //Um loop "for" para iterar através do vetor que tem todas as calças dentro do guarda roupas
        for (int i = 0; i < numCalcas; i++) {
        	//O objeto da calça é mostrado conforme a posição do incrementador da lista calças
            System.out.println("Cor: " + calcas[i].getCor() + ", Tecido: " + calcas[i].getTecido() + ", Tamanho: " + calcas[i].getNumero());
        }
    }

    public void listarCamisas() {
        System.out.println("Camisas:");
        for (int i = 0; i < numCamisas; i++) {
            System.out.println("Cor: " + camisas[i].getCor() + ", Tecido: " + camisas[i].getTecido() + ", Tipo: " + camisas[i].getTipo());
        }
    }

    public void listarVestidos() {
        System.out.println("Vestidos:");
        for (int i = 0; i < numVestidos; i++) {
            System.out.println("Cor: " + vestidos[i].getCor() + ", Tecido: " + vestidos[i].getTecido() + ", Longo: " + vestidos[i].isLongo());
        }
    }

    public int contarVestimentas() {
    	//Retorna o número total das vestimentas do guarda roupa
        int total = numCalcas + numCamisas + numVestidos;
        System.out.println("Total de vestimentas: " + total);
        return total;
    }
    
    public static void main(String[] args) {
    	//Limite máximo para cada tipo de roupa
        GuardaRoupa guardaRoupa = new GuardaRoupa(10, 10, 10);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Adicionar calça");
            System.out.println("2. Adicionar camisa");
            System.out.println("3. Adicionar vestido");
            System.out.println("4. Listar calças");
            System.out.println("5. Listar camisas");
            System.out.println("6. Listar vestidos");
            System.out.println("7. Contar vestimentas");
            System.out.println("8. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a cor da calça:");
                    String corCalca = scanner.next();

                    System.out.println("Digite o tecido da calça:");
                    String tecidoCalca = scanner.next();

                    System.out.println("Digite o número da calça:");
                    int numeroCalca = scanner.nextInt();

                    guardaRoupa.guardarCalca(corCalca, tecidoCalca, numeroCalca);
                    System.out.println("Você adicionou uma calça");
                    break;

                case 2:
                    System.out.println("Digite a cor da camisa:");
                    String corCamisa = scanner.next();

                    System.out.println("Digite o tecido da camisa:");
                    String tecidoCamisa = scanner.next();

                    System.out.println("Digite o tipo da camisa:");
                    String tipoCamisa = scanner.next();

                    System.out.println("Digite o número da camisa:");
                    int numero = scanner.nextInt();

                    guardaRoupa.guardarCamisa(corCamisa, tecidoCamisa, tipoCamisa, numero);
                    System.out.println("Você adicionou uma camisa");
                    break;

                case 3:
                    System.out.println("Digite a cor do vestido:");
                    String corVestido = scanner.next();

                    System.out.println("Digite o tecido do vestido:");
                    String tecidoVestido = scanner.next();

                    System.out.println("O vestido é longo? (Digite: true ou false)");
                    boolean longo = scanner.nextBoolean();

                    guardaRoupa.guardarVestido(corVestido, tecidoVestido, longo);
                    System.out.println("Você adicionou um vestido");
                    break;

                case 4:
                    System.out.println("As calças dentro do guarda roupa são:");
                    guardaRoupa.listarCalcas();
                    break;

                case 5:
                    System.out.println("As camisas dentro do guarda roupa são:");
                    guardaRoupa.listarCamisas();
                    break;

                case 6:
                    System.out.println("Os vestidos dentro do guarda roupa são:");
                    guardaRoupa.listarVestidos();
                    break;

                case 7:
                    int total = guardaRoupa.contarVestimentas();
                    System.out.println("Total de vestimentas no guarda roupa: " + total);
                    break;

                case 8:
                    System.out.println("Foi desenvolvido por: Mikael Vital e Victoria Ribeiro");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Escolha uma opção que exista");
                    break;
            }
        }
    }
}
