package PrimeiraSemana;
 import java.util.Scanner;
public class OperacoesMatematicas {

	public static void main(String[] args) {
		/// 5. Escreva um algoritmo em Java que seja capaz de fazer as seguintes opera��es matem�ticas (adi��o, subtra��o, multiplica��o e divis�o). Todas as opera��es ser�o entre dois valores. No come�o do algoritmo pergunte ao usu�rio qual opera��o ele deseja fazer e quais s�o os valores.

	      // a, s, m, d

	      Scanner in = new Scanner(System.in);

	      System.out.println("Digite a opera��o que deseja fazer (a, s, m, d)");
	      String operacao = in.next();

	      System.out.println("Digite o primeiro valor");
	      int valor1 = in.nextInt();

	      System.out.println("Digite o segundo valor");
	      int valor2 = in.nextInt();


	      switch(operacao) {
	        case "a":
	          int soma = valor1 + valor2;
	          System.out.println("A soma entre os valores �: " + soma);
	          break;
	        case "s":
	          int subtracao = valor1 - valor2;
	          System.out.println("A subtra��o entre os valores �: " + subtracao);
	          break;
	        case "m":
	          int multiplicacao = valor1 * valor2;
	          System.out.println("A multiplica��o entre os valores �: " + multiplicacao);
	          break;
	        case "d":
	          if (valor2 == 0) {
	            System.out.println("N�o se pode dividir por 0");
	          } else {
	            double divisao = valor1 / (double) valor2;
	            System.out.println("A divis�o entre os valores �: " + divisao);
	          }
	          break;
	        default:
	          System.out.println("Opera��o n�o encontrada");
	      }
	      in.close();

	}

}
