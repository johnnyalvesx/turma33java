import java.util.Scanner;

public class ecommerce {

	static final int VALORFIXO = 11;
	static String nomeLoja = "NANPPA ";
	static String slogan = "A Loja do dev desesperado!\n";
	static String produto[] = new String[VALORFIXO];
	static String codigo[] = new String[VALORFIXO];
	static int estoque[] = new int[VALORFIXO];
	static double valor[] = new double[VALORFIXO];
	static String tituloMatriz[] = { "COD \t |", "PRODUTO \t\t |", "VALOR \t |", "ESTOQUE", "QUANTIDADE" };

	static int quantidadeCarrinho[] = new int[VALORFIXO];
	static double valorCompra[] = new double[VALORFIXO];
	static double valorTotalDaCompra = 0.00;
	static double precoPagar = 0.00;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("001010001010001010001010000010100001010001010010100010101\n");
		System.out.print("01010001010001010001010        00010100010100101000101010\n");
		System.out.print("*********************** NANPPA *************************\n");
		System.out.print("00101000101000101000101        00001010001010010100010101\n");
		System.out.print("010100010100010100010100000101000010100010100101000101010\n\n");
		System.out.print("---------------A loja do Dev desesperado!----------------\n");
		System.out.print("\nDESEJA FAZER COMPRAS ? (S/N) \n");

		char op = 'n';
		boolean fazerCompra = false;

		op = scan.next().charAt(0);
		if (op == 'n' || op == 'N') {
			fazerCompra = false;
		} else if (op == 's' || op == 'S') {
			fazerCompra = true;
		}
		if (fazerCompra == false) {
			System.out.println("Ok! Espero que nos vejamos em breve! ");
		} else {
			cabecalho();
			mostraProduto();
			selecionaProduto();
			
			while (fazerCompra == true) {
				mostraProdutoAtualizado();
				
				System.out.print("\n\nCONTINUAR COMPRA? [S/N]: ");
				
				op = scan.next().charAt(0);
				if (op == 's' || op == 'S') {

					for (int L = 0; L < 50; L++) {

						System.out.println("\n");
					}
					mostraProdutoAtualizado();
					selecionaProduto();

				} else if (op == 'n' || op == 'N') {

					for (int L = 0; L < 50; L++) {

						System.out.println("\n");
					}
					formaPagamento();
					notaFiscal();
					break;
				}
			}
		}
	}

	public static void cabecalho() {
		String nomeLoja = "NANPPA", slogan = "A Loja do Dev desesperado!\n";

		System.out.print("\n\n");
		System.out.print(nomeLoja);
		System.out.print("\n");
		System.out.print(slogan);
		System.out.print("\n");

	}

	public static void mostraProduto() {
		String tituloMatriz[] = { "COD \t |", "PRODUTO \t\t |", "VALOR \t |", "ESTOQUE" };
		produto[0] = "PRODUTO";
		produto[1] = "LIVRO JAVA I.";
		produto[2] = "LIVRO JAVA II";
		produto[3] = "LIVRO HTML 5 I";
		produto[4] = "LIVRO HTML II";
		produto[5] = "LIVRO PYTHON I";
		produto[6] = "LIVRO PYTHON II";
		produto[7] = "LIVRO EXCEL I";
		produto[8] = "LIVRO CSS 3 I";
		produto[9] = "LIVRO CSS 3 II";
		produto[10] = "LIVRO L�GICA I";

		tituloMatriz[0] = "COD \t |";
		tituloMatriz[1] = "PRODUTO \t\t |";
		tituloMatriz[2] = "VALOR \t |";
		tituloMatriz[3] = "ESTOQUE";

		System.out.print(tituloMatriz[0]);
		System.out.print(tituloMatriz[1]);
		System.out.print(tituloMatriz[2]);
		System.out.print(tituloMatriz[3]);
		System.out.print("\n");

		for (int l = 1; l <= 10; l++) {
			codigo[l] = "G6-" + l;
			valor[l] = 100.00;
			estoque[l] = 10;
			System.out.print(codigo[l] + "\t | ");
			System.out.print(produto[l] + "\t | ");
			System.out.print(valor[l] + "\t | ");
			System.out.print(estoque[l]);
			System.out.print("\n");
		}
	}

	public static void selecionaProduto() {

		Scanner scan = new Scanner(System.in);

		System.out.print("\nDigite o c�digo do produto desejado: G6-");
		int codigoDoProdutoDesejado = scan.nextInt();
		
		
		while(codigoDoProdutoDesejado <0 || codigoDoProdutoDesejado >10) {
			
			System.out.print("\n C�digo Inv�lido!! ");
			System.out.print("\nDigite o c�digo do produto desejado: G6-");
			codigoDoProdutoDesejado = scan.nextInt();
			
		}
		
		System.out.print("Digite a quantidade necess�ria: ");
		int quantidadeDesejada = scan.nextInt();
		
		while(quantidadeDesejada <0 || quantidadeDesejada >10) {
			
			System.out.print("\n Estoque Inv�lido!! ");
			System.out.print("\nDigite a quantidade necess�ria:");
			quantidadeDesejada = scan.nextInt();
			
		}
		
		
		
		for (int L = 0; L < 50; L++) {

			System.out.println("\n");
		}
		for (int i = 0; i < VALORFIXO; i++) {
			if (codigoDoProdutoDesejado == i) {
				estoque[i] = estoque[i] - quantidadeDesejada;
				quantidadeCarrinho[i] = quantidadeDesejada;
				valorCompra[i] = valor[i] * quantidadeDesejada;
				valorTotalDaCompra += valorCompra[i];
			}
		}
	}

	public static void mostraProdutoAtualizado() {
		String tituloMatriz[] = { "COD \t |", "PRODUTO \t\t |", "VALOR \t |", "ESTOQUE" };
		System.out.print(tituloMatriz[0]);
		System.out.print(tituloMatriz[1]);
		System.out.print(tituloMatriz[2]);
		System.out.print(tituloMatriz[3]);
		System.out.print("\n");

		for (int l = 1; l <= 10; l++) {
			codigo[l] = "G6-" + l;
			System.out.print(codigo[l] + "\t | ");
			System.out.print(produto[l] + "\t | ");
			System.out.print(valor[l] + "\t | ");
			System.out.print(estoque[l]);
			System.out.print("\n");
		}
		System.out.print("\n===============================================================================\n");
		System.out.print("CARRINHO DE COMPRAS");
		System.out.print("\n===============================================================================\n");
		carrinho();
	}

	public static void carrinho() {

		// System.out.println("\nCarrinho de Compras: \n");
		cabecalho();
		// System.out.println("\n");
		System.out.print(tituloMatriz[0]);
		System.out.print(tituloMatriz[1]);
		System.out.print(tituloMatriz[2]);
		tituloMatriz[3] = "QTDE";
		System.out.print(tituloMatriz[3]);
		System.out.print("\n");

		for (int l = 1; l < VALORFIXO; l++) {
			if (estoque[l] != 10) {
				System.out.print(codigo[l] + "\t | ");
				System.out.print(produto[l] + "\t | ");
				System.out.print(valorCompra[l] + "\t | ");
				System.out.print(quantidadeCarrinho[l]);
				System.out.print("\n");
			}
		}
	}

	public static void formaPagamento() {
		Scanner scan = new Scanner(System.in);
		int quantidadeProduto = 0;
		double desconto = 0.00;

		System.out.print("\n===============================================================================\n");
		System.out.print("FORMAS DE PAGAMENTO");
		System.out.print("\n===============================================================================\n");
		System.out.print(
				"\n1 - A VISTA COM 10% DESCONTO\n2 - NO CART�O COM ACRESCIMO DE 10%\n3 - EM DUAS VEZES COM 15% TOTAL DE ACRESCIMENTO");
		System.out.println("\n\nEscolha sua forma de pagamento:");
		int formaDePagamento = scan.nextInt();
		for (int L = 0; L < 50; L++) {

			System.out.println("\n");
		}

		if (formaDePagamento == 1) {
			desconto = (valorTotalDaCompra * 10) / 100;
			precoPagar = (valorTotalDaCompra - desconto);
			System.out.print("Voc� vai pagar: " + precoPagar);
		} else if (formaDePagamento == 2) {
			desconto = (valorTotalDaCompra * 10) / 100;
			precoPagar = (valorTotalDaCompra + desconto);
			System.out.print("Voc� vai pagar: " + precoPagar);
		} else if (formaDePagamento == 3) {
			desconto = (valorTotalDaCompra * 15) / 100;
			precoPagar = (valorTotalDaCompra + desconto);
			double parcela = (precoPagar / 2);
			System.out.print("Voc� vai pagar: " + precoPagar + "\nSendo em duas parcelas iguais de: " + parcela);
		}
	}

	public static void notaFiscal() {
		// cabecalho();
		System.out.print("\n===============================================================================\n");
		System.out.print("NOTA FISCAL");
		System.out.print("\n===============================================================================\n");
		carrinho();
		System.out.print("\n");
		System.out.print("\n===============================================================================\n");
		System.out.print("\nValor da compra: " + precoPagar + "\n\n");
	}
}
