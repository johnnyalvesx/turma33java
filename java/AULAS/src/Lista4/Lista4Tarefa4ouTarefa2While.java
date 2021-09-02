package Lista4;

import java.util.Scanner;

/* 4 - Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
 *  psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das
 *   pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), 
 *   e as op��es (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se 
 *   a pessoa era agressiva). Pede-se para elaborar um sistema que permita 
 *   ler os dados de 150 pessoas, calcule e mostre: (WHILE)
*/
public class Lista4Tarefa4ouTarefa2While {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade, sexo, personalidade, x=1;
		int pessoasCalmas=0, mulheresNervosas=0, homensAgressivos=0, outrosCalmos=0, nervoso40=0, calma18=0;
		
		while(x<=150) {
			System.out.println("----------------------");
			System.out.println("Pessoa "+ x);

			System.out.println("Qual a sua idade? ");
			idade = leia.nextInt();
			while(idade<0) {
				System.out.println("Entrada inv�lida, verifique e tente novamente.");
				idade = leia.nextInt();

			}
			
			System.out.println("Qual seu sexo?\n1- Feminino\n2-Masculino\n3-Outro");
			sexo = leia.nextInt();
			while(sexo!=1 && sexo != 2 && sexo!=3) {
				System.out.println("Entrada inv�lida, verifique e tente novamente.");
				sexo = leia.nextInt();
			}
			
			System.out.println("Escolha sua personalidade:\n1-Pessoa Calma\n2-Pessoa Nervosa\n3-Pessoa Agressiva");
			personalidade = leia.nextInt();
			while(personalidade!=1 && personalidade!= 2 && personalidade!=3) {
				System.out.println("Entrada inv�lida, verifique e tente novamente.");
				personalidade = leia.nextInt();
			}
			
			if(personalidade == 1) {pessoasCalmas++;}
			if(sexo == 1 && personalidade == 2) {mulheresNervosas++;}
			if(sexo == 2 && personalidade == 3) {homensAgressivos++;}
			if(sexo == 3 && personalidade == 1) {outrosCalmos++;}
			if(idade > 40 && personalidade == 2) {nervoso40++;}
			if(idade<18 && personalidade == 1) {calma18++;}
			x++;
		}
		System.out.println("N�mero de pessoas calmas" + pessoasCalmas);
		System.out.println("N�mero de mulheres nervosas" + mulheresNervosas);
		System.out.println("N�mero de homens agressivos" + homensAgressivos);
		System.out.println("N�mero de outros calmos" + outrosCalmos);
		System.out.println("N�mero de pessoas com mais de 40 anos, nervosas" + nervoso40);
		System.out.println("N�mero de pessoas com menos de 18 anos, calmas" + calma18);

	}

}