package ViniciusLicao;

public class ContaCorrente extends Conta {

	public double limite;
	
	public ContaCorrente(String agencia, String codigo, String dataCriacao, Pessoa titular, String senha,
			double saldo, double limite) 
	{
		super(agencia, codigo, dataCriacao, titular, senha, saldo);
		this.limite = limite;
	}

	@Override
	public void retirar(double quantia)
	{
		//imposto sobre movimentação financeira
        double cpmf = 0.05;


        if((this.saldo + this.limite) >= quantia)
        {
        	System.out.println("Retirada na conta corrente permitida!");
            // executa método da classe-pai
            super.retirar(quantia * cpmf);
        }
        else
        {
            System.out.println( "retirada não permitida... ");
            
        }
	}
}