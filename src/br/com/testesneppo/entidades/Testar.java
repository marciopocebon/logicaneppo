package br.com.testesneppo.entidades;

public class Testar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long  a= verificaNuns("1 algarismo igual a 1, 1 algarismo igual a 2, e 2 algarismos iguais a 1");
		System.out.println(a);
	}
	
	public static Long verificaNuns(String str) {
        long saida = 0l;
	 	String resp = "";
        
        for (int i = 0; i < str.length(); i++) {
            //Se o digito for diferente de um digito, retorna falso.
            if (Character.isDigit(str.charAt(i))){
            	resp+=str.charAt(i);
            }
               
        }
        saida = Long.parseLong(resp); // converte str em long
        
         return saida;
    }

}
