package ViniciusLicao;

public class Main {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("01","Vinicius", 1.75, 23, "17/06/2000", "Superior", 2000);
		
		Conta c1 = new Conta("02", "003", "17/02/2016", p1, "Senha", 4000);
		
		ContaCorrente cc1 = new ContaCorrente("02", "004", "12/07/2018", p1, "Senha", 5000, 1000);
		
		System.out.println(cc1);
		
			
	}
}