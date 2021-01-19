package PrimeiraSemana;



public class TrocadeVariaveis {

	public static void main(String[] args) {
		
		//declaração de variaveis 
		 int y = 99; 
		 int z = 11; 
		 int x = 0; //variavel auxiliar para fazer a troca de valores
		 
		 System.out.println("O valor de Y é:" + y);
		 System.out.println("O valor de Z é:" + z);
		  
		 x = y;
		 y = z;
		 z = x;
		 
		 System.out.println("O valor de troca de Y é:" + y);
		 System.out.println("O valor de troca de Z é:" + z);
	}

}
