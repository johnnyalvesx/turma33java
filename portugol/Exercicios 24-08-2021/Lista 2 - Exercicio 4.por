programa
{
//4) Faça um sistema que leia um número inteiro e mostre uma 
//mensagem indicando se este número é par ou ímpar, 
//e se é positivo ou negativo.

	inclua biblioteca Matematica --> Mat
	funcao inicio()
	{
		inteiro numero

			escreva("Digite o número: ")
			leia(numero)

			se (numero == 0) {
			escreva("Neutro")
			}
			se (numero < 0) {
			escreva("O número é negativo")
			}
			senao se (numero > 0) {
			escreva("O número é positivo")
			}
			se (numero % 2 == 0) {
			escreva(" e par.")
			}
			senao se (numero % 2 != 0) {
			escreva(" e ímpar.")
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 574; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */