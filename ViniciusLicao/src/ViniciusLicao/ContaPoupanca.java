package ViniciusLicao;

public class ContaPoupanca extends Conta{

	public String aniversario;
	
	public ContaPoupanca(String agencia, String codigo, String dataCriacao, Pessoa titular, String senha,
			double saldo, String aniversario) 
	{
		super(agencia, codigo, dataCriacao, titular, senha, saldo);
		this.aniversario = aniversario;
	}
	
	@Override
	public void retirar(double quantia)
	{
		
        if(this.saldo >= quantia)
        {
        	System.out.println("Retirada na poupança permitida!");
            // executa método da classe-pai
            super.retirar(quantia);
        }
        else
        {
            System.out.println( "retirada não permitida... ");
            
        }
	}

}