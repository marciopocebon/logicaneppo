package br.com.testesneppo.entidades;

public class Formula {
	
	public static String aplicarFormula(long valor){
		
		int conv = (int) valor;
		String desc = "";
		
		
		
		switch(conv){
			case 1:
				desc = "1 algarismo igual a 1";
				break;
			
			case 11:
				desc = "2 algarismos igual a 1";
				break;
			
			case 21:
				desc = "1 algarismo igual a 2 e 1 algarismo igual a 1";
				break;
			
			case 1211:
				desc = "1 algarismo igual a 1, 1 algarismo igual a 2, e 2 algarismos iguais a 1";
				break;
				
			case 111221:
				desc = "3 algarismos iguais a 1, 2 algarismos iguais a 2 e 1 algarismo igual a 1  ";				
				break;
				
			default:
					desc = "Valor não se encontra na coluna de entrada!";
					break;
		}
	
		return desc;
	}
	
	
	// Percorre a descricao e devolve resposta
			 public static long verificaNuns(String str) {
			        String saida = "";
				  
			        for (int i = 0; i < str.length(); i++) {
			            //Se o digito for diferente de um digito, retorna falso.
			            if (Character.isDigit(str.charAt(i)))
			                saida+= str.charAt(i);
			        }
			        Long l1 = Long.parseUnsignedLong(saida);
			        
			         return l1;
			    }
	
	
	
}
