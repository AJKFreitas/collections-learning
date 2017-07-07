package objetos;

public class Conta {

	private Integer numeroConta;
	private int digito;
	private String nomeBanco;
	
	
	
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + digito;
		result = prime * result + ((nomeBanco == null) ? 0 : nomeBanco.hashCode());
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
		if (digito != other.digito)
			return false;
		if (nomeBanco == null) {
			if (other.nomeBanco != null)
				return false;
		} else if (!nomeBanco.equals(other.nomeBanco))
			return false;
		return true;
	}
	
	
}
