import java.util.Scanner;

public class GuardaRoupa {

		
		//Vetores
		private int numVestidos;
		private int numCalcas;
		private int numCamisas;
		
		private Calca[] nCalcas;
		private Camisa [] nCam;
		private Vestido [] nVest;
		
		public GuardaRoupa(int numVestidos, int numCalcas, int numCamisas) {
			this.nVest = new Vestido [numVestidos];
			this.nCam = new Camisa [numCamisas];
			this.nCalcas = new Calca [numCalcas];
		}

		int cont=0;
		public void guardar(Vestido vestido){
			
			this.nVest[cont] = vestido;
			cont += 1;
			}
	
		public void guardar(Calca calca){	
		
			this.nCalcas[cont]= calca;
			cont += 1;
		}
		
		public void guardar(Camisa camisa){
		
			this.nCam[cont] = camisa;
			cont += 1;
		}
		
		public void listar(){
			//Percorrer todos com for
			for (int i = 0; i < this.nVest.length; i++) {
				if (this.nVest[i] != null) {
			
					System.out.println("\nVestido: \n" + this.nVest[i]);
				}
			}
			
			for (int i = 0; i < this.nCam.length; i++) {
				if (this.nCam[i] != null) {
					System.out.println("\nCamisa: \n" + this.nCam[i]);
				}
			}
			
			for (int i = 0; i < this.nCalcas.length; i++) {
				System.out.println("\nCalças: \n" + this.nCalcas[i]);
				if (this.nCalcas[i] != null) {
					//System.out.println("\nCalças: \n" + this.nCalcas[i]);
				}
			}
		}
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("\nBem-vindo!\n");
				System.out.println("Digite a quantidade de vestidos: ");
				int cVestido = sc.nextInt();
				System.out.println("Digite a quantidade de camisas: ");
				int cCamisa = sc.nextInt();
				System.out.println("Digite a quantidade de calças: ");
				int cCauca = sc.nextInt();	
				
				GuardaRoupa gr = new GuardaRoupa(cVestido, cCauca, cCamisa);
				
				int op = 0;
				do {
					
						// menu de interação que invoca os métodos.
						System.out.println("O que você deseja?\n");
						System.out.println(" 1- Guardar Vestido\n 2- Guardar Calça\n 3- Guardar Camisa \n 4- Listar roupas\n 5- Sair\n");
						System.out.println("");
						System.out.print("Digite uma opção: ");
						op = sc.nextInt();
						switch (op) {
						
						case 1:
							System.out.println("Insira cor!");
							String corV = sc.next();
					
							System.out.println("Insira tipo de tecido!");
							String tecidoV = sc.nextLine();
							System.out.println("O vestido é longo?(S/N)");
							boolean longo = sc.nextLine() != null;
							Vestido v = new Vestido(corV, tecidoV, longo);
							gr.guardar(v);
							
							break;
						
						case 2:
							System.out.println("Insira cor");
							String corCalca = sc.nextLine();
							sc.next();
							System.out.println("Insira tipo de tecido!");
							String tecidoCalca = sc.nextLine();
							sc.next();
							System.out.println("Insira o número!");
							int numeroCalca = sc.nextInt();

							Calca c2 = new Calca(corCalca, tecidoCalca,numeroCalca);
							gr.guardar(c2);
							break;
	
						case 3:
							System.out.println("Insira cor");
							String corCamisa = sc.nextLine();
							System.out.println("Insira tecido de tecido!");
							String tecidoCamisa = sc.nextLine();
							System.out.println("insira o tipo da Camisa");
							String tipoCamisa = sc.nextLine();
							System.out.println("Insira o número!");
							int numeroCamisa = sc.nextInt();
							Camisa c1 = new Camisa(corCamisa, tecidoCamisa,tipoCamisa, numeroCamisa);
							
							gr.guardar(c1);
							
							break;
						case 4:
							gr.listar();
							break;
						case 5:
							
							break;
						case 6:
							System.out.println("Obrigado por utilizar nosso serviço!\n");
							System.out.println("Desenvolvido por \n");
							System.out.println("André Cardoso Bueno\n");
							System.out.println("Danillo Marcos Alves\n");
							System.out.println("Tarcísio Leite Teissiere");
							break;
						default:
							System.out.println("Comando não definido no menu! Por favor, confira novamente...\n");
							break;
						}

				} while (op != 6);
				sc.close();
	}
}