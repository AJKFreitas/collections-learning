package objetos;

import utils.SaldoInsuficienteException;
import utils.ValorAcimaDoLimiteException;

public class Conta implements Comparable<Conta> {

	private Integer numeroConta;
	private int digito;
	private String nomeBanco;
	private Integer saldo;
	private int limite;
	String[] nomes = new String[1];

	public Conta() {
		super();
	}

	public Conta(Integer numeroConta, int digito, String nomeBanco) {
		super();
		this.numeroConta = numeroConta;
		this.digito = digito;
		this.nomeBanco = nomeBanco;
	}

	public Conta(Integer numeroConta, int digito) {
		super();
		this.numeroConta = numeroConta;
		this.digito = digito;
	}

	public Conta(int x) {
		this.digito = x;
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getDigito() {
		return digito;
	}

	public void setDigito(int digito) {
		this.digito = digito;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public void depositar(Integer i) {
		this.saldo = +i;
	}

	public void saca(int valor) throws SaldoInsuficienteException {
		if (valor > this.saldo) {
			throw new SaldoInsuficienteException("Saldo Insuficiente!");
		}
		if (valor > limite) {
			throw new ValorAcimaDoLimiteException("Valor acima do limite permitido");
		}
		this.saldo -= valor;

	}

	public void setLimite(int i) {
		this.limite = i;

	}

	public Integer getSaldo() {
		return saldo;
	}

	public void setSaldo(Integer saldo) {
		this.saldo = saldo;
	}

	public int getLimite() {
		return limite;
	}
	@Override
	public String toString() {
		
		return this.nomeBanco + " Numero :" + this.numeroConta.toString() + " - " +"Dígito :" + this.digito+ "\n"+nomes[0];
	}
	
	@Override
	public int compareTo(Conta o) {
		return Integer.compare(numeroConta, o.numeroConta);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroConta == null) ? 0 : numeroConta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numeroConta == null) {
			if (other.numeroConta != null)
				return false;
		} else if (!numeroConta.equals(other.numeroConta))
			return false;
		return true;
	}

	
}
