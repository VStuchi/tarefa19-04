package ViniciusLicao;

public class Conta {
	
	public String agencia;
	public String codigo;
	public String dataCriacao;
	public Pessoa titular;
	public String senha;
	public double saldo;
	
	public Conta(String agencia, String codigo, String dataCriacao, Pessoa titular, String senha, double saldo)
	{
		this.agencia = agencia;
		this.codigo = codigo;
		this.dataCriacao = dataCriacao;
		this.titular = titular;
		this.senha = senha;
		this.saldo = saldo;
	}
	
	/**
	 * método retirar 
	 * saca uma quantia se disponível
	 */
	public void retirar(double quantia)
	{
		if(quantia > 0) {
			this.saldo -= quantia;
		}
		else
		{
			System.out.println("Quantia maior que o saldo de: " + this.saldo);
		}
		
	}
	
	/**
	 *  método depositar
	 *  aumenta o saldo
	 */
	public void depositar(double quantia) 
	{
		if(quantia > 0) {
			this.saldo += quantia;
		}
	}
	
	//exibe o saldo
	public void obterSaldo()
	{
		System.out.println("Saldo: " + this.saldo);
	}

}